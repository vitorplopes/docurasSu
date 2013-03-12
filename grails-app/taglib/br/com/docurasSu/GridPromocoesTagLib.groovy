package br.com.docurasSu

import groovy.xml.MarkupBuilder;

class GridPromocoesTagLib {
	
	def imagemService
	
	def gridPromocoes = {attrs, body ->
		if(attrs.promocoes.size() == 0){
			out << "Não há promoções cadastradas... :'-{"
			return
		}
		
		MarkupBuilder b = new MarkupBuilder(out)
		
		for(def promocao: attrs.promocoes){
			b.a(href: "/DocurasSu/promocao/show/${promocao.id}"){
				b.div('class': "tile image"){
					b.img(src: g.createLinkTo(dir: imagemService.getCaminhoImagemPromocaoAmbiente(promocao.nomeDiretorioImagens), file: promocao.nomeArquivoImagemReduzida))
				}
			}
		}
	}
}
