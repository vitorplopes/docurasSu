package br.com.docurasSu

class HomeController {
	
	def index() { 
		params['ultimosProdutos'] = Produto.list(offset:0, max:6, sort:"dateCreated", order:"desc")
	}
}
