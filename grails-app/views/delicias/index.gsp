<!DOCTYPE html>
<html>
<head>
	<meta name="layout" content="main" />
	<r:require module="jquery" />
	<r:require module="metro" />
	<r:require module="baseCSS" />
</head>
<body class="body">
	
	<g:javascript>
		$(document).ready($(function() {
			criarPaginacao();
		}));
		
		function criarPaginacao(){
			$("#paginacaoSuperior").paginate({
				count : ${params.qtdPaginas},
				start : 1,
				display : 8,
				border : true,
				border_color : '#b91d47',
				text_color : '#b91d47',
				background_color : '#f0cde2',
				border_hover_color : '#ccc',
				text_hover_color : '#000',
				background_hover_color : '#fff',
				images : false,
				mouse : 'press',
				onChange : function(page){
					$.ajax({
		                url: "${g.createLink(controller:'delicias', action:'pagina')}",
		                data: {offset : (page-1)*9},
		                dataType: "html",
		                async: false,
		                success: function(data) {
							paginar(data);
		                }
		            });
				  }
			});
		};
		
		function paginar(data){
			$('#divProdutos').fadeOut('fast', function() {$(this).html(data).fadeIn('slow');});
		}
		
	</g:javascript>

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
			<g:render template="paginacaoGridProdutos" bean="${params.produtos}" />
			<div id="divProdutos">
				<g:render template="gridProdutos" bean="${params.produtos}" />
			</div>			
		</div>
	</div>
	</div>

</body>
</html>

