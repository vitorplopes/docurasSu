package br.com.docurasSu

import java.sql.Date;

class Promocao {

	Date dateCreated
	String titulo
	String resumo
	String descricao
	String nomeDiretorioImagens
	String nomeArquivoImagemPrincipal
	String nomeArquivoImagemPrincipalThumbnail
	String nomeArquivoImagemReduzida
	boolean valida = true
	
	static hasMany = [imagens : Imagem]
	
	static mapping = {
		imagens index: 'Promocao_Imagens_Idx'
	}
	
    static constraints = {
		titulo blank: true, nullable: true
		resumo blank: true, nullable: true
		descricao blank: true, nullable: true
		nomeDiretorioImagens unique: true
		nomeArquivoImagemPrincipalThumbnail blank: true, nullable: true
		nomeArquivoImagemReduzida blank: true, nullable: true
    }
	
	static propriedadesExcluidasListaView = ["resumo", "descricao", "nomeArquivoImagemPrincipalThumbnail", "nomeArquivoImagemReduzida"]
}
