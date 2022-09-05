package java1.ch4배열;

import java.util.Scanner;

/*
 	로또 판별기 
 		1. 구매번호 : 사용자 에게 6개 수 입력 -> 배열저장
 		 	1. 1~45 사이 만 입력받기 아니면 재입력     2. 중복 x
 		2. 추첨번호 : 컴퓨터 난수 6개 생성 -> 배열저장
 		 	1. 1~45 사이 난수
 		3. 구매번호 와 추첨번호와 동일한 수 의 개수 
 */
public class EX2_로또판별기 { // class start 
	public static void main(String[] args) { // main start 
		// 0. 메모리[변수/배열] 선언
		Scanner scanner = new Scanner(System.in);
		int[] 구매번호 = new int[6];	// int형 변수 6개를 저장할수 있는 공간 
		int[] 추첨번호 = new int[6];	// int형 변수 6개를 저장할수 있는 공간 
		
		// 1. 사용자에게 입력받는다. [6번]
		for( int i = 0 ; i<6 ; i++ ) {	// i=인덱스 // i는 0부터 5까지 1씩 증가.
			System.out.print("안내) "+ (i+1)+"번째 번호 선택 : ");
			구매번호[i] = scanner.nextInt(); // 입력받은값을 i번째 인덱스에 저장한다.
			
			// [조건1] 1~45 사이 입력받기 
			if( 구매번호[i] < 1 || 구매번호[i] > 45 ) { // 만약에 입력값이 1보다 작거나 45보다 크면 재입력
				System.err.println("안내) 선택할 수 없는 번호 입니다.");
				i--; // 현재 i 무효처리 
				continue; // 다시 반복문 실행 ---> 증감식 이동
			} // if end 
			
			// [조건2] 배열내 입력된 데이터 확인[중복확인]
			boolean 중복체크 = false;	// 중복여부 저장하는 변수 
			for( int j = 0 ; j < i ; j++ ) {
				if( 구매번호[j] == 구매번호[i] ) { // 만약에 j 번째 인덱스의 값과 i번째 인덱스와 같으면
					System.out.println("안내) 이미 선택된 번호 입니다. ");
					중복체크 = true; // 중복 찾았다!!!
				} // if end 
			} // for2 end 
			if( 중복체크 ) { i--; continue; } // 중복체크 변수가 true 이면 재입력
			
			// [조건1/조건2] 모두 통과 후 코드 
			System.out.println( 구매번호[i] + " 숫자 선택하셨습니다. ");
			
		} // for1 end 
	} // main end 
} // class end 






