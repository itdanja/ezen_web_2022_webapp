package java1.c조건문반복문;

public class EX3_FOR { // class s 
	public static void main(String[] args) { // main s 
		
		//p.150 1~10까지 출력 
			// 1. 반복문이 없을경우
			System.out.println("1"); System.out.println("2");
			System.out.println("3"); System.out.println("4");
			System.out.println("5"); System.out.println("6");
			System.out.println("7"); System.out.println("8");
			System.out.println("9"); System.out.println("10");
			
			// 2. 150p.
		for( int i = 1 ; i<=10 ; i++ ) { // 1.초기값 ; 2.조건문 ; 3.증감식 
			// i는 1 부터 10이하 까지 1씩증가 
			System.out.println( i );
		} // for end 
		
			// 3. 154p.
		int i = 1;				// 1. 초기값 
		while( i <= 10 ) {		// 2. 조건문 
			System.out.println( i );//3.실행문
			i++; // 4.증감식 
		} // while end 
	
		// ------------------------------------------------------------------------//
		// p.151 1~10까지 누적합계
			// 1. 
		int 합계1 = 0;	
		합계1 += 1;	합계1 += 2; 합계1 += 3; 합계1 += 4; 합계1 += 5; 
		합계1 += 6; 	합계1 += 7; 합계1 += 8; 합계1 += 9; 합계1 += 10;
			// 2. for
		int 합계2 = 0;
		for( int j = 1 ; j<=10 ; j++ ) {
			합계2 += j;
		}
			// 3. while
		int 합계3 = 0;
		int h = 1;
		while( h<=10 ) {
			합계3 += h;
			h++;
		}
		
		System.out.println(" 1결과 : " + 합계1 );
		System.out.println(" 2결과 : " + 합계2 );
		System.out.println(" 3결과 : " + 합계3 );
		
		// ------------------------------------------------------------------------//
		// 예3) 1부터 100까지 7배수의 누적합계
		// 1. 
		int 예제3합계 = 0;
		for( int X = 1 ; X<=100 ; X++ ) {
			if( X % 7 == 0 ) 예제3합계 += X;
		}
		System.out.println(" 예제3 결과 : " + 예제3합계 );
		// 2. 
		int 예제3합계2 = 0;
		for( int X = 0 ; X<=100 ; X+=7 ) {
			예제3합계2 += X;
		}
		System.out.println(" 예제3 결과 : " + 예제3합계2 );
		
		// ----------------------------------------------------------------// 
		// 예4 ) 2단의 구구단 출력 
			// 1. 반복문 없이 [ 변수하는 수 찾기 (조건찾기 ) ]
			System.out.println( "2 X 1 = 2");
			System.out.println( "2 X 2 = 4");
			System.out.println( "2 X 3 = 6");
			System.out.println( "2 X 4 = 8");
			System.out.println( "2 X 5 = 10");
			System.out.println( "2 X 6 = 12");
			System.out.println( "2 X 7 = 14");
			System.out.println( "2 X 8 = 16");
			System.out.println( "2 X 9 = 18");
			// 2. FOR 문 
		for( int 곱 = 1 ; 곱<=9 ; 곱++ ) {
			int 연산결과 = 2 * 곱;
			System.out.println( "2 X "+곱+" = "+연산결과);
		}
			// 3. While 문 
		int 곱2 = 1;
		while( 곱2 <= 9 ) {
			int 연산결과 = 2 * 곱2;
			System.out.println( "2 X "+곱2+" = "+연산결과);
			곱2++;
		}
		
			
		
		
		
			
		
		
	} // main e 
} // class e
/* 
 
 	반복문  : 조건이 true이면 실행문 반복
 		// 조건 반복 = for 사용   // 무한 반복 = while 사용 
 		1. for( 초기값 ; 조건문 ; 증감식 ){  실행문  }
 		2. 
 			초기값
 			while(조건문){
 				실행문
 				증감식 
 			}
 */


