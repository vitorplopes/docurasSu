package br.com.docurasSu

class TituloTipoProdutoTagLib {

	def tituloTipoProduto = {attrs, body ->
		if(!attrs.tipo){
			out << "Do&#231;uras da Su!"
			return
		}
		switch(attrs.tipo){
			case 'B':
				out << "Bolos"
				break
			case 'C':
				out << "Cupakes"
				break
			case 'T':
				out << "Tortas"
				break
			case 'D':
				out << "Docinhos"
				break
		}
	}
}
