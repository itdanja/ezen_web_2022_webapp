package model;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Email {
	
	public static boolean sendemail( String 받는사람이메일 , String 내용 ) {
		//1. 보내는 사람 정보
		String 보내는사람이메일 = "kgs2072@naver.com"; 
		String 보내는사람이메일비밀번호 = ""; 
		//2. 호스트 설정 [ 네이버기준 = 고정 ]
		Properties properties = new Properties(); // 컬렉션프레임워크 [ map컬렉션 ]
		properties.put("mail.smtp.host","smtp.naver.com"); // 호스트 주소 
		properties.put("mail.smtp.port", 587);	// 호스트 포트번호
		properties.put("mail.smtp.auth", "true"); // 보내는사람이메일 인증
		properties.put("mail.smtp.ssl.protocols", "TLSv1.2"); // *보안 연결 버전 설정
		
		// 3. 인증처리 [ Session : javax.mail 패키지 ] 
			// Session.getDefaultInstance( 설정객체 , 인증객체 ) 
		Session session = Session.getDefaultInstance( properties , new Authenticator() {
			@Override // 오버라이딩 // 보내는사람의 이메일주소,비밀번호 인증 해주는 메소드 구현
			protected PasswordAuthentication getPasswordAuthentication() { 
				return new PasswordAuthentication(보내는사람이메일, 보내는사람이메일비밀번호);
			}
		});
		// 4. 메일 보내기 
		try {
			MimeMessage message = new MimeMessage(session);		// Mime 프로토콜 : 전자우편 표준 포멧[형식]
			message.setFrom( new InternetAddress(보내는사람이메일) ); // 보내는사람 
			message.addRecipient( Message.RecipientType.TO , new InternetAddress(받는사람이메일) ); // 받는사람이메일
		
			message.setSubject("EZEN쇼핑몰 회원 임시 비밀번호"); // 메일 전송 
			message.setText( " 회원님의 임시비밀번호 : " + 내용 );
			// 전송
			Transport.send(message); return true;
		}catch (Exception e) { System.out.println("메일전송실패 "  +e);} return false;
	}
	


}
