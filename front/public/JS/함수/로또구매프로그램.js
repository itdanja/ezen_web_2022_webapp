/*
	로또 구매 
		1.사용자 6개 버튼 선택한다.
			조건: 중복배제
		2.컴퓨터 추첨번호[1~45난수] 생성
		3.사용자 추첨번호 비교 결과
	
 */

// 변수는 지역변수 특징 = { } 안으로 들어갈수 있다. { } 밖으로 못나감  
let select_number = [ ]	// 여러개 함수에서 호출(사용) 될 예정 
// 1. 버튼 만들기함수 
function btn_print(  ){
	let btnlist = '' // 1~45의 버튼을 저장하는 변수 
	for( let i = 1 ; i<=45 ; i++ ){
		// i는 1부터 45까지 1씩증가 반복
		btnlist += `<button id=${i} onclick=btn_click(${i}) >${i}</button>`
		// i가 5 배수이면 줄바꿈
		if( i % 5 == 0 ){ btnlist +='<br>'}
	} // for end 
	// 현재문서의 btnbox 라는 id 갖는 태그 호출해서 html에 변수 대입 
	document.getElementById('btnbox').innerHTML = btnlist;
}
// 2. 버튼 눌렀을때 함수 [ 매개변수 : i -> 내가 클릭한 버튼의 순서 ]
function btn_click( i ){
	// 중복배제
	if ( select_number.indexOf( i ) >= 0 ){
	// 배열명.indexOf( 데이터 ) : 배열내 해당데이터의 인덱스 검색 
		// 해당 데이터가 존재하면 찾은 인덱스 출력  // 해당 데이터가 존재하지 않으면 -1 출력 
		alert('이미 선택한 번호입니다. [ 다시 선택 ]')
		return // 함수 종료 
	}
	// 선택한 번호 배열 저장 
	select_number.push( i ) // 배열명.push( 데이터 ) : 배열에 데이터 추가 
}
// 3. 추첨번호 생성 함수 
function lotto_number(){
	
}
// 4. 추첨번호 비교 결과 함수 
function lotto_result(){
	
}
 
 
 
 
 
 
 