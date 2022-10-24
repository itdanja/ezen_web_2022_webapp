
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




