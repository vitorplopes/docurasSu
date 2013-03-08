<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main" />

<style type="text/css" media="screen">
#status {
	background-color: #eee;
	border: .2em solid #fff;
	margin: 2em 2em 1em;
	padding: 1em;
	width: 12em;
	float: left;
	-moz-box-shadow: 0px 0px 1.25em #ccc;
	-webkit-box-shadow: 0px 0px 1.25em #ccc;
	box-shadow: 0px 0px 1.25em #ccc;
	-moz-border-radius: 0.6em;
	-webkit-border-radius: 0.6em;
	border-radius: 0.6em;
}

.ie6 #status {
	display: inline;
	/* float double margin fix http://www.positioniseverything.net/explorer/doubled-margin.html */
}

#status ul {
	font-size: 0.9em;
	list-style-type: none;
	margin-bottom: 0.6em;
	padding: 0;
}

#status li {
	line-height: 1.3;
}

#status h1 {
	text-transform: uppercase;
	font-size: 1.1em;
	margin: 0 0 0.3em;
}

#page-body {
	margin: 2em 1em 1.25em 18em;
}

h2 {
	margin-top: 1em;
	margin-bottom: 0.3em;
	font-size: 1em;
}

p {
	line-height: 1.5;
	margin: 0.25em 0;
}

#controller-list ul {
	list-style-position: inside;
}

#controller-list li {
	line-height: 1.3;
	list-style-position: inside;
	margin: 0.25em 0;
}

@media screen and (max-width: 480px) {
	#status {
		display: none;
	}
	#page-body {
		margin: 0 1em 1em;
	}
	#page-body h1 {
		margin-top: 0;
	}
}
</style>

<r:require module="jquery" />
<r:require module="metro" />
<r:require module="baseCSS" />
<r:require module="photoswipe" />

	<r:script>
		(function(window, $, PhotoSwipe){
			
			$(document).ready(function(){
				
				var options = {};
				$("#divProdutosImageCollection a").photoSwipe(options);
				
			});
			
			
		}(window, window.jQuery, window.Code.PhotoSwipe));
	</r:script>

</head>
<body class="body">
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

	<div class="bodyWrapper">
		<div class="page">
			<div class="page-region">
				<div class="page-region-content">

					<div class="grid">
						<div class="row">
							<div
								class="span4 padding30 text-center place-left bg-color-pinkLight">
								<h3 class="fg-color-red">
									Bolos & Tortas da Su:<br>Porque a sua festa merece!
								</h3>
								<br>
								<p class="fg-color-darken">Quem disse que é preciso gastar
									muito para colocar um bolo de qualidade na sua mesa? Torne a
									sua festa um sucesso sem gastar muito! Aprecie nosso catálogo
									de bolos, tortas, cupcakes e encomende conosco agora mesmo!</p>
							</div>

						</div>
					</div>



				</div>
			</div>
		</div>

		<div class="grid">
			<div class="row">
				<div class="span4 bg-color-pinkLight">
					<h2 class="fg-color-red">&nbsp;Quem somos</h2>

					<div
						style="background-image: url('/DocurasSu/static/images/background.png');">
						<p class="fg-color-darken padding20 text-justify">Lorem ipsum
							dolor sit amet, consectetur adipiscing elit. Sed a quam in arcu
							viverra pretium vel vel est. Proin placerat sollicitudin urna.
							Integer malesuada mauris a augue pharetra venenatis. Morbi vel
							lorem non justo auctor varius quis a neque. Nunc vitae nulla ut
							diam placerat hendrerit sed a ipsum.</p>
					</div>

				</div>


				<div class="span3 bg-color-pinkLight">
					<img src="images/Untitled.png" class="place-right"
						style="margin: 10px;">
					<h2 class="fg-color-red">&nbsp;Contato</h2>

					<div
						style="background-image: url('/DocurasSu/static/images/background.png');">
						<p class="fg-color-darken padding10 text-center">(21)
							9683-4778</p>
						<p class="fg-color-darken padding10 text-center">(21)
							3835-5069</p>
						<p class="fg-color-darken padding10 text-center">docuras.su@gmail.com</p>
					</div>

				</div>

				<div class="span4 bg-color-pinkLight">
					<img src="images/facebook-icon.png" class="place-right"
						style="margin: 10px;">
					<h2 class="fg-color-red">&nbsp;Facebook</h2>

					<div
						style="background-image: url('/DocurasSu/static/images/background.png');">
						<p class="fg-color-darken padding10">Lorem ipsum dolor sit
							amet, consectetur adipiscing elit. Sed a quam in arcu viverra
							pretium vel vel est. Proin placerat sollicitudin urna. Integer
							malesuada mauris a augue pharetra venenatis. Morbi vel lorem non
							justo auctor varius quis a neque. Nunc vitae nulla ut diam
							placerat hendrerit sed a ipsum.</p>
					</div>

				</div>
			</div>
		</div>

		<div class="grid">
			<div class="row">
				<div class="span11 bg-color-pinkLight">
					<h2 class="fg-color-red">&nbsp;Últimas Delícias!</h2>

					<div class="span11 padding10"
						style="background-image: url('/DocurasSu/static/images/background.png');">

						<g:gridProdutos produtos="${ultimosProdutos}"/>
						
						<p class="fg-color-darken padding5 text-center">&nbsp;</p>

					</div>
				</div>
			</div>

		</div>
</body>
</html>
