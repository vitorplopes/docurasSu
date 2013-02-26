package br.com.docurasSu

class PaginacaoGridProdutosTagLib {
	
	def paginacaoGridProdutos = {attrs, body ->
		if(attrs.produtos.size() > 0){
			out << "<div id='paginacaoSuperior' class='jPaginate' style='padding-left: 77px;'></div>"
			return
		}
	}
}
