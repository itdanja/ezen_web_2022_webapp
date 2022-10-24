
$.ajax({
	url : "/jspweb/board/api" , 
	success: function( re ){
		let json = JSON.parse(re)
		console.log( json )
	}
})