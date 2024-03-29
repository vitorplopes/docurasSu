package br.com.docurasSu

import java.sql.Date;

class Promocao {

	Date dateCreated
	String titulo
	String resumo
	String descricao
	String nomeDiretorioImagens
	boolean valida = true
	int quantidadeImagens = 0
	
    static constraints = {
		resumo blank: true, nullable: true
		descricao blank: true, nullable: true
		nomeDiretorioImagens unique: true
		quantidadeImagens unique: true
    }
	
	static propriedadesExcluidasListaView = ["resumo", "descricao", "nomeArquivoImagemPrincipal", "nomeArquivoImagemPrincipalThumbnail", "nomeArquivoImagemSecundaria"]
	
	static transients = ["nomeArquivoImagemPrincipal", "nomeArquivoImagemPrincipalThumbnail", "nomeArquivoImagemSecundaria"]
	
	String getNomeArquivoImagemPrincipal(){
		nomeDiretorioImagens + "_principal.jpg"
	}
	
	String getNomeArquivoImagemPrincipalThumbnail(){
		nomeDiretorioImagens + "_principal_thumb.jpg"
	}
	
	String getNomeArquivoImagemSecundaria(){
		nomeDiretorioImagens + "_secundaria.jpg"
	}
}
