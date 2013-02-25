<!DOCTYPE html>
<html>
<head>
	<meta name="layout" content="main" />
	<r:require module="jquery" />
	<r:require module="metro" />
	<r:require module="baseCSS" />
</head>
<body class="body">
	
	<g:remoteLink action="delete" id="1" update="message"/>
	
	<script type="text/javascript">
		$(document).ready($(function() {
			$("#paginacaoSuperior").paginate({
				count : ${params.qtdPaginas},
				start : 1,
				display : 8,
				border : false,
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
		                data: {offset : 9},
		                dataType: "json",
		                async: false,
		                success: function(html) {
							$('#divProdutos').html(html);
		                }
		            });
				  }
			})
		}));
	</script>

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
			<div id="divProdutos">
				<g:render template="gridProdutos" bean="${params.produtos}" />			
			</div>
		</div>
	</div>
	</div>

</body>
</html>

