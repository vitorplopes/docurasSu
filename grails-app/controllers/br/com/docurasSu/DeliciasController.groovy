package br.com.docurasSu

import grails.converters.JSON;

class DeliciasController {

    def index() { 
		params['produtos'] = Produto.findAll([max: 9, offset: 0]) {}
		params['qtdPaginas'] = Math.round(Produto.count() / 8)
	}
	
	def pagina(){
		//render Produto.findAll([max: 9, offset: params.offset]) {} as JSON
		def produtos = Produto.findAll([max: 9, offset: params.offset]) {}
		render(template: "gridProdutos", bean: produtos)
	}
}
