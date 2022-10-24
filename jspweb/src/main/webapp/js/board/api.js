
/* 카카오 지도 API */

// 2. 지도 옵션 
var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
    mapOption = { 
        center: new kakao.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표
        level: 14 // 지도의 확대 레벨 [ 1[확대] ~ 14[축소] ]
    };

// 3. 지도를 표시할 div와  지도 옵션으로  지도를 생성합니다
var map = new kakao.maps.Map(mapContainer, mapOption); 

////////////////////


$.ajax({
	url : "/jspweb/board/api" , 
	success: function( re ){
		let json = JSON.parse(re)
		console.log( json )			// json : 전체 객체 
		let datalist = json.data 	// datalist : 객체중에 data 속성[키,필드] 호출 // 약국 리스트 
		console.log( datalist )
		let html = '';
		for( let i = 0 ; i<datalist.length ; i++){	// 약국 하나씩 호출 
			let data = datalist[i]	// i번째 약국 임시 변수 
			html += '<tr>'+
						'<td>'+data.약국명+'</td><td>'+data.대표전화+'</td><td>'+data.주소+'</td>'+
					'<tr>';
		} // for end 
		document.querySelector('table').innerHTML += html
	}
})




