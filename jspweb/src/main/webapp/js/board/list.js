
let pageinfo = {  // js 객체 선언 
 	listsize : 3 ,  // 한페이지당 게시물 표시 개수 
	page  : 1 		// 현재 페이지 번호 
}

list( 1 ) // js 열람시 메소드 1번 실행  [ 첫 화면에서 1페이지 ]
function list( page ){ // 함수 정의한다
	
	pageinfo.page = page;	// 객체 정보 변경 

	$.ajax({
		url : "http://localhost:8080/jspweb/baord/list" , 
		data :  pageinfo ,	// 페이지 정보 객체 전달  
		success : function( re ){
			let boards = JSON.parse(re)
			console.log( boards )
			// 1. Object내 게시물리스트 호출 
			let boardlist = boards.data
			
			console.log( boardlist )
			let html = ""
			// boardlist -> 객체를 하나씩 꺼내기
			for( let i = 0 ;  i<boardlist.length ; i++){
				// 1. i번째 객체 호출 
				let b = boardlist[i]
				console.log( b )
				// 2. i번쨰 객체의 정보를 html 형식으로 변환해서 문자열에 저장
				html += '<tr>' +
							'<td>'+b.bno+'</td>'+
							//'<td><a href="http://localhost:8080/jspweb/board/view.jsp?bno='+b.bno+'">'+b.btitle+'</a></td>'+
							'<td onclick="viewload('+b.bno+')">'+b.btitle+'</td>'+
							'<td>'+b.mid+'</td>'+
							'<td>'+b.bdate+'</td>'+
							'<td>'+b.bview+'</td>'+
						'</tr>';
			} // for end 
				console.log( html )
			document.querySelector('.btalbe').innerHTML = html
			
			// 1. 페이징버튼 html 구성 
			let pagehtml = '';
				
				// 2. 이전 버튼 
				pagehtml += "<button>이전</button>";
			
				// 4. 페이지번호 버튼
				for( let page = 1 ; page<= boards.totalpage ; page++ ){
					pagehtml += '<button type="button" onclick="list('+page+')">'+page+'</button>'
				}
			
				// 3. 다음 버튼 
				pagehtml += "<button>다음</button>";
			
			document.querySelector('.pagebox').innerHTML = pagehtml
			
		}
	})
}

function viewload( bno ){
	$.ajax({
		url : "http://localhost:8080/jspweb/board/viewload" , 
		data : { "bno" : bno },
		success : function( re ){
			location.href = "http://localhost:8080/jspweb/board/view.jsp"
		}
	})
}





















