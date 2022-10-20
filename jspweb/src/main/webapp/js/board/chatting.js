let websocket = null // 웹소켓 선언 
// 1. JS 지원하는 클라이언트 웹소켓 클래스 [ new WebSocket ] 
let mid = document.querySelector('.mid').value
// 2. 만약에 로그인이 되어 있는경우에만 서버소켓으로부터 접속한다. 
if( mid !== 'null' ){ 
	websocket = new WebSocket("ws://localhost:8080/jspweb/chatting/"+mid); 
	// 3. 2번에서 구현된 메소드를 클라이언트소켓에 대입 
	websocket.onopen = function( e ){ onopen(e) }
	websocket.onclose = function( e ){ onclose(e) }
	websocket.onmessage = function( e ){ onmessage(e) }
}else{
	alert('로그인하고 오세요~'); location.href="../member/login.jsp";
}
// 2. 메소드 구현 [ 1.접속했을때 , 2.나갔을때 3. 메시지보내기 4. 메시지 받았을때  ]
function onopen(e){ alert('채팅방에 들어왔습니다.'+ e ) }
function onclose(e){ alert('채팅방에 나갔습니다.'+ e ) }
	// 3. 메시지 보내기 
function send() {
	// 1. 입력상자에 입력된 데이터 가져온다
	let msg =  document.querySelector('.msgbox').value
	// 메시지 전송
	websocket.send( msg )
}
	// 4. 메시지 받았을때 
function onmessage(e){ 
	// 1. 출력 구역 호출 
	let contentbox = document.querySelector('.contentbox')
	// 2. 받은 메시지를 html 꾸미기 
	let html = '<div>'+e.data+'</div>';
	// 받은 메시지를 html 추가한다.
	contentbox.innerHTML += html
 }









