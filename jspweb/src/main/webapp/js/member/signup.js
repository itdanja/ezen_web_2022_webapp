


let idj = /^[a-zA-Z0-9]{5,15}$/;

const mid = document.querySelector('#mid') 
const midconfirmbox = document.querySelector('#midconfirmbox') 

mid.addEventListener('keyup' , ( e) => {
	console.log( e );
	if( idj.test( mid.value ) ){ // 정규표현식과 같으면
		midconfirmbox.innerHTML="통과";
		$.ajax({
			url : "/jspweb/member/idcheck" ,
			data : { "mid" : mid.value },
			success : function( result ){
				alert( result );
				if( result == 'true' ){
					midconfirmbox.innerHTML="사용중인아이디";
				}else{
					midconfirmbox.innerHTML="사용가능한아이디";
				}
		}
		
	});
	}else{
		midconfirm.innerHTML="한글을 제외한 영문+숫자 5~15 사이 문자열";
	}
})

let passswordj = /^[a-zA-Z0-9]{5,15}$/; // 정규표현식

const mpassword = document.querySelector('#mpassword')
const mpasswordconfirm = document.querySelector('#mpasswordconfirm')
const mpasswordconfirmbox = document.querySelector('#mpasswordconfirmbox') 

mpassword.addEventListener('keyup' , ( e) => {
	
	if( passswordj.test( mpassword.value ) ){ // 정규표현식 같으면
		if( mpassword.value == mpasswordconfirm.value ){ // 비밀번호 와 비밀번호체크 와 다르면
			mpasswordconfirmbox.innerHTML = "사용가능한 비밀번호 입니다.";
		}else{
			mpasswordconfirmbox.innerHTML = "두 비밀번호가 같지 않습니다.";
		}
	}else{
		mpasswordconfirmbox.innerHTML = "영소문자 5~15 사이로 입력해주세요!";
	}
	
})

mpasswordconfirm.addEventListener('keyup' , ( e) => {
	if( passswordj.test( mpasswordconfirm.value ) ){ // 정규표현식 같으면
		if( mpassword.value == mpasswordconfirm.value ){ // 비밀번호 와 비밀번호체크 와 다르면
			mpasswordconfirmbox.innerHTML = "사용가능한 비밀번호 입니다.";
		}else{
			mpasswordconfirmbox.innerHTML = "두 비밀번호가 같지 않습니다.";
		}
	}else{
		mpasswordconfirmbox.innerHTML = "영소문자 5~15 사이로 입력해주세요!";
	}
})


let namej = /^[가-힣]{2,10}$/;	// 한글만 2~10 정규표현식
const mname = document.querySelector('#mname')
const mnameconfirmbox = document.querySelector('#mnameconfirmbox')


mname.addEventListener('keyup' , ( e) => {
	if( namej.test(mname.value) ){ // 정규표현식 같으면
		mnameconfirmbox.innerHTML = "가능한 이름";
	}else{
		mnameconfirmbox.innerHTML = "불가능해요";
	}
})

let phonej = /^([0-9]{2,3})-([0-9]{3,4})-([0-9]{3,4})$/;
let emailj = /^[a-zA-Z0-9]{3,20}$/;



























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