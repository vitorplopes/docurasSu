package br.com.docurasSu

import grails.converters.JSON;

class DocurasController {

    def index() { 
		params['produtos'] = Produto.findAll([max: 9, offset: 0]) {}
		params['qtdPaginas'] = Math.round(Produto.count() / 8)
	}
	
	def pagina(){
		//render Produto.findAll([max: 9, offset: params.offset]) {} as JSON
		def produtos = Produto.findAll([max: 9, offset: params.offset]) {}
		render(template: "gridProdutos", bean: produtos)
	}
	
	def ver(Long id){
		def produto = Produto.get(id)
		if(!produto){
			flash.message = message(code: 'docurasController.list.deliciaNaoEncontrada')
			redirect(action: "delicias")
			return
		}
		[produto: produto]
	}
}
