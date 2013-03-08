package br.com.docurasSu

import groovy.xml.MarkupBuilder

class ProdutoImageCollectionTagLib {

	def imagemService
	
	def grailsLinkGenerator
	
	def produtoImageCollection = {attrs, body ->
		
		MarkupBuilder builder = new MarkupBuilder(out)
		
		builder.div("class": "image-collection"){
			builder.div("class": "tile image", style: "width:460px; height:300px;"){
				builder.a(){
					builder.img("id": "imgPrincipal", src: g.createLinkTo(dir: imagemService.getCaminhoImagemAmbiente(attrs.produto.nomeDiretorioImagens), file: attrs.produto.nomeArquivoImagemPrincipal))
				}
			}
		}
		
		builder.div("id": "Gallery", "class": "image-collection"){
			for(def imagem: attrs.produto.imagens){
				def linkImagem = g.createLinkTo(dir: imagemService.getCaminhoImagemAmbiente(attrs.produto.nomeDiretorioImagens), file: imagem.nomeArquivo)
				builder.div("class": "tile image", style: "width:110px; height:62px;"){
					builder.a(href: linkImagem, onmouseover: "trocarImagemPrincipal('${linkImagem}');"){
						builder.img(src: g.createLinkTo(dir: imagemService.getCaminhoImagemAmbiente(attrs.produto.nomeDiretorioImagens), file: imagem.nomeArquivoThumbnail))
					}
				}
			}
		}
	}
}