package br.com.docurasSu

class CarroselPromocoesTagLib {
	
	ImagemService imagemService; 
	
	def carroselPromocoes = {attrs, body ->
		if(attrs.promocoes.size() == 0){
			out << "Não há promoções cadastradas... :'-{"
			return
		}
		
		out << "<div class='carousel span7' data-role='carousel' data-param-auto='false' data-param-effect='fade' style='height: 300px;'><div class='slides'>"
		
		int i = 1
				
		for(promocao in attrs.promocoes){
			out << "<div class='slide image' id='slide${i}' style='display: block;'>"
			out << "<img src='${imagemService.getCaminhoImagemPromocaoAmbiente(promocao.nomeDiretorioImagens) + promocao.nomeArquivoImagemPrincipal}'>"
			out << "<div class='description'>${promocao.descricao}</div>"
			out << "</div>"
		}
				
		out << "</div><span class='control left'>&#8249;</span> <span class='control right'>&#8250;</span></div>"
		
	}
}
