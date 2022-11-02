
/*
	document.querySelector('tag명')
	document.querySelector('#id명')
	document.querySelector('.class명')
	여러개[배열] : document.querySelectorAll()
	-- 속성[ 해당 tag내에서 사용가능한 속성 ]
		value 		:  div,span,td 등 사용불가
		innerHTML
		src : 
		style : 
*/

///////////////////////////////////// 공통변수  // 전역변수 [ 여러 함수에서 공유해서 사용하기 위한 목적 ]////////////////////
let stock = null // 재고목록  
let product = null // 제품 
let color = null; /// 선택된 색상 
let productlist = [] // 선택된 제품옵션 [색상,사이즈,개수] 리스트/목록 선언 
// *. 현재 페이지내 제품번호[ a href="링크?pno=제품번호" ]를 가지고 와서 ajax로 해당 제품번호의 모든 제품정보를 가져오자 
let pno = document.querySelector('.pno').value
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////// 이벤트 /////////////////////////////////////////////////
// **색상 select 박스를 체인지 했을때 이벤트 
document.querySelector('.cselect').addEventListener('change' , (e)=>{
	color = e.currentTarget.value	// 이벤트를 발생한 객체[cselect]의 담겨져있는 값 
	// 8. 색상 select 에서 선택된 색상 의 사이즈 select 구성 
	let shtml = '<option>-[필수] 사이즈 선택</option>'
	stock.forEach( s => {
		if( s.pcolor == color ){	// 재고목록중 색상 과 선택된 색상 같으면 해당 사이즈 html 구성
			shtml += '<option value='+s.psize+'> '+s.psize+' </option>'
		}
	})
	document.querySelector('.sselect').innerHTML = shtml
})

// **사이즈 select 박스를 체인지 했을때 이벤트
document.querySelector('.sselect').addEventListener('change' , (e)=>{
	let size = e.currentTarget.value
	// 선택된 제품정보와 옵션을 객체 만드다.
	let sproduct = {
		pcolor : color , 	// 색상
		psize : size , 		// 사이즈 
		amount : 1			// 수량
	}
	productlist.push( sproduct ) // 리스트에 담는다.
	print() // 리스트에 존재하는 객체를 출력한다. 
})
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// js 열람시 최초로 함수 1번 실행 

getproduct( pno ) 	// 제품 정보 호출 [ pno ]
getstock( pno )		// 제품 재고 호출 [ pno ]
sethtmlprint()		// *위 메소드 안에 있는 ajax가 모두 실행된 후에 print 실행
// 1. 해당 제품 번호의 제품정보 호출 
function getproduct( pno ){
	$.ajax({	// 결과와 상관없이 다음코드가 진행 [ async : true 결과를대기X VS async : false 결과를대기O  ]
		url : "/jspweb/admin/regist" ,	
		type : "get" , 
		async : false , 	// 결과가 있을때까지 대기 상태
		data : { "type" : 2 , "pno" : pno } ,
		success : re => { product = JSON.parse( re );  }
	})
}
// 2. 해당 제품의 정보를 HTML 대입 메소드 
function sethtmlprint(){
		document.querySelector('.pimg').src ='/jspweb/admin/pimg/'+product.pimg // 1.제품사진 대입
		document.querySelector('.pname').innerHTML = product.pname// 2.제품명 대입
		document.querySelector('.pcomment').innerHTML = product.pcomment // 3.제품설명 대입
		let phtml = '' // 4.가격 대입
		if( product.pdiscount == 0 ){ // 2. 할인이 없을때	[ 천단위 쉼표 함수 : 데이터.toLocaleString() ]
			phtml += '<span class="psale">'+(product.pprice.toLocaleString() )+'원</span>'
		}else{ // 1. 할인이 있을때						[ 반올림(소수점버리고 반올림) : Math.round( 데이터 ) ]
			phtml +=
				'<span class="pdiscount">'+ Math.round( product.pdiscount * 100 )+'%</span>'+
				'<span class="pprice">'+( product.pprice.toLocaleString() )+'원</span>'+
				'<span class="psale">'+ ( product.pprice -( product.pprice * product.pdiscount ) ).toLocaleString() +'원</span>'
		}
		document.querySelector('.pricebox').innerHTML = phtml 
		
		let sizelist = [ ]						// 1. 중복이 있는 사이즈 배열 선언
		stock.forEach( s => {  sizelist.push( s.psize ) })	// 2.리스트에 담기 
		let sizeset = new Set( sizelist ) 		// 2. 사이즈 리스트 => set 목록 변경 [중복제거]
			console.log( sizeset ) 				// 3. 확인
		
			// 중복이 없는 사이즈목록 html 구성
		let shtml = '<span> [ '
		sizeset.forEach( s => { 
			shtml += " " + s +" "
		})
		shtml += ' ] </span>'
		
		document.querySelector('.sizebox').innerHTML = shtml
		
		// 7. 색상 select 구성  // 색상 목록 중복제거	[ set , includes , filter 등 ]
		let colorlist = []
		stock.forEach( s => {  colorlist.push( s.pcolor ) })
		let colorset = new Set( colorlist )
			console.log( colorset )			// 3. 확인
		
		let chtml = '<option>-[필수] 색상 선택</option>'
		colorset.forEach( c => { 
			chtml += '<option value='+c+'>'+c+'</option>'
		})
		document.querySelector('.cselect').innerHTML = chtml
}
// 3. 재고 가져오는 함수 메소드 
function getstock( pno ){ // 5. 현재 제품의 재고목록 호출 [ ajax ]
	$.ajax({
		url : "/jspweb/admin/stock" ,
		type : "get" , 
		async : false , 
		data : { "pno" : pno },
		success : (re) => { stock = JSON.parse( re ) }
	});
}
// 4. 선택된 제품옵션 리스트를 출력하는 함수 [ 1. 사이즈선택 했을때 2.옵션 제거 했을때 마다 실행]
function print(){
	let ohtml = '<tr> <th width="60%">상품명/옵션 </th>  <th width="25%">수량</th>  <th width="15%"> 가격 </th>  </tr>';
	productlist.forEach( p => {
		ohtml +=  '<tr>	'+
					'	<td> '+
					'		<span>미라클 라이트 경량 퀄팅 점퍼</span>'+
					'		<br>'+
					'		<span> -블랙 / FREE </span>'+
					'	</td>'+
					'	<td> '+
					'		<div class="row g-0"> '+
					'			<div class="col-md-3">'+
					'				<input class="form-control" value="1">'+
					'			</div>	'+
					'			<div class="col-md-4">	'+
					'				<button class="amount_btn">▲</button>'+
					'				<button class="amount_btn">▼</button>'+
					'			</div>'+
					'			<div class="col-md-1">	'+
					'				<button class="cancel_btn">x</button>'+
					'			</div>'+
					'		</div>'+
					'	</td>'+
					'	<td>'+
					'		<span> 20,000원</span> <br>'+
					'		<span class="pointbox"> (포인트)2000 </span>'+
					'	</td>'+
					'</tr>';
	})
	document.querySelector('.select_t').innerHTML = ohtml
}

















