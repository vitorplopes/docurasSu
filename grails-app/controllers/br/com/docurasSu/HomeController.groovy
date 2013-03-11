package br.com.docurasSu

class HomeController {
	
	def index() { 
		[ultimosProdutos: Produto.list(offset:0, max:6, sort:"dateCreated", order:"desc"),
		promocoes: Promocao.findAllByValida(true, [sort:"dateCreated", order:"desc"])]
	}
}
