package java1.ch5클래스.EX12;

import java.util.Scanner;

// print , scanner : 입/출력 작성할 예정 

public class view {
	// * 함수 밖에 scanner 선언한 이유 : 모든 함수에서 같이 사용할려고 [ 필드 ]
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		start(); // 함수 호출 
	}
	
	// 1. 프로그램 시작하는 화면 구현 함수 [ 매개변수x / 반환x / 정적메소드: 호출시 객체 생략 가능 ]
	static void start() {
		while(true) { // 무한루프 
			view_boardlist(); // 무조건  view_boardlist( ) 함수 호출 
			System.out.print("1.글쓰기 2.글보기 선택 : ");
			int ch = scanner.nextInt();
			if( ch == 1 ) { view_regist(); } // 만일 1번 입력했으면 view_regist(); 함수 호출 
			else if( ch ==2 ) { view_board(); } // 만일 2번 입력햤으면 view_board(); 함수 호출 
			else { System.out.println("안내) 알수 없는 번호입니다. ");} // 그외
		}
	} // start end 
	
	// 2. 게시물을 등록하는 화면 구현 함수 
	static void view_regist() { 
		System.out.println(">>> 게시물 등록 페이지 "); 
		System.out.print(" 제목 : "); 		String title = scanner.next();
		System.out.print(" 내용 : ");		String content = scanner.next();
		System.out.print(" 작성자 : ");		String writer = scanner.next();
		System.out.print(" 비밀번호 : ");		String password = scanner.next();
		
		// 1. 메소드 호출[ 통신 ] 
		boolean result = 
		Contorller.con_regist( title , content , writer , password );
		
		// 2. 메소드 호출한 결과
		if( result ) {
			System.err.println("안내) 게시물 등록 완료 ");
		}else {
			System.err.println("안내) 게시물 실패 [ 관리자에게 문의 ] ");
		}
	}
	
	// 3. 게시물 상세페이지 화면 구현 함수 
	static void view_board( ) { System.out.println(">>> 게시물 상세 페이지 "); }
	
	// 4. 게시물 목록 화면 구현 함수
	static void view_boardlist() { System.out.println(">>>게시물 목록 페이지 "); } 
	
}




