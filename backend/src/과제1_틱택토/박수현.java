package 과제1_틱택토;

import java.util.Random;
import java.util.Scanner;

public class 박수현 {
	
	public static void main(String[] args) {
		
		
		
		// * String(문자) 9개를 저장할 수 있는 배열 선언과 초기값
		String[ ] 게임판= { "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]" };

		Scanner scanner= new Scanner(System.in);
		boolean 승리판단=false;
		int count=0;
		
		while(true) {// 무한루프 [ 종료조건 : 승리판단 있을경우 ]
			
			// 1. 게임판 출력 = 배열내 모든 데이터 출력
			for(int i=0 ; i<게임판.length; i++) {
				System.out.print(게임판[i]);
				// 1-2. 3줄마다 줄바꿈 처리
				if(i%3==2) {System.out.println();}
				
			}//for end
			
			//2. 사용자에게 위치 입력받기
			while(true) {//무한루프 [종료조건 : 알을 두었을때 종료 break]
				System.out.print("안내 ) 위치 선택 : ");
				int 위치= scanner.nextInt();
				if(위치 <0 || 위치 >8) {System.out.println("안내 ) 선택할 수 없는 번호입니다.");}
			
				//해당 위치에 알이 없으면 해당 위치에 알두기
				if(게임판[위치].equals("[ ]")) {게임판[위치] = "[O]"; count++; break;}
				else {System.out.println("안내 ) 이미 알이 존재하는 위치 입니다.");}
			}//사용자 while end
				
			
			//4. 사용자차례 승리판단
				//1.가로012 345 678
			for(int i=0; i<=6; i+=3) {
				if((!게임판[i].equals("[ ]")) && ( 게임판[i].equals(게임판[i+1]) ) && ( 게임판[i+1].equals(게임판[i+2]) )) {
					System.out.println("안내 ) " + 게임판[i] + "가 승리했습니다. 게임을 종료합니다.");
					승리판단=true;
				}
			}
		
				//2. 세로 036 147 258
			for(int i=0; i<=2; i++) {
				if((!게임판[i].equals("[ ]")) && ( 게임판[i].equals(게임판[i+3]) ) && ( 게임판[i+3].equals(게임판[i+6]) )) {
					System.out.println("안내 ) " + 게임판[i] + "가 승리했습니다. 게임을 종료합니다.");
					승리판단=true;
					
				}
			}
				//3. 대각선 048 246
			if((!게임판[0].equals("[ ]")) && ( 게임판[0].equals(게임판[4]) ) && ( 게임판[4].equals(게임판[8]) )) {
				System.out.println("안내 ) " + 게임판[0] + "가 승리했습니다. 게임을 종료합니다.");
				승리판단=true;
			}
			if((!게임판[2].equals("[ ]")) && ( 게임판[2].equals(게임판[4]) ) && ( 게임판[4].equals(게임판[6]) )) {
				System.out.println("안내 ) " + 게임판[2] + "가 승리했습니다. 게임을 종료합니다.");
				승리판단=true;
			}
				//4. 무승부
			if(count==9 && 승리판단==false) {System.out.println("안내 ) 무승부입니다. 게임을 종료합니다."); 승리판단=true;}
			
			
			//승리판단 바로 전에 둔 o,x가 안나와요ㅠㅠㅠ
			if(승리판단==true) {
				//마지막에 둔 자리가 안나와서 여기에서 한번더 게임판 출력시켰어요...ㅠㅠ
				
				// 1. 게임판 출력 = 배열내 모든 데이터 출력
				for(int i=0 ; i<게임판.length; i++) {
					System.out.print(게임판[i]);
					// 1-2. 3줄마다 줄바꿈 처리
					if(i%3==2) {System.out.println();}
					
				}//for end
				break;
				
			}
			

			
			
			//3. 컴퓨터에게 위치 난수 생성
			while(true) {
				Random random= new Random();
				int 위치=random.nextInt(9);
				if(게임판[위치].equals("[ ]")) {게임판[위치]="[X]"; count++; break;}
				
			}
			
			//4. 컴퓨터 차례 승리판단
			//1.가로012 345 678
			for(int i=0; i<=6; i+=3) {
				if((!게임판[i].equals("[ ]")) && ( 게임판[i].equals(게임판[i+1]) ) && ( 게임판[i+1].equals(게임판[i+2]) )) {
					System.out.println("안내 ) " + 게임판[i] + "가 승리했습니다. 게임을 종료합니다.");
					승리판단=true;
				}
			}
	
			//2. 세로 036 147 258
		for(int i=0; i<=2; i++) {
			if((!게임판[i].equals("[ ]")) && ( 게임판[i].equals(게임판[i+3]) ) && ( 게임판[i+3].equals(게임판[i+6]) )) {
				System.out.println("안내 ) " + 게임판[i] + "가 승리했습니다. 게임을 종료합니다.");
				승리판단=true;
				
			}
		}
			//3. 대각선 048 246
	
		if((!게임판[0].equals("[ ]")) && ( 게임판[0].equals(게임판[4]) ) && ( 게임판[4].equals(게임판[8]) )) {
			System.out.println("안내 ) " + 게임판[0] + "가 승리했습니다. 게임을 종료합니다.");
			승리판단=true;
		}
		if((!게임판[2].equals("[ ]")) && ( 게임판[2].equals(게임판[4]) ) && ( 게임판[4].equals(게임판[6]) )) {
			System.out.println("안내 ) " + 게임판[2] + "가 승리했습니다. 게임을 종료합니다.");
			승리판단=true;
		}
			//4. 무승부
		if(count==9 && 승리판단==false) {System.out.println("안내 ) 무승부입니다. 게임을 종료합니다."); 승리판단=true;}
		
		if(승리판단==true) {break;}

		
			
			
			//while문 종료조건
		}
	}//main end
	
}



/*

	틱택토 게임
		[ 조건 ]
		1. 게임판 9칸 사용 -> 배열[ 0~8 ]
			1. String 배열 	클래스는 비교연산자 불가능------>문자열.equals(문자열) 사용
		2. 사용자가 알( O )을 두고자 하는 위치 [인덱스] 입력
			1. 선택된 위치가 이미 다른 알이 존재하면 재입력[ 중복제거 ]
		3. 컴퓨터( X )가 난수생성[ 0~8 ]
			1. 난수의 위치가 이미 다른 알이 존재하면 재생성[ 중복제거 ]
		4. 승리자 판단[ 1. 가로로 이기는 수 2. 세로로 이기는 수 3. 대각선으로 이기는 수 4. 무승부 ]
		
		[ 출력 ]
		 	1. 게임판 출력 예시
		 	[ ] [ ] [ ]
		 	[ ] [ ] [ ]
			[ ] [ ] [ ]




*/


