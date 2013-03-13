package br.com.docurasSu

import groovy.xml.MarkupBuilder

class ItemGridProdutosTagLib {

	def imagemService
	
	def grailsLinkGenerator
	
	def itemGridProdutos = {attrs, body ->
		
		/*
		out << "<a href='${createLinkTo(dir: imagemService.getCaminhoImagemProdutoAmbiente(attrs.produto.nomeDiretorioImagens), file: attrs.produto.nomeArquivoImagemPrincipal)}'>"
		out << "<img src='${createLinkTo(dir: imagemService.getCaminhoImagemProdutoAmbiente(attrs.produto.nomeDiretorioImagens), file: attrs.produto.nomeArquivoImagemPrincipalThumbnail)}' />"
		out << "</a><div class='overlay'>${attrs.produto.resumo}</div>"*/
		
		/*def builder = new MarkupBuilder(out)
	
		builder.a(href: g.createLinkTo(dir: imagemService.getCaminhoImagemProdutoAmbiente(attrs.produto.nomeDiretorioImagens), file: attrs.produto.nomeArquivoImagemPrincipal)){
			builder.img(src: g.createLinkTo(dir: imagemService.getCaminhoImagemProdutoAmbiente(attrs.produto.nomeDiretorioImagens), file: attrs.produto.nomeArquivoImagemPrincipalThumbnail))
		}
		builder.div('class': 'overlay', "${attrs.produto.resumo})
		*/
		
		MarkupBuilder builder = new MarkupBuilder(out)
		
		builder.a(href: grailsLinkGenerator.link(controller: "docuras", action: "ver", id: attrs.produto.id)){
			builder.img(src: g.createLinkTo(dir: imagemService.getCaminhoImagemProdutoAmbiente(attrs.produto.nomeDiretorioImagens), file: attrs.produto.nomeArquivoImagemPrincipalThumbnail))
		}
	
		builder.div 'class': 'overlay', "${attrs.produto.resumo}"
	}
}
