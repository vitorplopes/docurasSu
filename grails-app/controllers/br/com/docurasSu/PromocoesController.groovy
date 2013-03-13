package br.com.docurasSu

class PromocoesController {

    def ver(Long id) { 
		def promocao = Promocao.get(id)
		if(!promocao){
			flash.message = message(code: 'docurasController.list.deliciaNaoEncontrada')
			redirect(action: "docuras")
			return
		}
		[promocao: promocao]
	}
}
