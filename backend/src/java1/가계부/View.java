package java1.가계부;

import java.util.Scanner;

import java1.ch5클래스.EX12_비회원제시판_함수버전.view;

public class View {
	
	Scanner scanner = new Scanner(System.in);
	Controller control = new Controller();	// 메소드 호출 할려고 객체 생성 
	
	public static void main(String[] args) {  
		View view = new View();    // 메소드 호출 할려고 객체 생성 
		view.menu(); 
	}
	// 0.메인메뉴 화면 메소드 
	void menu() {
		while( true ) {
			read();
			System.out.println("1.추가 2.수정 3.삭제 4.검색 5.통계");
			int btn = scanner.nextInt();
			if( btn == 1 ) { create(); }
			else if( btn == 2 ) { update(); }
			else if( btn == 3 ) { delete(); }
		}
	}
	// 1. 내용 추가 화면 메소드 
	void create() { 
		System.out.print("날짜 : "); String edate = scanner.next();
		System.out.print("금액 : ");	int emoney = scanner.nextInt();
		System.out.print("내용 : ");	scanner.nextLine(); String ecomment = scanner.nextLine();
		boolean result = control.create( edate , emoney , ecomment );
		if( result ) { System.out.println("등록성공");}
		else { System.out.println("등록실패");}
	}
	// 2. 내용 출력 화면 메소드 
	void read() { }
	// 3. 내용 수정 화면 메소드 
	void update() { }
	// 4. 내용 삭제 화면 메소드 
	void delete( ) { }
	
}










