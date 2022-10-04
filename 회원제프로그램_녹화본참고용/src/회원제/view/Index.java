package 회원제.view;

import java.util.Scanner;

import 회원제.controller.MemberController;
import 회원제.model.dto.MemberDto;

public class Index {
	Scanner scanner = new Scanner(System.in);
	public static Index getInstacne() { return index; } // 접근제한자 반환타입  함수명( 매개변수 ) { 코드~ return 값; }
	private static Index index = new Index();
	private Index() {} // 변수 선언 : 자료형 변수명 
	
	public void mainpage( ) { // 0.메인페이지 
		System.out.println("1.메인페이지 호출 ");
		while(true) {
			System.out.print("1.회원가입 2.로그인 3.아이디찾기(이름,핸드폰) 4.비밀번호찾기(아이디,핸드폰)");
			int ch = scanner.nextInt();
			if( ch == 1 ) { signup(); }
			else if( ch == 2 ) { login(); }
		}
	}
	public void signup() {
		System.out.print("아이디 : ");	String id = scanner.next();
		System.out.print("비밀번호 : ");	String password = scanner.next();
		System.out.print("이름 : ");		String name = scanner.next();
		System.out.print("휴대전화 : ");	String phone = scanner.next();
		MemberDto dto = new MemberDto( 0 , id, password, name, phone);
		int result =  MemberController.getInstance().signup(  dto  );
		if( result == 1  ) { System.out.println("회원가입 성공했어 ");}
		else if( result == 2 ) { System.out.println("회원가입 실패 했어.");}
		else if( result == 3 ) { System.out.println("[중복검사]사용중인 아이디 ");}
	}
	public void login() {
		if( MemberController.getInstance().getLogin() == true ) { System.out.println("이미 로그인중이야."); return; }
		System.out.print("아이디 : ");	String id = scanner.next();
		System.out.print("비밀번호 : ");	String password = scanner.next();
		boolean result =  MemberController.getInstance().login(id, password);
		if( result ) { System.out.println("로그인 성공했어"); MemberController.getInstance().setLogin(true); menu(); }
		else System.out.println("로그인 실패했어.");
	}
	public void menu() {
		while(true) {
			System.out.println("1.기능기능 ~~~  8.로그아웃");
			int ch = scanner.nextInt();
			if( ch == 8 ) { System.out.println("로그아웃"); MemberController.getInstance().setLogin(false); break;  }
		}
	}
	
	
	
	
	
	
	
	
	
	
}
