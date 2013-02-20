<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main" />
<r:require module="jquery" />
<r:require module="metro" />
<r:require module="baseCSS" />
</head>
<body class="body">

	<div class="page">
		<div class="nav-bar">
			<div class="nav-bar-inner">

				<span class="element"><a href="/DocurasSu/home">Home</a> </span> <span
					class="divider"></span> <span class="element"><a
					href="/DocurasSu/bolos">Bolos</a> </span> <span class="divider"></span> <span
					class="element"><a href="/DocurasSu/bolos">Tortas</a> </span> <span
					class="divider"></span> <span class="element"><a
					href="/DocurasSu/bolos">Cupcakes</a> </span>

			</div>
		</div>

	</div>


	<div class="page secondary">
		<div class="page-header">
			<div class="page-header-content">
				<h1>Delícias</h1>
				<a class="back-button big page-back" href="/DocurasSu"></a>
			</div>
		</div>

		<div class="page-region">
			<div class="page-region-content">
				<g:if test="${params.produtos.size() > 0}">

					<div class="image-collection"
						style="padding: 10px; text-align: center;">

						<g:each in="${params.produtos}" var="produto">

							<div class="tile image shadow">

								<img src="images/${produto.nomeArquivoImagem}" />
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
			</div>
		</div>
	</div>

</body>
</html>

