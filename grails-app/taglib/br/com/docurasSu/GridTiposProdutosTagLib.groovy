package br.com.docurasSu

import groovy.xml.MarkupBuilder

class GridTiposProdutosTagLib {
	
	def imagemService
	
	def tipoProdutoService
	
	def gridTiposPromocoes = {attrs, body ->

		MarkupBuilder b = new MarkupBuilder(out)
		
		b.div('class': "grid", style:"width: 67%; margin: 0px auto 20px;"){
			b.div('class': "row"){
				for(def tipo: tipoProdutoService.tipos){
					b.a(href: "docuras?tipo=${tipo.key}"){
						b.div('class': "tile icon bg-color-pinkLight tile-pinkLight"){
							b.b 'class': "check", ""
							b.div('class': "tile-content"){
								mkp.yieldUnescaped(g.imagemTipoProduto(nomeArquivoImagem: tipo.value[1]))
							}
							b.div('class': "brand"){
								b.span('class': "name fg-color-red", "${tipo.value[0]}")
							}
						}
					}
				}
			}
		}		
	}
}
