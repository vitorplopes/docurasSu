package br.com.docurasSu

import java.sql.Date;

class Produto {

	Date dateCreated
	String nome
	String resumo
	String descricao
	String preco
	String nomeDiretorioImagens
	String nomeArquivoImagemPrincipal
	String nomeArquivoImagemPrincipalThumbnail
	
	static hasMany = [imagens : Imagem]
	
    static constraints = {
		preco blank: true, nullable: true
		nomeDiretorioImagens nullable: true
		nomeArquivoImagemPrincipal nullable: true
		nomeArquivoImagemPrincipalThumbnail nullable: true
    }
	
	static propriedadesExcluidasListaView = ["resumo", "descricao", "nomeDiretorioImagens", "nomeArquivoImagemPrincipal", "nomeArquivoImagemPrincipalThumbnail"]
}
