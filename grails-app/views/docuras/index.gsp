<!DOCTYPE html>
<html lang="en">
<head>
	<meta name="layout" content="main" />
	<r:require module="jquery" />
	<r:require module="metro" />
	<r:require module="baseCSS" />
</head>
<body class="body">

	<div class="bodyWrapper">
		<div class="page secondary"> 
			<div class="page-header">
				<div class="page-header-content">
					<%--<a class="back-button big page-back" href="/DocurasSu"></a>--%>
					<div class="grid">
						<div class="row">
							<div class="span10">
								<h1>
									<g:imagemTipoProduto tipo="${params.tipo}" style="width:64px; height:64px;"/>
									<g:tituloTipoProduto tipo="${params.tipo}"/>
								</h1>
							</div>
						</div>
				</div>
			</div>
	
			<div class="page-region">
				<div class="page-region-content">
					
						<div class="row">
							<div class="span12" style="margin-right:-7px;">
								<div style="padding-left:10px;"><g:render template="paginacaoGridProdutos" bean="${produtos}"/></div>
								<div id="divProdutos">
									<g:render template="gridProdutos" bean="${produtos}" />
								</div>
							</div>
						</div>
					</div>
					
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
<g:javascript src="metro/tile-slider.js" ></g:javascript>
</body>
</html>

