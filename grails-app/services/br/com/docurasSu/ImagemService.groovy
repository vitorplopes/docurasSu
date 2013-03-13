package br.com.docurasSu

class ImagemService {

	String getCaminhoImagemProdutoAmbiente(String nomeDiretorioImagem) {
		"images/produtos/${nomeDiretorioImagem}"
	}
	
    String getCaminhoImagemProdutoAmbiente(String nomeDiretorioImagem, String nomeArquivo) {
		"images/produtos/${nomeDiretorioImagem}/${nomeArquivo}"
    }
	
	String getCaminhoImagemPromocaoAmbiente(String nomeDiretorioImagem) {
		if(nomeDiretorioImagem){
			"images/promocoes/${nomeDiretorioImagem}"
		}
		else{
			"images/promocoes"
		}
	}
	
	String getCaminhoImagemPromocaoAmbiente(String nomeDiretorioImagem, String nomeArquivo) {
		if(nomeDiretorioImagem){
			"images/promocoes/${nomeDiretorioImagem}/${nomeArquivo}"
		}
		else{
			"images/promocoes/${nomeArquivo}"
		}
	}
	
	String getCaminhoImagemTipoProdutoAmbiente() {
		"images/tipos"
	}
	
	String getCaminhoImagemTipoProdutoAmbiente(String nomeArquivo) {
		"images/tipos/${nomeArquivo}"
	}
}
