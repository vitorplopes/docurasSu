<!DOCTYPE html>
<html>
<head>
	<meta name="layout" content="main" />
	<r:require module="jquery" />
	<r:require module="metro" />
	<r:require module="baseCSS" />
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
				<h1>Bolo do flamengo</h1>
				<a class="back-button big page-back" href="/DocurasSu"></a>
			</div>
		</div>

		<div class="page-region">
			<div class="page-region-content">

				<div class="grid">
					<div class="row">

						<div class="span6">
							<g:produtoImageCollection produto="${produto}"/>
						</div>

						<div class="span4 bg-color-pinkLight">
							<h2 class="fg-color-red" style="padding-left:20px;">Huuuuummmmmm, delícia!</h2>

							<div
								style="background-image: url('/DocurasSu/static/images/background.png');">
								<p class="fg-color-darken padding20 text-justify">${produto.descricao}</p>
							</div>

						</div>

					</div>


				</div>


			</div>
		</div>
	</div>

	<g:javascript>
		(function(window, $, PhotoSwipe){
			
			$(document).ready(function(){
				
				var options = {};
				$("#Gallery a").photoSwipe(options);
				
			});
			
			
		}(window, window.jQuery, window.Code.PhotoSwipe));
	</g:javascript>
</body>
</html>

