/*
	정규표현식 : 문자 특정 규칙 , 패턴 , 집합 표현할때 사용되는 언어
		 /^ : 정규표현식 시작 
		 $/ : 정규표현식 끝
		 [a-z] : 소문자 패턴
		 [A-Z] : 대문자 패턴
		 [0-9] : 숫자 패턴
		 { 최소길이 , 최대길이  } : 문자열 길이 패턴 
		 
		 검사 : 정규표현식.test( 데이터 )  : 맞으면 true , false
		 
		 1. /^[a-z0-9]{5,20}$/  : 소문자/숫자 조합 5~20글자 패턴
*/

/*----- 아이디 ------------ */
function mevent1(){
	let mid = document.querySelector("#mid").value
	let midj = /^[a-z0-9]{5,20}$/
	
	if( midj.test(mid) ){
		alert("O");
	}else{
		alert("X");
	}
	
	
	
}
/*----- 비밀번호 ------------ */
function mevent2(){
	alert('비밀번호 입력');
}
/*----- 비밀번호 확인 ------------ */
function mevent3(){
	alert('비밀번호 확인 입력');
}
/*----- 이름 ------------ */
function mevent4(){
	alert('이름 입력');
}
/*----- 전화번호 ------------ */
function mevent5(){
	alert('전화번호 입력');
}
/*----- 이메일 ------------ */
function mevent6(){
	alert('이메일 입력');
}
/*----- 주소 ------------ */

/*----- 회원가입 전송확인 ------------ */




/* 카카오 우편 api */
   //본 예제에서는 도로명 주소 표기 방식에 대한 법령에 따라, 내려오는 데이터를 조합하여 올바른 주소를 구성하는 방법을 설명합니다.
function sample4_execDaumPostcode() {
    new daum.Postcode({
        oncomplete: function(data) {
            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

            // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
            // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
            var roadAddr = data.roadAddress; // 도로명 주소 변수
            var extraRoadAddr = ''; // 참고 항목 변수

            // 법정동명이 있을 경우 추가한다. (법정리는 제외)
            // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
            if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                extraRoadAddr += data.bname;
            }
            // 건물명이 있고, 공동주택일 경우 추가한다.
            if(data.buildingName !== '' && data.apartment === 'Y'){
               extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
            }
            // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
            if(extraRoadAddr !== ''){
                extraRoadAddr = ' (' + extraRoadAddr + ')';
            }

            // 우편번호와 주소 정보를 해당 필드에 넣는다.
            document.getElementById('sample4_postcode').value = data.zonecode;
            document.getElementById("sample4_roadAddress").value = roadAddr;
            document.getElementById("sample4_jibunAddress").value = data.jibunAddress;
            
            // 참고항목 문자열이 있을 경우 해당 필드에 넣는다.
            if(roadAddr !== ''){
                document.getElementById("sample4_extraAddress").value = extraRoadAddr;
            } else {
                document.getElementById("sample4_extraAddress").value = '';
            }

            var guideTextBox = document.getElementById("guide");
            // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
            if(data.autoRoadAddress) {
                var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
                guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';
                guideTextBox.style.display = 'block';

            } else if(data.autoJibunAddress) {
                var expJibunAddr = data.autoJibunAddress;
                guideTextBox.innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';
                guideTextBox.style.display = 'block';
            } else {
                guideTextBox.innerHTML = '';
                guideTextBox.style.display = 'none';
            }
        }
    }).open();
}
/* 카카오 우편 api end */