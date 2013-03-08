package br.com.docurasSu

class Qualificador {
	
	Produto produto
	int idQualificador
	
	static propriedadesExcluidasListaView = []
	
	static mapping = {
		produto unique: 'idQualificador', index: 'Qualificador_Produto_Idx'
		idQualificador index: 'Qualificador_Id_Idx'
	}
	
    static constraints = {
    }
}
