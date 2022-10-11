

/* ---------------- 회원정보 호출 -------------- */
$.ajax({
	url : "/jspweb/member/info" , 
 	success : function( result ) {
		// HTTP 스트림( 바이트단위 ) json형식의 문자타입을 JSON 타입으로 형변환 
		let member = JSON.parse( result )
		document.querySelector("#mno").innerHTML = member.mno
		document.querySelector("#mid").innerHTML = member.mid
		document.querySelector("#mname").innerHTML = member.mname
		document.querySelector("#mphone").innerHTML = member.mphone
		document.querySelector("#memail").innerHTML = member.memail
		document.querySelector("#maddress").innerHTML = member.maddress
		document.querySelector("#mdate").innerHTML = member.mdate
		document.querySelector("#mpoint").innerHTML = member.mpoint
	}
});

/* ---------------- 모든 회원 호출 -------------- */
$.ajax({
	url : "http://localhost:8080/jspweb/member/infolist",
	success : function( result ){
		let memberlist = JSON.parse( result )
		console.log( result  )
	}
})


/*
	선언 : let 객체명 = { 속성명 : 값 , 속성명 : 값 , 속성명 : 값 }
	호출 : 객체명.속성명
*/

