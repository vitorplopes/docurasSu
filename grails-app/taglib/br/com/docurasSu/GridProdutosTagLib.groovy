package br.com.docurasSu

class GridProdutosTagLib {

	def gridProdutos = {attrs, body ->
		if(attrs.produtos.size() == 0){
			out << "Não há delícias cadastradas... :'-{"
			return
		}
		
		out << """<div id="divProdutosImageCollection" class="image-collection" style="padding: 10px; text-align: center;">"""
		
		for(produto in attrs.produtos){
			out << """<div class='tile image shadow'>
						  <img src='${createLinkTo(dir: 'images', file: produto.nomeArquivoImagem)}' />
						  <div class="overlay">
						  	${produto.resumo}
						  </div>
					</div>"""
		}
		
		out << "</div>"
		
	}
	
}
