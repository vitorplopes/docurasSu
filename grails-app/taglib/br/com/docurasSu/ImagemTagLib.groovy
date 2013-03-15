package br.com.docurasSu

import grails.util.Metadata


class ImagemTagLib {

	def imagemService
	
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
		
		out << "/>"
	}
	
	def imagemProduto = {attrs, body ->
		impl(out, attrs, imagemService.getCaminhoImagemProduto)
	}
	
		
	def imagemPromocao = {attrs, body ->
		impl(out, attrs, imagemService.getCaminhoImagemPromocao)
	}
	
	def imagemTipoProduto = {attrs, body ->
		impl(out, attrs, imagemService.getCaminhoImagemTipoProduto)
	}
}
