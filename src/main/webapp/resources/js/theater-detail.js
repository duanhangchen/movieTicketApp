$( document ).ready(function() {
    console.log( "ready!" );
    $('.carousel[data-type="multi"] .item').each(function(){
    	  var next = $(this).next();
    	  if (!next.length) {
    	    next = $(this).siblings(':first');
    	  }
    	  next.children(':first-child').clone().appendTo($(this));

    	  for (var i=0;i<4;i++) {
    	    next=next.next();
    	    if (!next.length) {
    	    	next = $(this).siblings(':first');
    	  	}
    	    
    	    next.children(':first-child').clone().appendTo($(this));
    	  }
    	});
    
    
    $("#theatre-like").click(function(value) {
		
    		var value = document.getElementById("favouriteTheatre").value;
    		console.log("Hellp"+value);
		if (value == "red") {
			document.getElementById("favouriteTheatre").value = "white";
		}
		if (value == "white") {
			document.getElementById("favouriteTheatre").value = "red";
		}
		$(this).toggleClass('red');

		var toggleFavourite = {
			value : document.getElementById("favouriteTheatre").value
		}
		var theatreid = window.location.pathname.split('/')[2];
		$.ajax({
			type : "POST",
			url : "/theatres/"+theatreid+"/toggleFavourite" ,
			data : toggleFavourite,
			success : function(result) {
				console.log("SUCCESS");
			},
			error : function(result) {
				console.log('ERROR');
			}
		});
	});
});
