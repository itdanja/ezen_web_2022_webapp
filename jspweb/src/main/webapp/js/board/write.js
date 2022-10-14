
function bwrite(){
	
	// form 버전 
	let form = document.querySelector('form') // 1. form 태그 호출
	console.log( form )
	
	let formdata = new FormData( form )	// 2. 객체화된 form 정보 호출 
	console.log( formdata )
	
	$.ajax({ // ajax 통신 전송타입 : 문자열
		udl : "http://localhost:8080/jspweb/board/write",
		data : formdata , // ajax 기본값으로 form 전송 불가능 
		contentType : false , // 전송할 데이터의 타입 
		processData : false , // 전송시 사용되는 타입 
		type : 'POST' , // http메소드 [ get(첨부파일x) vs post ]
		success : function( re ){ alert( re) }
	})
	
	/*
	// form 없는 버전 
	let inputs = document.querySelectorAll('input')
	console.log( inputs ) // inputs[0] : 헤더에 검색 입력창
	let data = {
		btitle : inputs[1].value , 	
		bcontent : inputs[2].value
	}
	console.log( data )
	$.ajax({
		url : "http://localhost:8080/jspweb/board/write" ,
		data : data ,
		success : function ( re ){
			if( re === 'true'){ alert('글등록'); location.href="list.jsp"}
			else{ alert('글등록실패') }
		 }
	})
	*/
}

/*
	let 객체 = { 속성명 : 데이터 , 속성명 : 데이터 ~~ }


*/
