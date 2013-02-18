modules = {
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
	}
}