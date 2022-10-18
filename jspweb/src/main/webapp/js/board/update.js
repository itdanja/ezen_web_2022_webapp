
bview() 
function bview(){
	$.ajax({
		url : "http://localhost:8080/jspweb/board/view" , 
		success : function( re ){
			let board = JSON.parse(re)
			console.log( board )
			
			/* 썸머노트 실행 */
			$(document).ready(function() {
			  //$('#summernote').summernote( {설정객체} );
			  $('#summernote').summernote( {
				
					plasceholder : '내용 입력 해주세요' , 
					maxHeight : null , 
					minHeight : 300
				});
				
			}); 
			
		}
	})
}
function bupdate(){
	alert('dd');
}