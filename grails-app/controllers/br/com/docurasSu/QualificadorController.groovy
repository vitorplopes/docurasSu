package br.com.docurasSu

import org.springframework.dao.DataIntegrityViolationException

class QualificadorController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [qualificadorInstanceList: Qualificador.list(params), qualificadorInstanceTotal: Qualificador.count()]
    }

    def create() {
        [qualificadorInstance: new Qualificador(params)]
    }

    def save() {
        def qualificadorInstance = new Qualificador(params)
        if (!qualificadorInstance.save(flush: true)) {
            render(view: "create", model: [qualificadorInstance: qualificadorInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'qualificador.label', default: 'Qualificador'), qualificadorInstance.id])
        redirect(action: "show", id: qualificadorInstance.id)
    }

    def show(Long id) {
        def qualificadorInstance = Qualificador.get(id)
        if (!qualificadorInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'qualificador.label', default: 'Qualificador'), id])
            redirect(action: "list")
            return
        }

        [qualificadorInstance: qualificadorInstance]
    }

    def edit(Long id) {
        def qualificadorInstance = Qualificador.get(id)
        if (!qualificadorInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'qualificador.label', default: 'Qualificador'), id])
            redirect(action: "list")
            return
        }

        [qualificadorInstance: qualificadorInstance]
    }

    def update(Long id, Long version) {
        def qualificadorInstance = Qualificador.get(id)
        if (!qualificadorInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'qualificador.label', default: 'Qualificador'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (qualificadorInstance.version > version) {
                qualificadorInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                          [message(code: 'qualificador.label', default: 'Qualificador')] as Object[],
                          "Another user has updated this Qualificador while you were editing")
                render(view: "edit", model: [qualificadorInstance: qualificadorInstance])
                return
            }
        }

        qualificadorInstance.properties = params

        if (!qualificadorInstance.save(flush: true)) {
            render(view: "edit", model: [qualificadorInstance: qualificadorInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'qualificador.label', default: 'Qualificador'), qualificadorInstance.id])
        redirect(action: "show", id: qualificadorInstance.id)
    }

    def delete(Long id) {
        def qualificadorInstance = Qualificador.get(id)
        if (!qualificadorInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'qualificador.label', default: 'Qualificador'), id])
            redirect(action: "list")
            return
        }

        try {
            qualificadorInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'qualificador.label', default: 'Qualificador'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'qualificador.label', default: 'Qualificador'), id])
            redirect(action: "show", id: id)
        }
    }
}
