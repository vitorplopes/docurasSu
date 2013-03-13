package br.com.docurasSu

import grails.converters.JSON;

class DocurasController {

    def index(Character tipo) { 
		[produtos: getProdutos(tipo, params.max, params.offset), 
		qtdPaginas: Math.round(Produto.count() / 14),
		ultimasPromocoes: Promocao.findAllByValida(true, [sort:"dateCreated", order:"desc", max: 4])]
	}
	
	def pagina(String tipo){
		render(template: "gridProdutos", bean: getProdutos(tipo, params.max, params.offset))
	}
	
	def ver(Long id){
		def produto = Produto.get(id)
		if(!produto){
			flash.message = message(code: 'docurasController.list.deliciaNaoEncontrada')
			redirect(action: "docuras")
			return
		}
		[produto: produto]
	}

	private def getProdutos(def tipo, def max, def offset){
		if(tipo){
			Produto.findAllByTipo(tipo, [max: 15, offset: params.offset])
		}
		else{
			Produto.findAll([max: 15, offset: params.offset])
		}
	}
}
