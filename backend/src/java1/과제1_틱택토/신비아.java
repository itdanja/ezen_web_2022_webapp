package java1.과제1_틱택토 ;

import java.util.Random;
import java.util.Scanner;

public class 신비아 {
	
	//게임판 출력 함수
	public static void printPan(String[] 게임판) {
		for(int i=0;i<게임판.length;i++) {
			System.out.print(게임판[i]);
			if((i+1)%3==0)
				System.out.println();
		}
		System.out.println();
	}
	//승리자 여부 확인 함수
	public static boolean isWinner(String[] 게임판, boolean winner, String color) {
		if((!게임판[0].equals("[ ]")&&게임판[0].equals(게임판[1])&&게임판[1].equals(게임판[2])) || (!게임판[3].equals("[ ]")&&게임판[3].equals(게임판[4])&&게임판[4].equals(게임판[5])) || (!게임판[6].equals("[ ]")&&게임판[6].equals(게임판[7])&&게임판[7].equals(게임판[8]))) {	//0 1 2
			winner = true;
		}else if((!게임판[0].equals("[ ]")&&게임판[0].equals(게임판[4])&&게임판[4].equals(게임판[8])) || (!게임판[2].equals("[ ]")&&게임판[2].equals(게임판[4])&&게임판[4].equals(게임판[6]))) {	//대각선
			winner = true;
		}else if((!게임판[0].equals("[ ]")&&게임판[0].equals(게임판[3])&&게임판[3].equals(게임판[6])) || (!게임판[1].equals("[ ]")&&게임판[1].equals(게임판[4])&&게임판[4].equals(게임판[7])) || (!게임판[2].equals("[ ]")&&게임판[2].equals(게임판[5])&&게임판[5].equals(게임판[8]))) {
			winner = true;
		}
		if(winner) {		//우승자가 나왔을 경우
			if(color.equals("white"))
				System.out.println("사용자 우승!");
			else
				System.out.println("컴퓨터 우승!");
		}
		return winner;
	}
	public static void main(String[] args) {
		/*
		 틱택토 게임
		 	[조건]
		 	1. 게임판 9칸 사용 -> 배열[0~8] 사용
		 		1. String 배열			클래스는 비교연산자 불가능 -> .equals 사용
		 	2. 사용자가 알(o)을 두고자 하는 위치[인덱스]를 입력받아서 
		 		1. 선택된 위치가 이미 다른 알이 존재하면 재입력	[중복제거]
		 	3. 컴퓨터(x)가 난수를 생성[0~8]
		 		1. 난수의 위치가 이미 다른 알이 존재하면 재생성	[중복제거]
		 	4. 승리자 판단 [1.가로로 이기는 수  2.세로로 이기는 수  3.대각선으로 이기는 수  4.무승부]
		 			 	
		 	
		 	[출력]
		 	1. 게임판 출력 예시
		 		[ ] [ ] [ ]
		 		[ ] [ ] [ ]
		 		[ ] [ ] [ ]
		 		
		 */
		
		boolean winner = false;		//승리자 탄생 여부
		boolean isComputer = false;
		int count = 0;
		//게임판 출력
		String[] 게임판 = {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"};
		printPan(게임판);
		
		Scanner sc = new Scanner(System.in);
		while(!winner) {
			//사용자가 알(o)을 두고자 하는 위치[인덱스]를 입력받기
			//사용자 턴
			System.out.print("안내) 알을 두고 싶은 위치를 입력하세요 : "); int input_index = sc.nextInt();
			if(게임판[input_index-1].equals("[ ]")) {
				게임판[input_index-1]="[○]";
				count++;
			}else {
				System.out.println("안내) 해당 위치는 이미 알이 있습니다. 다른 위치를 선택해주세요.");
				continue;
			}
			printPan(게임판);
			winner = isWinner(게임판,winner,"white");
			if(winner) break;		//사용자 턴에 우승자가 나왔으면 게임 종료
			if(count==9) {			//무승부 여부 확인
				System.out.println("무승부!");
				break;
			}
			
			//컴퓨터 턴
			Random random = new Random();
			int computer;
			isComputer=false;						//컴퓨터가 이번 턴에 알을 뒀는지 여부
			while(!isComputer) {
				computer = random.nextInt(8);		//컴퓨터가 난수 생성
				//System.out.println(computer);
				if(게임판[computer].equals("[ ]")) {
					게임판[computer]="[●]";
					count++;
					isComputer = true;
				}
			}
			printPan(게임판);
			winner = isWinner(게임판,winner,"black");
		}
	}

}
