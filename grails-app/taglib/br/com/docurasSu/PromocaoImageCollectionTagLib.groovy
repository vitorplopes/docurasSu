package br.com.docurasSu

import groovy.xml.MarkupBuilder

class PromocaoImageCollectionTagLib {

	def imagemService
	
	def promocaoImageCollection = {attrs, body ->
		
		MarkupBuilder b = new MarkupBuilder(out)
		
		b.div("class": "image-collection"){
			b.div("class": "tile image", style: "width:460px; height:300px;"){
				b.a(){
					mkp.yieldUnescaped(g.imagemPromocao("id": "imgPrincipal", nomeDiretorioImagens: attrs.promocao.nomeDiretorioImagens, nomeArquivoImagem: attrs.promocao.nomeArquivoImagemPrincipal))
				}
			}
		}
		
		if(attrs.promocao.quantidadeImagens){
			b.div("id": "Gallery", "class": "image-collection"){
				for(int i = 1; i <= attrs.promocao.quantidadeImagens; i++){
					def linkImagem = g.createLinkTo(dir: imagemService.getCaminhoImagemPromocaoAmbiente(attrs.promocao.nomeDiretorioImagens), file: imagemService.getNomeArquivoImagemPromocao(i, attrs.promocao))
					b.div("class": "tile image", style: "width:110px; height:62px;"){
						b.a(href: linkImagem, onmouseover: "trocarImagemPrincipal('${linkImagem}');"){
							mkp.yieldUnescaped(g.imagemPromocao(nomeDiretorioImagens: attrs.promocao.nomeDiretorioImagens, nomeArquivoImagem: imagemService.getNomeArquivoImagemPromocao(i, attrs.promocao)))
						}
					}
				}
			}
		}
	}
}
