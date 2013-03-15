package br.com.docurasSu

import groovy.xml.MarkupBuilder;

class GridPromocoesTagLib {
	
	def imagemService
	
	def grailsLinkGenerator
	
	def gridPromocoes = {attrs, body ->
		if(attrs.promocoes.size() == 0){
			out << "Não há promoções cadastradas... :'-{"
			return
		}
		
		MarkupBuilder b = new MarkupBuilder(out)
		
		for(def promocao: attrs.promocoes){
			b.a(href: grailsLinkGenerator.link(controller:"promocoes", action: "ver", id: promocao.id)){
				b.div('class': "tile image"){
					mkp.yieldUnescaped(g.imagemPromocao(nomeDiretorioImagens: promocao.nomeDiretorioImagens, nomeArquivoImagem: promocao.nomeArquivoImagemSecundaria))
				}
			}
		}
	}
}
