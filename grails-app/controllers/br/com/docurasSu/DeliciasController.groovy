package br.com.docurasSu

class DeliciasController {

    def index() { 
		//params['produtos'] = []
		params['produtos'] = Produto.findAll {}
	}
}
