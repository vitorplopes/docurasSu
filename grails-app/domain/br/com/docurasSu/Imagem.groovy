package br.com.docurasSu

class Imagem {

	String nome
	String descricao
	String nomeArquivo
	String nomeArquivoThumbnail
	
    static constraints = {
		nome nullable: true
		descricao nullable: true
		nomeArquivoThumbnail nullable: true
    }
	
	static propriedadesExcluidasListaView = ["descricao", "nomeArquivoThumbnail"]
}
