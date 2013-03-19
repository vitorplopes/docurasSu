package br.com.docurasSu

import groovy.xml.MarkupBuilder;

class GridPromocoesTagLib {
	
	def imagemService
	
	def grailsLinkGenerator
	
	def gridPromocoes = {attrs, body ->
		
		MarkupBuilder b = new MarkupBuilder(out)
		
		b.div('class': "grid"){
			b.div('class': "row"){
				b.div('class': "tile double image-slider", 'data-role': "tile-slider"){
					b.div('class': "tile-content"){
						mkp.yieldUnescaped(g.img(dir:"images/produtos/Bolo_flamengo", file:"Bolo_flamengo_1.jpg"))
					}
					b.div('class': "tile-content"){
						mkp.yieldUnescaped(g.img(dir:"images/produtos/Bem_vivido_rosa", file:"Bem_vivido_rosa_1.jpg"))
					}
				}
				
				b.div('class': "tile double bg-color-pinkLight tile-pinkLight", style:"margin-left: 5px; margin-right:15px;"){
					b.div('class': "tile-content"){
						b.img('class': "place-right", src: "images/site/Untitled.png")
						b.h3('class': "fg-color-red", style: "margin-bottom: 5px;"){
							mkp.yieldUnescaped("Fa&#231;a j&#225; sua encomenda!")
						}
						b.h4('class': "fg-color-darken padding10"){
							mkp.yield("(21) 9683-4778")
						}
						b.h4('class': "fg-color-darken padding10"){
							mkp.yield("(21) 3835-5069")
						}
						b.h4('class': "fg-color-darken padding10"){
							mkp.yield("docurasdasu1@gmail.com")
						}
						b.div('class':"brand"){
							b.h5('class': "name fg-color-red", style:"float:right;position:relative;margin-right:15px;"){
								mkp.yield("Contato")
							}
						}
					}
				}
				
				b.div('class': "tile double image-slider", 'data-role': "tile-slider", style:"margin-right: 0px;"){
					b.div('class': "tile-content"){
						mkp.yieldUnescaped(g.img(dir:"images/produtos/Bolo_flamengo", file:"Bolo_flamengo_1.jpg"))
					}
					b.div('class': "tile-content"){
						mkp.yieldUnescaped(g.img(dir:"images/produtos/Bem_vivido_rosa", file:"Bem_vivido_rosa_1.jpg"))
					}
				}
			}
		}
	}
	
	def gridPromocoesSimples = {attrs, body ->
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
