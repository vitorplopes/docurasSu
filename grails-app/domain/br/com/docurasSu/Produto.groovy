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
	String nomeArquivoImagemPrincipal
	String nomeArquivoImagemPrincipalThumbnail
	
	static hasMany = [imagens : Imagem]
	
	static mapping = {
		nome index: 'Produto_Nome_Idx'
		tipo index: 'Produto_Tipo_Idx'
		imagens index: 'Produto_Imagens_Idx'
	}
	
    static constraints = {
		preco blank: true, nullable: true
		tipo blank: true, nullable: true
		nomeDiretorioImagens nullable: true
		nomeArquivoImagemPrincipal nullable: true
		nomeArquivoImagemPrincipalThumbnail nullable: true
    }
	
	static propriedadesExcluidasListaView = ["resumo", "descricao", "nomeDiretorioImagens", "nomeArquivoImagemPrincipal", "nomeArquivoImagemPrincipalThumbnail"]
}
