package br.com.docurasSu

class Promocao {

	String nome
	String resumo
	String descricao
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
		nomeArquivoImagemPrincipalThumbnail blank: true, nullable: true
    }
	
	static propriedadesExcluidasListaView = ["resumo", "descricao", "nomeArquivoImagemPrincipalThumbnail"]
}
