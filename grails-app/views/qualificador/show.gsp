
<%@ page import="br.com.docurasSu.Qualificador" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'qualificador.label', default: 'Qualificador')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-qualificador" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-qualificador" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list qualificador">
			
				<g:if test="${qualificadorInstance?.idQualificador}">
				<li class="fieldcontain">
					<span id="idQualificador-label" class="property-label"><g:message code="qualificador.idQualificador.label" default="Id Qualificador" /></span>
					
						<span class="property-value" aria-labelledby="idQualificador-label"><g:fieldValue bean="${qualificadorInstance}" field="idQualificador"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${qualificadorInstance?.produto}">
				<li class="fieldcontain">
					<span id="produto-label" class="property-label"><g:message code="qualificador.produto.label" default="Produto" /></span>
					
						<span class="property-value" aria-labelledby="produto-label"><g:link controller="produto" action="show" id="${qualificadorInstance?.produto?.id}">${qualificadorInstance?.produto?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${qualificadorInstance?.id}" />
					<g:link class="edit" action="edit" id="${qualificadorInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
