

function findid() {
	const mname = document.querySelector('#mname').value
	const memail = document.querySelector('#memail').value
	const findidbox = document.querySelector('#findidbox')
	$.ajax({
		url : "/jspweb/member/findid" ,
		data : { "mname" : mname , "memail": memail } ,
		success : function( result ){
			if( result == 'null'){
				findidbox.innerHTML = '동일한 회원정보가 없습니다.';
			}else{
				findidbox.innerHTML = '회원님의 아이디 : '+result;
			}
		}
	});
}

function findpassword() {
	const mid = document.querySelector('#mid').value
	const memail = document.querySelector('#memail').value
	const findpasswordbox = document.querySelector('#findpasswordbox')
	$.ajax({
		url : "/jspweb/member/findpassword" ,
		data : { "mid" : mid , "memail": memail } ,
		success : function( result ){
			if( result == 'null'){
				findpasswordbox.innerHTML = '동일한 회원정보가 없습니다.';
			}else{
				findpasswordbox.innerHTML = '이메일로 임시비밀번호가 전송되었습니다.';
			}
		}
	});
}