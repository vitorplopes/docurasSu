<%@ page import="br.com.docurasSu.Qualificador" %>



<div class="fieldcontain ${hasErrors(bean: qualificadorInstance, field: 'idQualificador', 'error')} required">
	<label for="idQualificador">
		<g:message code="qualificador.idQualificador.label" default="Id Qualificador" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="idQualificador" type="number" value="${qualificadorInstance.idQualificador}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: qualificadorInstance, field: 'produto', 'error')} required">
	<label for="produto">
		<g:message code="qualificador.produto.label" default="Produto" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="produto" name="produto.id" from="${br.com.docurasSu.Produto.list()}" optionKey="id" required="" value="${qualificadorInstance?.produto?.id}" class="many-to-one"/>
</div>

