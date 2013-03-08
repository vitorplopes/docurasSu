
<%@ page import="br.com.docurasSu.Qualificador" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'qualificador.label', default: 'Qualificador')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-qualificador" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-qualificador" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<th><g:message code="Id/Link"/></th>
					
						<g:sortableColumn property="idQualificador" title="${message(code: 'qualificador.idQualificador.label', default: 'Id Qualificador')}" />
					
						<th><g:message code="qualificador.produto.label" default="Produto" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${qualificadorInstanceList}" status="i" var="qualificadorInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					<td><g:link action="show" id="${qualificadorInstance.id}">${fieldValue(bean: qualificadorInstance, field: "id")}</g:link></td>
					
						<td>${fieldValue(bean: qualificadorInstance, field: "idQualificador")}</td>
					
						<td>${fieldValue(bean: qualificadorInstance, field: "produto")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${qualificadorInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
