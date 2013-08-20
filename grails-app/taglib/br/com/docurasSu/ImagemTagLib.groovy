package br.com.docurasSu

import grails.util.Metadata


class ImagemTagLib {

	def imagemService
	
	def tipoProdutoService
	
	private impl(out, attrs, closure){
		
		out << "<img "
		
		if(attrs.id){
			out << "id='${attrs.id}' "
		}
		
		if(!Metadata.current.isWarDeployed()){
			out << "src='${g.createLinkTo(dir: closure(attrs.nomeDiretorioImagens), file: attrs.nomeArquivoImagem)}' "
		}
		else{
			out << "src='${g.createLinkTo(dir: closure(attrs.nomeDiretorioImagens), file: attrs.nomeArquivoImagem, base: imagemService.prefixoURL)}' "
		}
		
		if(attrs.style){
			out << "style='${attrs.style}' "
		}
		
		if(attrs.alt){
			out << "alt='${attrs.alt}' "
		}
		
		if(attrs.'class'){
			out << "class='${attrs.'class'}' "
		}
		
		out << "/>"
	}
	
	def imagemProduto = {attrs, body ->
		impl(out, attrs, imagemService.getCaminhoImagemProduto)
	}
	
		
	def imagemPromocao = {attrs, body ->
		impl(out, attrs, imagemService.getCaminhoImagemPromocao)
	}
	
	def imagemTipoProduto = {attrs, body ->
		if(attrs.tipo){
/*			switch(attrs.tipo){
				case 'B':
					out << "Bolos"
					break
				case 'C':
					out << "Cupakes"
					break
				case 'T':
					out << "Tortas"
					break
				case 'D':
					out << "Docinhos"
					break
			}*/
			attrs.nomeArquivoImagem = tipoProdutoService.getNomeArquivoTipo(attrs.tipo as char)
		}
		impl(out, attrs, imagemService.getCaminhoImagemTipoProduto)
	}
}
