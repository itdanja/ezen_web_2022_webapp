package java1.ch12스레드;

import java.awt.Toolkit;

public class EX1_스레드 {
	
	public static void main(String[] args) {
		// 스레드 : 한가닥 실 의미 [ 코드 읽는 하나의 흐름 ]
		// 멀티스레드 : 코드 읽는 여러개의 흐름 
		// main스레드 : main함수 시작될때 실행 ---> return 시 스레드 종료
		
		System.out.println(" --  싱글스레드 시작 --");
		// 1. p.525 // 싱글스레드 : 소리가 5번 출력되고 문자열 5번 출력된다.
		Toolkit toolkit = Toolkit.getDefaultToolkit();	// Toolkit : java ui 제공
		for( int i = 0 ; i<5 ; i++ ) {
			toolkit.beep(); // 비프음 소리 함수	[ 소리 속도보다 반복문이 더 빠르다.[스레드가 더 빠르다. ]
			try{ Thread.sleep( 500  ); }
			catch (Exception e) {}
			// 밀리초 : 1000/1초
			// Thread : 현재 스레드 
			// .sleep( 밀리초 ) : 스레드 일시정지 [ 무조건 예외처리try~catch 발생 ] 
		}
		
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("띵");
			try { Thread.sleep(500); } 
			catch (Exception e) { }
		}
		
		/////////////////////////////////////////////////////////////////////////////
		System.out.println(" --  멀티스레드 시작 --");
		// 2. p.526 
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();	// run 메소드 호출
		
		// main스레드 생성된스레드 실행후 다음코드 실행
		
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("띵");
			try { Thread.sleep(500); } 
			catch (Exception e) { }
		}
		
		
		return; // main 함수 종료 
	}
}
/* 
 	
 
									[멀티 태스킹 ]			[ 멀티프로세스 ]
	 									 				--> 프로세스		--> 스레드	[ 싱글스레드 ]
	 									 
	 								프로그램[애플리케이션]	--> 프로세스		--> 스레드1	[ 멀티스레드 ]
	 									크롬								--> 스레드2
	 					
	 									 				--> 프로세스
 					[윈도우]
하드웨어[주기억장치]	--> 운영체제			프로그램[애플리케이션]	--> 프로세스		--> MAIN스레드	[싱글스레드]
	메모리			[스케줄링]				자바
	 				[자바 제어X]							--> 프로세스		--> MAIN스레드
	 																	--> 스레드1 생성 
	 																	--> 스레드2 생성
	 				
	 				
	 				
	 								프로그램[애플리케이션]
	 
	 
	 운영체제 : 하드웨어 <----중개자----> 사람
	 -----------------------------------------------------------------------
	 멀티스레드[병렬 처리] 흐름단위
	 					[ 운영체제가 메모리 할당[스케줄링]한 순서대로 처리 ]
	 					1. main스레드 처리
	 					2. 스레드2 처리
	 					3. 스레드1 처리
	 					4. 스레드2 처리
	 					5. main스레드 처리
	 								MAIN스레드
	 									|
	 									|----------- 스레드생성1
	 					스레드2생성--------|				|
	 						|			|				|
	 						|			|				|
	 						|			|				|
	 						|			|				|
	 		
 
 
 	
 
 
 
 
 
 
 
 
 
 
 
 
 
 
  
 */

