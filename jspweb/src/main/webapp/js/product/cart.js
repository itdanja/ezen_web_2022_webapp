




// [전역변수]
let cartlist = null; // 장바구니 리스트 
let totalprice = 0;	// 총 주문금액

getcart()

let checkbtnlist = document.querySelectorAll('.checkbtn') // 1. 모든 체크박스 가져오기 

checkbtnlist[0].addEventListener('click' , (e)=>{
	//  첫번째 체크박스에 체크가 되어 있는경우 모든 체크박스에 체크 
		// e.currentTarget : 이벤트를 발생시킨 대상의 이벤트 정보
			// checked : 속성 [ 체크 여부 ] radio , checkbox
	if( e.currentTarget.checked == true  ){ // 만약에 첫번째 체크박스가 체크 되어 있으면
		checkbtnlist.forEach( c => { c.checked = true; } )	//모든 체크박스에 체크
	}
	// 아니면 모든 체크박스에 체크 제거 
	else{  checkbtnlist.forEach( c => { c.checked = false ; } ) }
})

// 2. 장바구니에서 체크된 제품만 결제 페이지 이동 
function payload(){
	
}

// 1. 장바구니 정보 호출 
function getcart(){
	
	$.ajax({
		url : "/jspweb/product/cart", 
		type : "get" ,
		async : false , 	// 결과가 있을때까지 대기 상태 
		success : re =>{ 
			cartlist = JSON.parse( re )
			let html = '<tr>'+
							'<th width="5%"><input  type="checkbox" class="checkbtn"></th>'+
							'<th width="10%"> 이미지 </th>'+
							'<th width="40%"> 상품정보 </th>'+
							'<th width="15%"> 수량 </th> '+
							'<th width="15%">가격</th> '+
							'<th width="10%"> 비고 </th> '+
						'</tr>';
			cartlist.forEach( c => {
				html +=  '	<tr>'+
								'<td> <input type="checkbox" class="checkbtn"> </td>'+
								'<td> <img width="80%" alt="" src="/jspweb/admin/pimg/'+c.pimg+'"> </td>'+
								'<td> '+c.pname+' <br> - '+c.pcolor+' / '+c.psize+' </td>'+
								'<td> '+c.amount+' </td>'+
								'<td> '+c.amount * (c.pprice - ( c.pprice * c.pdiscount ) )+' </td>'+
								'<td> <button>삭제</button> </td>'+
							'</tr>';
				totalprice += c.amount * (c.pprice - ( c.pprice * c.pdiscount ) )
			})
			document.querySelector('.cart_t').innerHTML = html
		}
	})
}

let member = null;
getmember();
function getmember(){
	$.ajax({
		url :  "/jspweb/member/info" , 
		success: re =>{ member =  JSON.parse( re ) }
	})
}
/* 아임포트 [ 결제 API ] */
function requestPay() {
	var IMP = window.IMP; 
	IMP.init("imp14103839"); // [본인]관리자 식별코드 [ 관리자 계정마다 다름 ] 
  	IMP.request_pay({ 
      pg: "kcp",	// pg 카드 
      pay_method: "card",
      merchant_uid:  "",   //주문번호 [ 1.자동번호 2.직접( 날짜+시간+mid+난수 ) ]
      name:  cartlist[0].pname +"외 "+cartlist.length ,	// 제품명 [ 장바구니에 ]
      amount:  totalprice ,                        	 // 숫자타입
      buyer_email: "" ,
      buyer_name: "" ,
      buyer_tel: "" ,
      buyer_addr: "" ,
      buyer_postcode: ""
  }, function (rsp) { // callback
      if (rsp.success) {// 결제 성공 시 로직
    		
      } else { // 결제 실패 시 로직 [ 테스트 -> 실패(성공)]
         
      }
  });
}
    


















