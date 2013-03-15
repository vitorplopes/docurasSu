package br.com.docurasSu

import groovy.xml.MarkupBuilder

class ItemGridProdutosTagLib {

	def imagemService
	
	def grailsLinkGenerator
	
	def itemGridProdutos = {attrs, body ->
		
		MarkupBuilder builder = new MarkupBuilder(out)
		
		builder.a(href: grailsLinkGenerator.link(controller: "docuras", action: "ver", id: attrs.produto.id)){
			mkp.yieldUnescaped(g.imagemProduto(nomeDiretorioImagens: attrs.produto.nomeDiretorioImagens, nomeArquivoImagem: attrs.produto.nomeArquivoImagemPrincipalThumbnail))
		}
	
		builder.div 'class': 'overlay', "${attrs.produto.resumo}"
	}
}
