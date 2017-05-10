$('#logout').trigger('click');


$('#logout').click(function(){
	
	console.log('logout');
  FB.logout(function(response) {
	  console.log('logout1');
	   // Person is now logged out
	});
})