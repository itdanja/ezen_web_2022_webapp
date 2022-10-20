package controller.board;

import javax.websocket.server.ServerEndpoint;

import java.io.IOException;
import java.util.Vector;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;

//@WebServlet("/chatting")		// 서블릿 URL 만들기
@ServerEndpoint("/chatting")	// 웹서버에 웹소켓 URL 만들기 
public class chatting {
	// 서버소켓 들어온 클라이언소켓 명단
		// arraylist vs Vector [ 동기화x vs 동기화o ]
	public static Vector<Session> clients = new Vector<>();
	
	@OnOpen	// 서버소켓이 들어왔을때 
	public void OnOpen( Session session ) { 
		clients.add(session); // 접속된 클라이언트소켓을 저장 
	}	
	@OnClose // 서버소켓 을 나갔을때 
	public void onClose( Session session ) { }
	@OnMessage // 서버소켓 에 메시지 왔을때 
	public void onMessage( Session session , String msg ) throws IOException {
		for( Session s : clients ) { 	// 접속된 클라이언트 소켓 을 하나씩 호출
			s.getBasicRemote().sendText(msg);
		}
	}
}








