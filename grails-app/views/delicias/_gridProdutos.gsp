
<g:if test="${it.size() > 0}">

	<div id="paginacaoSuperior" class="jPaginate"
		style="padding-left: 77px;"></div>

	<div class="image-collection"
		style="padding: 10px; text-align: center;">

		<g:each in="${it}" var="produto">

			<div class="tile image shadow">

				<img
					src="${createLinkTo(dir: 'images', file: produto.nomeArquivoImagem)}" />
				<div class="overlay">
					${produto.resumo}
				</div>
			</div>

		</g:each>
	</div>

</g:if>
<g:else>
			Não há delícias cadastradas... :'-{
		</g:else>

<div class="pagination">
	<g:paginate total="${it.size()}" />
</div>