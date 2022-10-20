// 1. JS 지원하는 클라이언트 웹소켓 클래스 [ new WebSocket ] 
let websocket =  new WebSocket("ws://localhost:8080/jspweb/chatting");
	
// 2. 메소드 구현 [ 1.접속했을때 , 2.나갔을때 3. 메시지보내기 4. 메시지 받았을때  ]
function onopen(e){ alert('채팅방에 들어왔습니다.'+ e ) }
function onclose(e){ alert('채팅방에 나갔습니다.'+ e ) }
function send() {
	websocket.send( '안녕하세요' )
}

function onmessage(e){ alert(e.data) }
// 3. 2번에서 구현된 메소드를 클라이언트소켓에 대입 
websocket.onopen = function( e ){ onopen(e) }
websocket.onclose = function( e ){ onclose(e) }
websocket.onmessage = function( e ){ onmessage(e) }



