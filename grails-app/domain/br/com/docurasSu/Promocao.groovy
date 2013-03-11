package br.com.docurasSu

import java.sql.Date;

class Promocao {

	Date dateCreated
	String nome
	String resumo
	String descricao
	String nomeDiretorioImagens
	String nomeArquivoImagemPrincipal
	String nomeArquivoImagemPrincipalThumbnail
	boolean valida = true
	
	static hasMany = [imagens : Imagem]
	
	static mapping = {
		imagens index: 'Promocao_Imagens_Idx'
	}
	
    static constraints = {
		nome blank: true, nullable: true
		resumo blank: true, nullable: true
		descricao blank: true, nullable: true
		nomeDiretorioImagens unique: true
		nomeArquivoImagemPrincipalThumbnail blank: true, nullable: true
    }
	
	static propriedadesExcluidasListaView = ["resumo", "descricao", "nomeArquivoImagemPrincipalThumbnail"]
}
