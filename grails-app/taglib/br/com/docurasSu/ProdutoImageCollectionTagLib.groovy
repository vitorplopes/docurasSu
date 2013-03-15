package br.com.docurasSu

import groovy.xml.MarkupBuilder

class ProdutoImageCollectionTagLib {

	def imagemService
	
	def produtoImageCollection = {attrs, body ->
		
		MarkupBuilder b = new MarkupBuilder(out)
		
		b.div("class": "image-collection"){
			b.div("class": "tile image", style: "width:460px; height:300px;"){
				b.a(){
					mkp.yieldUnescaped(g.imagemProduto("id": "imgPrincipal", nomeDiretorioImagens: attrs.produto.nomeDiretorioImagens, nomeArquivoImagem: attrs.produto.nomeArquivoImagemPrincipal))
				}
			}
		}
		
		if(attrs.produto.quantidadeImagens){
			b.div("id": "Gallery", "class": "image-collection"){
				for(int i = 1; i <= attrs.produto.quantidadeImagens; i++){
					def linkImagem = g.createLinkTo(dir: imagemService.getCaminhoImagemProduto(attrs.produto.nomeDiretorioImagens), file: imagemService.getNomeArquivoImagemProduto(i, attrs.produto))
					b.div("class": "tile image", style: "width:110px; height:62px;"){
						b.a(href: linkImagem, onmouseover: "trocarImagemPrincipal('${linkImagem}');"){
							mkp.yieldUnescaped(g.imagemProduto(nomeDiretorioImagens: attrs.produto.nomeDiretorioImagens, nomeArquivoImagem: imagemService.getNomeArquivoImagemThumbnailProduto(i, attrs.produto)))
						}
					}
				}
			}
		}
	}
}