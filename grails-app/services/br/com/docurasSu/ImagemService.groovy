package br.com.docurasSu

class ImagemService {

    String getCaminhoImagemProdutoAmbiente(String nomeDiretorioImagem) {
		"images/produtos/" + nomeDiretorioImagem + "/"
    }
	
	String getCaminhoImagemPromocaoAmbiente(String nomeDiretorioImagem) {
		if(nomeDiretorioImagem){
			"images/promocoes/"
		}
		else{
			"images/promocoes/" + nomeDiretorioImagem + "/"
		}
	}
}
