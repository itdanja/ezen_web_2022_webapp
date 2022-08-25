
/*
	[ 호출 ]
	객체명.textContent
	객체명.innerHTML
	객체명.value 	 [ input , option 입력상자 등 / div span p X]
	
	[ 저장 = 대입 ]
	객체명.textContent = 값 
	객체명.innerHTML = 값 
	객체명.value 	 =  값 
	
*/


// 1. HTML 요소 가져오기 
const input = document.querySelector('#inchbox')
const button = document.querySelector('#inchbtn')
const p = document.querySelector('#inchp')

// 2. 버튼을 눌렀을때 
button.addEventListener( 'click' , () => { 
	
	const inch =  Number( input.value ) // Number( 문자 )  : 문자열 -> 숫자열
	// isNaN( 데이터 ) : 숫자가 아니면 true / 숫자이면 false
	if( isNaN( inch ) ){ // 입력값이 숫자가 아니면
		p.textContent ='숫자를 입력해주세요'
		return
	}
	// 입력값이 숫자이면 
	const cm = inch * 2.54
	p.textContent = `${cm} cm`	
})


// p.341
// 1. HTML 요소 가져오기 
const emailbox = document.querySelector('#emailbox') 
const emailp = document.querySelector('#emailp') 

// 이메일 검증 확인 함수 [ 익명 함수 ]
const isemail = ( value ) => {
	return ( value.indexOf('@') > 1 ) && ( value.split('@')[1].indexOf(".") > 1 )
			// 입력데이터의 @ 가 있는지   이면서  입력데이터의 @ 뒤문자
			//								qweqwe@naver.com
			//										naver.com -> . 가 있는지 
}

// [ 기본 함수 ]
function 함수( value ){
	return  ( value.indexOf('@') > 1 ) && ( value.split('@')[1].indexOf(".") > 1 )
}
// 이메일 입력상자에서 키보드를 입력할때마다 이벤트 발생 
emailbox.addEventListener('keyup' , ( event ) => {
	/* 이메일 상자에서 입력된 데이터를 변수에 저장 */
	const value = event.currentTarget.value	/* event.currentTarget : 현재 이벤트 중인 객체 */
	
	if( isemail(value) ){ 
		p.style.color = 'green'
		p.textContent = `이메일 형식입니다 : ${value}`
	}else{
		p.style.color = 'red'
		p.textContent = `이메일 형식이 아닙니다 : ${value}`
	}
	
})




/*
	배열명.indexOf('검색데이터') : 배열내 해당 데이터의 인덱스 번호 찾기 
	문자열.indexOf('@') : 문자열내 @ 의 인덱스 번호 찾기
		만약에 0보다 작으면 못찾았다~ [ 인덱스란 : 저장 순서 번호 = 0번 시작 ]
	문자열.split('기준문자') : 문자열내 기준문자 기준으로 분리[자르기] -> 배열
		예) 
			문자열 = 유재석/강호동/신동엽/하하
			문자열.split("/")		  :  [  유재석 , 강호동 , 신동엽 , 하하 ]
			문자열.split("/")[0]   : 유재석 
			문자열.split("/")[3]   : 하하 
*/

// p.343
// 1. HTML 요소 가져오기 
const selectbox = document.querySelector('#selectbox')
const selectp = document.querySelector('#selectp')

// 2. selectbox 의 데이터가 변경 될때마다 실행되는 이벤트 [ change ]
selectbox.addEventListener( 'change' , ( event ) =>{
	
	// 옵션목록 = select의 모든 option 호출  [ select객체.options ] = 배열
	const options = event.currentTarget.options
	// 선택한목록번호 = options 중에서 [사용자]선택된 번호 호출 
	const index = event.currentTarget.options.selectedIndex
	//							
	selectp.textContent = `선택 : ${options[index].textContent}`
	//							옵션목록[ 선택한목록번호 ].텍스트  호출 
})

// p.344
// 1. HTML 요소 가져오기
const selectbox2 = document.querySelector('#selectbox2')
const selectp2 = document.querySelector('#selectp2')

// selectbox2 가 데이터 변경 이벤트 발생 
selectbox2.addEventListener('change' , (event)=>{
	
	// 옵션목록 = selectbox2 모든 옵션들 호출 
	const options = event.currentTarget.options
	const list = [ ] // 선택된 옵션들의 저장하는 배열 선언
	
	for( const option of options ){
		// 배열[옵션목록]중 하나씩 option 대입 반복 
		if( option.selected ){ // 만약에 해당 옵션에 selected 속성[선택된 상자]이 있으면 
			// 배열에 선택된 옵션의 텍스를 추가 
			list.push( option.textContent )
		} // if end 
	} // for end 
	
	selectp2.textContent = `선택 : ${list.join(',')}`
	// 배열명.join('연결문자') : 배열내 모든 요소들을 연결문자 기준으로 하나의 문자열로 변환
		// 학생명 = [ '유재석' , '강호동' , '신동엽' ]
		// 학생명.join('<->')
		// 유재석<->강호동<->신동엽 
})


// p.345~6
let 현재값			/* input 입력된 데이터를 저장하는 변수 */
let 변환상수 = 10		/* select 에서 선택된 단위별 값 저장하는 변수 */
// 0.HTML 요소 가져오기 
const cmiput =  document.querySelector('#cmiput');
const cmspan =  document.querySelector('#cmspan');
const cmselect =  document.querySelector('#cmselect');

// 3. select 상자의 데이터를 변경했을때 이벤트
cmselect.addEventListener('change', (event)=>{
	// 1. 목록상자[currentTarget] 에서 모든 option 호출 
	const options = event.currentTarget.options
	// 2. 목록상자[currentTarget] 에서 선택된 인덱스 번호 호출 
	const index = event.currentTarget.options.selectedIndex
	// 3. 목록상자에서 선택된 인덱스 번호의 value 호출해서 변환상수에 대입
	변환상수 = Number( options[index].value )
	calculate() // 함수 실행
})

// 2. 
const calculate = () => {
	// span에 계산된 결과를 출력 [ toFixed(2) : 소수점 표시(소수점개수) ]
	cmspan.textContent = (현재값*변환상수).toFixed(2)
}

// 1. input 입력할때마다 현재값 변수를 입력된 값으로 변환해주는 이벤트
cmiput.addEventListener('keyup' , (event) =>{
	// * input 입력된 데이터(value) 숫자형으로 변환후 현재값 변수에 저장 
	현재값 = Number( event.currentTarget.value )
	calculate() // 함수 실행 
})













































































