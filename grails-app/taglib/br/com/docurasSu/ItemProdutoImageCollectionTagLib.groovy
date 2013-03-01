package br.com.docurasSu

import groovy.xml.MarkupBuilder

class ItemProdutoImageCollectionTagLib {

	def imagemService
	
	def itemProdutoImageCollection = {attrs, body ->
		
		/*out << "<a href='${createLinkTo(dir: imagemService.getCaminhoImagemAmbiente(attrs.produto.nomeDiretorioImagens), file: attrs.produto.nomeArquivoImagemPrincipal)}'>"
		out << "<img src='${createLinkTo(dir: imagemService.getCaminhoImagemAmbiente(attrs.produto.nomeDiretorioImagens), file: attrs.produto.nomeArquivoImagemPrincipalThumbnail)}' />"
		out << "</a><div class='overlay'>${attrs.produto.resumo}</div>"*/
		
		def builder = new MarkupBuilder(out)
	
		builder.a(href: g.createLinkTo(dir: imagemService.getCaminhoImagemAmbiente(attrs.produto.nomeDiretorioImagens), file: attrs.produto.nomeArquivoImagemPrincipal)){
			builder.img(src: g.createLinkTo(dir: imagemService.getCaminhoImagemAmbiente(attrs.produto.nomeDiretorioImagens), file: attrs.produto.nomeArquivoImagemPrincipalThumbnail))
		}
		builder.div('class': 'overlay'){
			builder.yield attrs.produto.resumo
		}
	}
}
