package br.com.docurasSu

class CarroselPromocoesTagLib {

	def carroselPromocoes = {attrs, body ->
		if(attrs.produtos.size() == 0){
			out << "Não há delícias cadastradas... :'-{"
			return
		}
		
		out << """<div id="divProdutosImageCollection" class="image-collection" style="padding: 10px; text-align: center;">"""
		
		for(produto in attrs.produtos){
			out << "<div class='tile image shadow'>"
			out << g.itemGridProdutos(produto:produto)
			out << "</div>"
		}
		
		out << "</div>"
		
	}
}
