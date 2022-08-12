/*
	1. 9개 버튼 생성 [ 게임판 변수에 모든 버튼를 저장한다. ]
		1. 3개마다 줄바꿈처리  2 5 8 일때 
	2. 버튼 클릭하면 모양 변경 
		1. 선택한 버튼의 모양 변경 [ O ]
		2. [컴퓨터]난수 발생 모양 변경 [ X ]
	3. 근접한 버튼의 모양이 3개 모두 동일하면 승리  
*/

let 게임상황 = []	// 현재 알을 둔 상황을 저장하는 배열

// 1. 게임판 버튼을 만들어주는 함수 
function 게임판그리기(){ 
	게임상황 = [null,null,null,null,null,null,null,null,null] // 배열에 9개 null로 초기화 
	let 게임판 = '' // 빈 변수 선언 
	for( let i = 0 ; i<9 ; i++ ){
		// i는 0부터 9미만 까지 1씩증가 [ 8회 반복 ]
		게임판 += `<button id=${i} onclick="버튼선택(${i})">${i}</button>`
		if( i % 3 == 2 ){ 게임판 +=`<br>` }
	} // for end 
	// html 태그 호출 
	document.getElementById('gameboard').innerHTML = 게임판
} // f end

// 2. 버튼을 눌렀을때 이벤트 함수 [ 매개변수 : i = 선택한 버튼 번호 ] 
function 버튼선택( i ){
	if( 중복검사(i) ){  // 3. 함수호출해서 해당 위치에 알이 있으면 함수 종료(return)
		alert('안내) 이미 둔 자리 입니다.') 
		return // 현 위치에서 함수 종료  [ 아래 코드가 실행X]
	}// if end 
	document.getElementById( i ).innerHTML = 'O' // 1.선택한 번호의 버튼 모양 변경 
	게임상황[i] = 'O' // 2. 해당 알을 배열에 저장 
	// 2.난수 발생 [ Math.floor(실수) : 소수점 버림 / Math.random() : 0~1 사이의 실수 난수 발생  ]
	while( true ){ // while(true) : 무한루프[ 종료조건 : 랜덤위치에 알을 두었을때 반복종료 ]
		let rand = Math.floor( Math.random()*9 )	// 0~8 사이의 난수 발생 
		if( !중복검사(rand) ){ // 해당 위치에 알이 없으면
			document.getElementById( rand ).innerHTML ='X' // 버튼 모양 변경  
			게임상황[rand] ='X'// 해당 알을 배열에 저장 
			break // while 탈출
		}// if end 
	} // while end 
} // f end 
// 3. 현재 위치에 알이 있는지 검사 함수 [중복검사]
function 중복검사(  i  ){
	if( 게임상황[i] != null ){ // 배열은 모두 null로 초기화했기때문에 null 아니면 'O'또는'X'가 존재하는 의미 [ 알이 있다. ]
		return true // 알이 있다.  null 이 아니면 
	}else{
		return false // 알이 없다.  null 이면 
	} 
}







