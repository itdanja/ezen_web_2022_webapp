

/* ---------------- 회원정보 호출 -------------- */
$.ajax({
	url : "/jspweb/member/info" , 
 	success : function( result ) {
		// 통신된 json형식의 문자타입을 JSON 타입으로 형변환 
		let member = JSON.parse( result )
		alert( member.maddress )
	}
});

