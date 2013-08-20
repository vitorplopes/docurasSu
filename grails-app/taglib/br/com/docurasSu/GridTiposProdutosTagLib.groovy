package br.com.docurasSu

import groovy.xml.MarkupBuilder

class GridTiposProdutosTagLib {
	
	def imagemService
	
	def tipoProdutoService
	
	def gridTiposPromocoes = {attrs, body ->

		MarkupBuilder b = new MarkupBuilder(out)
		
		//b.div('class': "grid", style:"width: 56%; margin: 0px auto 20px;"){
		
		
		/*
		 b.div('class': "grid", style:""){
			b.div('class': "row", style:"width:100%;"){
				b.div(style:"width:56%; margin:auto;"){
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
		 */
		
		/*
		b.div('class': "grid"){
			b.div('class': "row"){
				for(def tipo: tipoProdutoService.tipos){
					//b.a(href: "docuras?tipo=${tipo.key}"){
						b.div('class': "span3 icon bg-color-pinkLight"){
							b.h2('class': "fg-color-white"){
								mkp.yieldUnescaped(tipo.value[1])
							}
							//mkp.yieldUnescaped(g.imagemTipoProduto(nomeArquivoImagem: tipo.value[1], 'class': "place-right"))
						}
					//}
				}
			}
		}
		*/
		
		b.div('class': "grid"){
			b.div('class': "row"){
				b.div('class': "span4 bg-color-pinkLight"){
					b.a(href: "docuras?tipo=${tipoProdutoService.tipos.get('B')[0]}"){
						b.h2('class': "tile-pinkLight", style: "padding-left: 20px;"){
							mkp.yieldUnescaped(tipoProdutoService.tipos.get('B')[0])
						}
						mkp.yieldUnescaped(g.imagemTipoProduto(nomeArquivoImagem: tipoProdutoService.tipos.get('B')[1], 'class': "place-right", style: "margin:10px;"))
					}
				}
				b.div('class': "span3 bg-color-pinkLight"){
					b.a(href: "docuras?tipo=${tipoProdutoService.tipos.get('C')[0]}"){
						b.h2('class': "tile-pinkLight", style: "padding-left: 20px;"){
							mkp.yieldUnescaped(tipoProdutoService.tipos.get('C')[0])
						}
						mkp.yieldUnescaped(g.imagemTipoProduto(nomeArquivoImagem: tipoProdutoService.tipos.get('C')[1], 'class': "place-right", style: "margin:10px;"))
					}
				}
				b.div('class': "span4 bg-color-pinkLight"){
					b.a(href: "docuras?tipo=${tipoProdutoService.tipos.get('D')[0]}"){
						b.h2('class': "tile-pinkLight", style: "padding-left: 20px;"){
							mkp.yieldUnescaped(tipoProdutoService.tipos.get('D')[0])
						}
						mkp.yieldUnescaped(g.imagemTipoProduto(nomeArquivoImagem: tipoProdutoService.tipos.get('D')[1], 'class': "place-right", style: "margin:10px;"))
					}
				}	
			}
		}
	}
}
