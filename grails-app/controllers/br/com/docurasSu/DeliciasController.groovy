package br.com.docurasSu

import grails.converters.JSON;

class DeliciasController {

    def index(Character tipo) { 
		if(tipo){
			params['produtos'] = Produto.findAllByTipo(tipo, [max: 9, offset: params.offset])
		}
		else{
			params['produtos'] = Produto.findAll([max: 9, offset: params.offset])
		}
		params['qtdPaginas'] = Math.round(Produto.count() / 8)
	}
	
	def pagina(String tipo){
		if(tipo){
			def produtos = Produto.findAllByTipo(tipo.charAt(0), [max: 9, offset: params.offset])
			render(template: "gridProdutos", bean: produtos)
		}
		else{
			//render Produto.findAll([max: 9, offset: params.offset]) {} as JSON
			def produtos = Produto.findAll([max: 9, offset: params.offset])
			render(template: "gridProdutos", bean: produtos)
		}
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
