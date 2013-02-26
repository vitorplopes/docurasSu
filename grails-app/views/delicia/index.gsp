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
							<div class="carousel span6" data-role="carousel"
								data-param-auto="false" data-param-effect="fade"
								style="height: 300px;">
								<div class="slides">
									<div class="slide image" id="slide1" style="display: block;">
										<img src="images/bolo_flamengo.jpg">
										<div class="description">Bolo 1: Descricao</div>
									</div>

									<div class="slide mixed" id="slide2" style="display: block;">
										<img src="images/bolo_flamengo.jpg">
										<div class="description">Bolo 2: Descricao</div>
									</div>
									...
								</div>

								<span class="control left">‹</span> <span class="control right">›</span>
							</div>
							
							<div id="Gallery" class="image-collection">
								<div class="tile image" style="width:110px; height:62px;">
									<a
										href="${createLinkTo(dir: 'images', file: 'bolo_flamengo.jpg')}"><img
										src="images/bolo_flamengo_thumb.jpg" /></a>
									
								</div>

								<div class="tile image" style="width:110px; height:62px;">
									<a
										href="${createLinkTo(dir: 'images', file: 'bolo_flamengo.jpg')}"><img
										src="images/bolo_flamengo_thumb.jpg" /></a>
									
								</div>

								<div class="tile image" style="width:110px; height:62px;">
									<a
										href="${createLinkTo(dir: 'images', file: 'bolo_flamengo.jpg')}"><img
										src="images/bolo_flamengo_thumb.jpg" /></a>
									
								</div>

								<div class="tile image" style="width:110px; height:62px;">
									<a
										href="${createLinkTo(dir: 'images', file: 'bolo_flamengo.jpg')}"><img
										src="images/bolo_flamengo_thumb.jpg" /></a>
									
								</div>

								<div class="tile image" style="width:110px; height:62px;">
									<a
										href="${createLinkTo(dir: 'images', file: 'bolo_flamengo.jpg')}"><img
										src="images/bolo_flamengo_thumb.jpg" /></a>
									
								</div>

								<div class="tile image" style="width:110px; height:62px;">
									<a
										href="${createLinkTo(dir: 'images', file: 'bolo_flamengo.jpg')}"><img
										src="images/bolo_flamengo_thumb.jpg" /></a>
									
								</div>

							</div>
						</div>

						<div class="span4 bg-color-pinkLight">
							<h2 class="fg-color-red">&nbsp;Quem somos</h2>

							<div
								style="background-image: url('/DocurasSu/static/images/background.png');">
								<p class="fg-color-darken padding20 text-justify">Lorem
									ipsum dolor sit amet, consectetur adipiscing elit. Sed a quam
									in arcu viverra pretium vel vel est. Proin placerat
									sollicitudin urna. Integer malesuada mauris a augue pharetra
									venenatis. Morbi vel lorem non justo auctor varius quis a
									neque. Nunc vitae nulla ut diam placerat hendrerit sed a ipsum.</p>
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

