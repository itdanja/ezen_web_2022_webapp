
getcart()
function getcart(){
	$.ajax({
		url : "/jspweb/product/cart", 
		type : "get" , 
		success : re =>{ 
			let cartlist = JSON.parse( re )
			let html = '<tr><th width="5%"><input type="checkbox"></th><th width="10%"> 이미지 </th><th width="40%"> 상품정보 </th><th width="15%"> 수량 </th> <th width="15%">가격</th> <th width="10%"> 비고 </th> </tr>';
			cartlist.forEach( c => {
				html +=  '	<tr>'+
								'<td> <input type="checkbox"> </td>'+
								'<td> <img width="80%" alt="" src="/jspweb/admin/pimg/'+c.pimg+'"> </td>'+
								'<td> '+c.pname+' <br> - '+c.pcolor+' / '+c.psize+' </td>'+
								'<td> '+c.amount+' </td>'+
								'<td> '+c.amount * (c.pprice - ( c.pprice * c.pdiscount ) )+' </td>'+
								'<td> <button>삭제</button> </td>'+
							'</tr>';
				
			})
			document.querySelector('.cart_t').innerHTML = html
		}
	})
}



/* 아임포트 [ 결제 API ] */

function requestPay() {
	var IMP = window.IMP; 
	IMP.init("imp14103839"); // [본인]관리자 식별코드 [ 관리자 계정마다 다름] 
  IMP.request_pay({ 
      pg: "kcp",
      pay_method: "card",
      merchant_uid: "ORD20180131-0000011",   //주문번호
      name: "노르웨이 회전 의자",
      amount: 64900,                         // 숫자타입
      buyer_email: "gildong@gmail.com",
      buyer_name: "홍길동",
      buyer_tel: "010-4242-4242",
      buyer_addr: "서울특별시 강남구 신사동",
      buyer_postcode: "01181"
  }, function (rsp) { // callback
      if (rsp.success) {
          // 결제 성공 시 로직,
      } else {
          alert('결제성공');
      }
  });
}
    


















