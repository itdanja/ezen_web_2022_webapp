package java1.키오스크.관리자;

import java.util.Scanner;

public class AdminView {
	
	Scanner scanner = new Scanner(System.in);			// 입력 객체
	AdminController acontrol = new AdminController();	// 컨트롤 객체 [ 메소드 호출할려고 ]
	
	public static void main(String[] args) {
		AdminView admin = new AdminView();
		admin.menu();
	}
	
	// 1. 관리자 메뉴 
	void menu() {
		while(true) {
			System.out.print("1.메뉴추가 2.제품추가 3.주문확인 : ");
			try {
				int ch = scanner.nextInt();
				if( ch == 1 ) {  inMenu( ); }
				else if( ch == 2 ) {  inProduct(); }
				else if( ch == 3 ) { getOrder( ); }
				else { System.out.println("안내) 알수없는 번호입니다. ");}
			}catch (Exception e) { 
				System.out.println("안내) 선택할수 없는 작동입니다. "); 
				scanner = new Scanner(System.in); // scanner 객체 초기화
			} // catch end 
			
		}  // while end 
	} // menu end 
	
	// 2. 메뉴 추가 화면 
	void inMenu( ) { 
		System.out.print("추가할 메뉴 이름 : ");	
		String menuname = scanner.next();
		boolean result =  acontrol.inMenu( menuname );
		
		if( result ) { System.out.println("안내) 메뉴 등록 했습니다. ");}
		else { System.out.println("안내) 메뉴 실패 했습니다. "); }
		
	}
	// 3. 제품 추가 화면 
	void inProduct( ) { }
	// 4. 주문 확인 화면 
	void getOrder( ) { }
	
	
}



