package java1.ch8인터페이스;

import java.util.Scanner;

public class EX2_실행 {
	// 멤버변수 = 메소드영역 
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		게임패드 지역변수_스택1; // 1. 인터페이스 변수 선언
		while( true ) {
			System.out.print("1.축구 2.비행기 : ");
			int ch = scanner.nextInt();
			if( ch == 1 ) { 
				지역변수_스택1 = new 축구게임();	// 2. 인터페이스변수에 구현객체 주소 대입 
				System.out.println(" 축구게임 탑재 ");
				게임스타트( 지역변수_스택1 );
			}
			else if ( ch == 2 ) {
				지역변수_스택1 = new 비행기게임();	
				System.out.println(" 비행기 탑재 ");
				게임스타트(지역변수_스택1);
			}
		}
	}
	public static void 게임스타트( 게임패드 지역변수_스택2 ) {
		while(true) {
			char 버튼 = scanner.next().charAt(0);
			if( 버튼 == 'A') { 지역변수_스택2.A버튼(); }
			if( 버튼 == 'B') { 지역변수_스택2.B버튼(); }
			if( 버튼 == 'C') { 지역변수_스택2.C버튼(); }
			if( 버튼 == 'E') { return; }
		}
	}
}





