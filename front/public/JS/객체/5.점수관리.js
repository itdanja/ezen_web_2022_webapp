/*

	* 함수 : 1.정의[만들기] 2.호출[ 불러내기 ]
		-특징
			1. 함수 안에서 할당된 메모리는 함수 종료시 초기화[사라짐]
			
	* 학생 점수 프로그램
		1. 학생 객체 설계
		2. 점수 등록 버튼을 눌렀을때
			1. 해당 js 함수 호출하기 
			<button onclick="함수명() ">
			
			2. HTML에서 입력받은 데이터를 js객체에 저장 
			- 함수 등록 함수 사용 
			- document.getElementById('id명').value;
			
			3. 여러개의 객체를 저장 ----> 배열 
				- 배열은 다른 함수에서도 사용할 예정 [ 함수 밖에서 선언 ]
			
			4. HTML 초기화
				
*/
// 

let studentlist = [ ]

function 점수등록(){ // 2. 점수 등록 버튼을 눌렀을때
	// 1. 객체
	const student = {
		name : document.getElementById('name').value ,	/* 이름 속성[키:값] */
		kor : document.getElementById('kor').value ,		/* 국어 속성 */
		eng : document.getElementById('eng').value ,		/* 영어 속성 */
		mat : document.getElementById('mat').value		/* 수학 속성 */
	}
	// 2. 객체를 배열에 담기 
	studentlist.push( student ) // 배열명.push( 데이터 ) : 배열에 데이터 추가 
	// 3. 알림/확인 
	alert('학생 점수 등록이 되었습니다.')
	console.log( studentlist )
	// 4. HTML에 입력된 내용 지우기
	document.getElementById('name').value = ''
	document.getElementById('kor').value = ''
	document.getElementById('eng').value = ''
	document.getElementById('mat').value = ''
}




