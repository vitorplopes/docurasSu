package br.com.docurasSu


class GridProdutosTagLib {
	
	def gridProdutos = {attrs, body ->
		if(attrs.produtos.size() == 0){
			out << "Não há delícias cadastradas... :'-{"
			return
		}
		
		out << "<div id='divProdutosImageCollection' class='image-collection' style='padding: 10px; width: 90%; margin: auto;'>"
		
		for(produto in attrs.produtos){
			out << "<div class='tile image shadow'>"
			out << g.itemGridProdutos(produto:produto)
			out << "</div>"
		}
		
		out << "</div>"
		
	}	
}