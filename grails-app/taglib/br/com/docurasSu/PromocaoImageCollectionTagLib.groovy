package br.com.docurasSu

import groovy.xml.MarkupBuilder

class PromocaoImageCollectionTagLib {

	def imagemService
	
	def grailsLinkGenerator
	
	def promocaoImageCollection = {attrs, body ->
		
		MarkupBuilder b = new MarkupBuilder(out)
		
		b.div("class": "image-collection"){
			b.div("class": "tile image", style: "width:460px; height:300px;"){
				b.a(){
					b.img("id": "imgPrincipal", src: g.createLinkTo(dir: imagemService.getCaminhoImagemPromocaoAmbiente(attrs.promocao.nomeDiretorioImagens), file: attrs.promocao.nomeArquivoImagemPrincipal))
				}
			}
		}
		
		if(attrs.promocao.imagens){
			b.div("id": "Gallery", "class": "image-collection"){
				for(def imagem: attrs.promocao.imagens){
					def linkImagem = g.createLinkTo(dir: imagemService.getCaminhoImagemPromocaoAmbiente(attrs.promocao.nomeDiretorioImagens), file: imagem.nomeArquivo)
					b.div("class": "tile image", style: "width:110px; height:62px;"){
						b.a(href: linkImagem, onmouseover: "trocarImagemPrincipal('${linkImagem}');"){
							b.img(src: g.createLinkTo(dir: imagemService.getCaminhoImagemPromocaoAmbiente(attrs.promocao.nomeDiretorioImagens), file: imagem.nomeArquivoThumbnail))
						}
					}
				}
			}
		}
	}
}
