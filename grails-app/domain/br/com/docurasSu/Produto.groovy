package br.com.docurasSu

import java.sql.Date;

class Produto {

	Date dateCreated
	char tipo
	String nome
	String resumo
	String descricao
	String preco
	String nomeDiretorioImagens
	int quantidadeImagens
	
	static mapping = {
		nome index: 'Produto_Nome_Idx'
		tipo index: 'Produto_Tipo_Idx'
	}
	
    static constraints = {
		preco blank: true, nullable: true
    }
	
	static transients = ["nomeArquivoImagemPrincipal", "nomeArquivoImagemPrincipalThumbnail"]
	
	static propriedadesExcluidasListaView = ["resumo", "descricao", "nomeArquivoImagemPrincipal", "nomeArquivoImagemPrincipalThumbnail"]
	
	String getNomeArquivoImagemPrincipal(){
		nomeDiretorioImagens + "_principal.jpg"
	}
	
	String getNomeArquivoImagemPrincipalThumbnail(){
		nomeDiretorioImagens + "_principal_thumb.jpg"
	}
}
