package br.com.docurasSu

class CarroselProdutoTagLib {
	
	def grailsLinkGenerator
	
	def carroselProduto = {attrs, body ->
		if(attrs.produto.quantidadeImagens == 0){
			out << "Não há fotos para essa docura... :'-{"
			return
		}
		
		out << "<div class='flexslider'>"
		out << "<ul class='slides'>"
						
		for(int i = 1; i <= attrs.produto.quantidadeImagens; i++){
			out << "<li>"
			out << g.imagemProduto(nomeDiretorioImagens: attrs.produto.nomeDiretorioImagens, nomeArquivoImagem: attrs.produto.nomeArquivoImagemPrincipal)
			out << "</li>"
		}
				
		out << "</ul>"
		out << "</div>"
	}
}
