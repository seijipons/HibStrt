$(document).ready(function(){
	var altura = $('.menu2').offset().top;
	
	$(window).on('scroll', function(){
		if ( $(window).scrollTop() > altura ){
			$('.menu2').addClass('menu-fixed');
		} else {
			$('.menu2').removeClass('menu-fixed');
		}
	});
 
});