/*

	- 함수
	1. 함수명()
	2. function(인수){ }
	3. 인수 => { }
	
	- 콜백함수 : 함수실행 반환 결과를 [콜백]함수에게 인수로 전달 
		- 함수1 에서 실행된 반환값을 콜백함수의 인수로 전달
	1. 함수1( 콜백함수2(인수) )	
	2. 함수1( 인수 => function(인수){ } )
	3. 함수1( 인수 => { } )
	
	- 활용
	.addEventListener( '이벤트명' , 함수호출[1~3] )
	.forEach( 인수 => { 코드 } )
*/


let cselect = document.querySelector('.cselect') // 카테고리 선택 상자 
let pselect = document.querySelector('.pselect') // 제품 선택 상자

// 카테고리 선택를 클릭했을떄 제품출력 메소드 호출
cselect.addEventListener( 'click' , getproduct( ) )

/*1. 페이지 열리면 모든 카테고리 select 넣어주기 */
getcategory()
function getcategory(){
	$.ajax({
		url : "/jspweb/board/pcategory" , 
		type : 'get',
		success : function( re ){
			let json = JSON.parse( re )
			// 배열객체.forEach( 반복변수명[아무거나] , 인덱스 , 배열객체명 => { 실행코드 } )
			let html = ''
			json.forEach( c => {
				html += `<option value=${c.pcno}> ${c.pcname}</option>`
			})
			cselect.innerHTML = html
		}			
	})
}
/*2. 선택된 카테고리별 제품리스트를 select 넣어주기 */
function getproduct(){
	alert('선택된 카테고리의 제품 출력')
}




