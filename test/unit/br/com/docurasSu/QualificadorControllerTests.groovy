package br.com.docurasSu



import org.junit.*
import grails.test.mixin.*

@TestFor(QualificadorController)
@Mock(Qualificador)
class QualificadorControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/qualificador/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.qualificadorInstanceList.size() == 0
        assert model.qualificadorInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.qualificadorInstance != null
    }

    void testSave() {
        controller.save()

        assert model.qualificadorInstance != null
        assert view == '/qualificador/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/qualificador/show/1'
        assert controller.flash.message != null
        assert Qualificador.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/qualificador/list'

        populateValidParams(params)
        def qualificador = new Qualificador(params)

        assert qualificador.save() != null

        params.id = qualificador.id

        def model = controller.show()

        assert model.qualificadorInstance == qualificador
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/qualificador/list'

        populateValidParams(params)
        def qualificador = new Qualificador(params)

        assert qualificador.save() != null

        params.id = qualificador.id

        def model = controller.edit()

        assert model.qualificadorInstance == qualificador
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/qualificador/list'

        response.reset()

        populateValidParams(params)
        def qualificador = new Qualificador(params)

        assert qualificador.save() != null

        // test invalid parameters in update
        params.id = qualificador.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/qualificador/edit"
        assert model.qualificadorInstance != null

        qualificador.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/qualificador/show/$qualificador.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        qualificador.clearErrors()

        populateValidParams(params)
        params.id = qualificador.id
        params.version = -1
        controller.update()

        assert view == "/qualificador/edit"
        assert model.qualificadorInstance != null
        assert model.qualificadorInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/qualificador/list'

        response.reset()

        populateValidParams(params)
        def qualificador = new Qualificador(params)

        assert qualificador.save() != null
        assert Qualificador.count() == 1

        params.id = qualificador.id

        controller.delete()

        assert Qualificador.count() == 0
        assert Qualificador.get(qualificador.id) == null
        assert response.redirectedUrl == '/qualificador/list'
    }
}
