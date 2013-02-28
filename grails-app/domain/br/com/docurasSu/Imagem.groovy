package br.com.docurasSu

class Imagem {

	String nome
	String descricao
	String nomeArquivo
	String nomeArquivoThumbnail
	
    static constraints = {
		nomeArquivoThumbnail nullable: true
    }
}
