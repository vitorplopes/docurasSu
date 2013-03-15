package br.com.docurasSu

class ImagemService {
	
	static String prefixoURL = "http://dl.dropbox.com/u/144356318";
	
	String getNomeArquivoImagemProduto(int i, Produto produto){
		produto.nomeDiretorioImagens + "_${i}.jpg"
	}
	
	String getNomeArquivoImagemThumbnailProduto(int i, Produto produto){
		produto.nomeDiretorioImagens + "_thumb_${i}.jpg"
	}

	String getNomeArquivoImagemPromocao(int i, Promocao promocao){
		promocao.nomeDiretorioImagens + "_${i}.jpg"
	}
	
	String getNomeArquivoImagemThumbnailPromocao(int i, Promocao promocao){
		promocao.nomeDiretorioImagens + "_thumb_${i}.jpg"
	}

	def getCaminhoImagemPromocao = { String nomeDiretorioImagens ->
		if(nomeDiretorioImagens){
			"images/promocoes/${nomeDiretorioImagens}"
		}
		else{
			"images/promocoes"
		}
	}
	
	def getCaminhoImagemProduto = { String nomeDiretorioImagens ->
		if(nomeDiretorioImagens){
			"images/produtos/${nomeDiretorioImagens}"
		}
		else{
			"images/produtos"
		}
	}
	
	def getCaminhoImagemTipoProduto = { String nomeDiretorioImagens ->
		if(nomeDiretorioImagens){
			"images/tiposProdutos/${nomeDiretorioImagens}"
		}
		else{
			"images/tiposProdutos"
		}
	}
}
