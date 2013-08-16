import grails.util.Metadata

String prefix = "http://dl.dropbox.com/u/144356318/"

/** Returns {@code true} if we're using run-app. */
boolean isDevMode() { !Metadata.current.isWarDeployed() }

modules = {
	flexslider {
		
		dependsOn 'jquery'
		
		if(isDevMode()){
			resource url:'css/flexslider/flexslider.css', disposition: 'head'
			resource url:'js/flexslider/jquery.flexslider-min.js', disposition: 'head'
		}
		else{
			resource url: prefix + 'css/flexslider/flexslider.css', disposition: 'head'
			resource url: prefix + 'js/flexslider/jquery.flexslider-min.js', disposition: 'head'
		}
	}
	photoswipe {
		
		dependsOn 'jquery'
		
		if(isDevMode()){
			resource url:'js/photoswipe/klass.min.js', disposition: 'head'
			resource url:'js/photoswipe/code.photoswipe.jquery-3.0.5.min.js', disposition: 'head'
			resource url:'css/photoswipe/styles.css', disposition: 'head'
			resource url:'css/photoswipe/photoswipe.css', disposition: 'head'
		}
		else{
			resource url: prefix + 'js/photoswipe/klass.min.js', disposition: 'head'
			resource url: prefix + 'js/photoswipe/code.photoswipe.jquery-3.0.5.min.js', disposition: 'head'
			resource url: prefix + 'css/photoswipe/styles.css', disposition: 'head'
			resource url: prefix + 'css/photoswipe/photoswipe.css', disposition: 'head'
		}
	}
	baseCSS {
		if(isDevMode()){
			resource url:'css/base.css', disposition: 'head'
		}
		else{
			resource url: prefix + 'css/base.css', disposition: 'head'
		}
	}
	application {
		resource url:'js/application.js', disposition: 'head'

    }
	metro {
		
		dependsOn 'jquery'
		
		if(isDevMode()){
			resource url: 'css/metro/modern.css', disposition: 'head'
			resource url:'css/metro/modern-responsive.css', disposition: 'head'
			resource url:'js/metro/dropdown.js', disposition: 'head'
			resource url:'js/metro/carousel.js', disposition: 'head'
			resource url:'js/jPaginate/jquery.paginate.js', disposition: 'head'
			resource url:'css/jPaginate/style.css', disposition: 'head'
		}
		else{
			resource url: prefix + 'css/metro/modern.css', disposition: 'head'
			resource url: prefix + 'css/metro/modern-responsive.css', disposition: 'head'
			resource url: prefix + 'js/metro/dropdown.js', disposition: 'head'
			resource url: prefix + 'js/metro/carousel.js', disposition: 'head'
			resource url: prefix + 'js/jPaginate/jquery.paginate.js', disposition: 'head'
			resource url: prefix + 'css/jPaginate/style.css', disposition: 'head'
		}
		
	}
}