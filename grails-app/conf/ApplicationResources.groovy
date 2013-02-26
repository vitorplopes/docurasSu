modules = {
	photoswipe {
		resource url:'js/photoswipe/klass.min.js', disposition: 'head'
		resource url:'js/photoswipe/code.photoswipe.jquery-3.0.5.min.js', disposition: 'head'
		resource url:'css/styles.css', disposition: 'head'
		resource url:'css/photoswipe.css', disposition: 'head'
	}
	baseCSS {
		resource url:'css/base.css', disposition: 'head'
	}
	application {
        resource url:'js/application.js'
    }
	metro {
		resource url:'css/modern.css', disposition: 'head'
		resource url:'css/modern-responsive.css', disposition: 'head'
		resource url:'js/metro/dropdown.js', disposition: 'head'
		resource url:'js/metro/carousel.js', disposition: 'head'
		resource url:'js/jPaginate/jquery.paginate.js', disposition: 'head'
		resource url:'js/jPaginate/css/style.css', disposition: 'head'
	}
}