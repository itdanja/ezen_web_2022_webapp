package DATABAES.ch3기본문법;

import java.util.ArrayList;
import java.util.Scanner;

public class 실행 {
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner( System.in);
		while(true) {
			for( int i = 1 ; i<=19 ;i++) {
				System.out.println( i +"번 select 예제결과 ");
			} // for end 
			
			System.out.print(" 예제 번호 선택 : ");
			int ch = scanner.nextInt();
			
			// 메소드 호출 방법
				// 1. static(정적) 선언된 함수 : 클래스명.함수명()
				// 2. 일반함수 : 객체명.함수명() 
			
			DAO dao = new DAO(); // dao 객체 생성 
			
			// 1. 
			if( ch == 1 ) {
				ArrayList< MemberDto > list = dao.예제1결과();
				System.out.println("---------------- 예제1 결과물 ---------------");
				// 향상된 for문
				for( MemberDto dto : list ) { // list 내 모든 객체를 하나씩 반복대입
					System.out.print( dto.mem_id		+"\t" );
					System.out.print( dto.mem_name 		+"\t");
					System.out.print( dto.mem_number 	+"\t");
					System.out.print( dto.addr 			+"\t");
					System.out.print( dto.phone1 		+"\t" );
					System.out.print( dto.phone2 		+"\t" );
					System.out.print( dto.height 		+"\t" );
					System.out.print( dto.debut_date 	+"\n" );
				} // for end 
			} // ch == 1 end 
			
			// 19.
		} // while end
	} // main end
} // class end 








