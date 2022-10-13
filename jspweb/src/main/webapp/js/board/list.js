
list() // js 열람시 메소드 1번 실행 
function list(){
	$.ajax({
		url : "http://localhost:8080/jspweb/baord/list" , 
		success : function( re ){
			console.log( re )
			let boardlist = JSON.parse( re )
			console.log( boardlist )
			
			
		}
	})
}




