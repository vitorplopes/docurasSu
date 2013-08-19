<!DOCTYPE html>
<html>
<head>
	<meta name="layout" content="main" />
	<r:require module="jquery" />
	<r:require module="metro" />
	<r:require module="baseCSS" />
	<r:require module="flexslider" />
	<r:require module="photoswipe" />
</head>
<body class="body">

	<r:script disposition="head">
		function trocarImagemPrincipal(src) {
		    var imgPrincipal = $("#imgPrincipal");
		    $(imgPrincipal).fadeOut(400, function() {
		    	$(imgPrincipal).attr("src", src);
		    }).fadeIn(400);
		};
	</r:script>

	<g:gridPromocoes/>

	<div class="page secondary">
		<div class="page-header">
			<div class="page-header-content">
				<!--<h1>${produto.nome}</h1>-->
				<a class="back-button big page-back" href="/DocurasSu"></a>
			</div>
		</div>

		<div class="page-region">
			<div class="page-region-content">

				<div class="grid">
				
					<div class="row">
						<div class="span10 bg-color-pinkLight">
							<h2 class="fg-color-red" style="padding-left:20px;">Huuuuummmmmm, delícia!</h2>
	
							<div class="background-bege-quadrado">
								<p class="fg-color-darken padding20 text-justify">${produto.descricao}</p>
							</div>
	
						</div>
					</div>
	
					<div class="row">
						<div class="span10">
							<g:carroselProduto produto="${produto}"/>
						</div>
					</div>
				
				</div>
				
				<!--  <div id="colecao">
					<g:produtoImageCollection produto="${produto}"/>
				</div>
				-->
			</div>
		</div>
	</div>

	<g:javascript>
		$(document).ready(function(){
			
			$('.flexslider').flexslider({
			    animation: "slide"
			  });
			  
			$("#Gallery a").photoSwipe({});
			
		});
	</g:javascript>
</body>
</html>

