package br.com.docurasSu

import groovy.xml.MarkupBuilder

class CarroselProdutoTagLib {
	
	def imagemService
	
	def grailsLinkGenerator
		
	def carroselProduto = {attrs, body ->
		if(attrs.produto.quantidadeImagens == 0){
			out << "Não há fotos para essa docura... :'-{"
			return
		}
		
		out << "<div class='flexslider'>"
		out << "<ul class='slides' onclick=\"\$('#Gallery div:first-child a').click();\">"
						
		for(int i = 1; i <= attrs.produto.quantidadeImagens; i++){
			
			def linkImagem;
			//def linkImagem = g.createLinkTo(dir: imagemService.getCaminhoImagemProduto(attrs.produto.nomeDiretorioImagens), file: imagemService.getNomeArquivoImagemThumbnailProduto(i, attrs.produto))
			
			out << "<li data-thumb=\"$linkImagem\">"
			out << g.imagemProduto(nomeDiretorioImagens: attrs.produto.nomeDiretorioImagens, nomeArquivoImagem: imagemService.getNomeArquivoImagemProduto(i,attrs.produto))
			out << "</li>"
		}
				
		out << "</ul>"
		out << "</div>"
		
		MarkupBuilder b = new MarkupBuilder(out)
		
		if(attrs.produto.quantidadeImagens){
			b.div("id": "Gallery", "class": "image-collection", "style": "display:none;"){
				
				for(int i = 1; i <= attrs.produto.quantidadeImagens; i++){
					
					def linkImagem = g.createLinkTo(dir: imagemService.getCaminhoImagemProduto(attrs.produto.nomeDiretorioImagens), file: imagemService.getNomeArquivoImagemProduto(i, attrs.produto))
					def nomeDiretorioImagens = attrs.produto.nomeDiretorioImagens
					def nomeArquivoImagem = imagemService.getNomeArquivoImagemThumbnailProduto(i, attrs.produto)
					def alt = attrs.produto.nome + " - " + attrs.produto.resumo;
					
					b.div("class": "tile image", style: "width:110px; height:62px;"){
						b.a(href: linkImagem){
							mkp.yieldUnescaped(g.imagemProduto(nomeDiretorioImagens: nomeDiretorioImagens, nomeArquivoImagem: nomeArquivoImagem, alt: alt))
						}
					}
				}
			}
		}
	}
}
