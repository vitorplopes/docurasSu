package br.com.docurasSu

class TipoProdutoService {

	static tipos = [	
		'B':["Bolos", "cake_01.png"],
		'C':["Cupcakes", "choco_cupcake.png"],
		'T':["Tortas", "cake_02.png"],
		'D':["Docinhos", "docinhos_01.png"]
	]
	
    def getNomeTipo(char tipo) {
		switch(tipo){
			case 'B':
				tipos.get('B')[0]
			case 'C':
				tipos.get('C')[0]
			case 'T':
				tipos.get('T')[0]
			case 'D':
				tipos.get('D')[0]
			default:
				""
		}
    }
	
	def getNomeArquivoTipo(char tipo) {
		switch(tipo){
			case 'B':
				tipos.get('B')[1]
				break
			case 'C':
				tipos.get('C')[1]
				break
			case 'T':
				tipos.get('T')[1]
				break
			default:
				tipos.get('D')[1]
				break
		}
	}
}
