package br.com.docurasSu

import groovy.xml.MarkupBuilder

class GridTiposProdutosTagLib {
	
	def imagemService
	
	def gridTiposPromocoes = {attrs, body ->

		MarkupBuilder b = new MarkupBuilder(out)
		
		def tipos = [	'B':["Bolos", "images/cake_01.png"], 
						'C':["Cupcakes", "images/choco_cupcake.png"], 
						'T':["Tortas", "images/cake_02.png"], 
						'D':["Docinhos", "images/docinhos_01.png"]]
		
		for(def tipo: tipos){
			b.a(href: "docuras?tipo=${tipo.key}"){
				b.div('class': "tile icon bg-color-pinkLight tile-pinkLight"){
					b.b 'class': "check", ""
					b.div('class': "tile-content"){
						b.img(src: tipo.value[1])
					}
					b.div('class': "brand"){
						b.span('class': "name fg-color-red", "${tipo.value[0]}")
					}
				}
			}
		}
	}
}
