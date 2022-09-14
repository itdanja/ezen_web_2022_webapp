package java1.과제1_틱택토;

import java.util.Random;
import java.util.Scanner;

public class 성지혜 {
	
	public static void main(String[] args) {
		
		// *String(문자) 9개를 저장할 수 있는 배열 선언과 초기값[처음값]
		String[ ] 게임판 = { "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]" };
		Scanner scanner = new Scanner(System.in);
		boolean 승리판단 = true;
		int count = 0;
	
		while( true ) { // 무한루프 [ 종료조건 : 승리판단 있을경우 ] // while1
			
			// 1. 게임판 출력 - 배열 출력
			for( int i=0; i<게임판.length; i++ ) { // i는 0부터 마지막 인덱스( 배열의길이-1 )까지 1씩 증가
				
				System.out.print( 게임판[i] );
				// 1-2 3줄[ 인덱스 : 2 . 5 .8 ] 마다 줄바꿈
				if( i == 2 || i == 5 || i == 8 ) { System.out.println(); }
				// if( i == 2 || i == 5 || i == 8 ) --> if( i % 3 == 2 )
				
			} // for end
		
			
			// 2. 사용자에게 위치 입력받기
			while( true ) { // 무한루프 [ 종료조건 : 알을 두었을때 종료 break ] // while2
				System.out.print(" 위치 선택 : ");
				int 위치 = scanner.nextInt();
				if( 위치 < 0 || 위치 > 8 ) { System.out.println("안내) 선택할 수 없는 번호입니다."); }
				// 해당 위치에 알이 없으면 해당 위치에 알두기
				if( 게임판[위치] .equals("[ ]") ) { 게임판[위치] = "[O]"; break; }
				else { System.out.println("안내) 이미 알이 존재하는 위치입니다."); }
			
			} // while2 end
		
			
			// 3. 컴퓨테에게 위치 난수 생성
			while( true ) { // while2
				Random random = new Random(); // 랜덤객체 생성
				int 위치 = random.nextInt(9); // 0~8 난수 생성
				if( 게임판[위치].equals("[ ]") ) { 게임판[위치] = "[X]"; break; } // 알에 두면 무한루프 종료
			} // while2 end
			
			
			// 4. 승리자 판단
			
				// 1. 가로로 이기는 수 [ 0 1 2, 3 4 5, 6 7 8 ]
				for( int i=0; i<=6; i+=3 ) {
					// i는 0부터 6까지 3씩 증가 반복
					if(( !게임판[i].equals("[ ]")) && 게임판[i].equals(게임판[i+1]) && 게임판[i+1].equals(게임판[i+2]) ) {
						System.out.println(게임판[i] + "승리");
						승리판단 = false;
					}
				}
				// 2. 세로로 이기는 수 [ 0 3 6, 1 4 7, 2 5 8
				for( int i=0; i<=2; i++ ) {
					// i는 0부터 2까지 1씩 증가
					if(( !게임판[i].equals("[ ]")) && 게임판[i].equals(게임판[i+3]) && 게임판[i+3].equals(게임판[i+6]) ) {
						System.out.println(게임판[i] + "승리");
						승리판단 = false;
					}
				}
				// 3. 대각선으로 이기는 수 [ 0 4 8 ]
				if( !게임판[0].equals("[ ]") ) {
					if( 게임판[0].equals(게임판[4]) ) {
						if( 게임판[4].equals(게임판[8]) ) {
							System.out.println(게임판[0] + "승리" );
							승리판단 = false;
						}
					}
				}
				// 4. 대각선으로 이기는 수 [ 2 4 6 ]
				if( !게임판[0].equals("[ ]") ) {
					if( 게임판[2].equals(게임판[4]) ) {
						if( 게임판[4].equals(게임판[6]) ) {
							System.out.println(게임판[2] + "승리" );
							승리판단 = false;
						}
					}
				}
				// 4. 무승부 [ 위 상황이 아니면서 알이 9개 이면 ]
				count++;
				if( count == 4 ) {
					System.out.println("무승부");
					승리판단 = false;
				}
			
		
		} // while1 end
		
	} // main end

} // class end
