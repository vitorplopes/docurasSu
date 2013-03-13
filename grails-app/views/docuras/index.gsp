<!DOCTYPE html>
<html>
<head>
	<meta name="layout" content="main" />
	<r:require module="jquery" />
	<r:require module="metro" />
	<r:require module="baseCSS" />
</head>
<body class="body">

	<div class="bodyWrapper">
		<div class="page"> 
			<div class="page-header">
				<div class="page-header-content">
					<h1><g:tituloTipoProduto tipo="${params.tipo}"/></h1>
					<%--<a class="back-button big page-back" href="/DocurasSu"></a>--%>
				</div>
			</div>
	
			<div class="page-region">
				<div class="page-region-content">
					<div class="grid">
						<div class="row">
							<div class="span10" style="margin-right:-7px;">
								<div style="padding-left:10px;"><g:render template="paginacaoGridProdutos" bean="${produtos}"/></div>
								<div id="divProdutos">
									<g:render template="gridProdutos" bean="${produtos}" />
								</div>
							</div>
							<div class="span2">
								<h2 style="text-align:center;">Promoções</h2>
								<g:gridPromocoes promocoes="${ultimasPromocoes}"/>
							</div>
						</div>
					</div>
					
					<g:gridTiposPromocoes/>
					
				</div>			
			</div>
		</div>
	</div>

	<r:script>
		$(document).ready($(function() {
			criarPaginacao();
		}));
		
		function criarPaginacao(){
			$("#paginacaoSuperior").paginate({
				count : ${qtdPaginas},
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
		                url: "${g.createLink(controller:'docuras', action:'pagina')}",
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
		
	</r:script>

</body>
</html>

