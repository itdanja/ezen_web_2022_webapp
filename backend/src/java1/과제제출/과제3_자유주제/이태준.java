package java1.과제제출.과제3_자유주제;

import java.text.BreakIterator;
import java.util.Random;
import java.util.Scanner;

import javax.swing.text.Style;

public class 이태준 {	// class s

	public static void main(String[] args) {	// main s
		
		Scanner scanner = new Scanner(System.in);	// 전체 사용 할 메모리 선서
		int 공격수; int 골키퍼;  int 판수=0; int 승리수 = 0;	// 숫자라서 int 사용
		
		while( true ) {
			System.out.println("왼쪽(0) 가운데(1) 오른쪽(2) 종료(3) : ");			공격수 = scanner.nextInt();
			
			// 랜덤 객체 ? ? 랄까 난수 ? 
			Random random = new Random();
			골키퍼 = random.nextInt( 3 );
			
			// 승리 판단
			// 공격수가 득점 할 경우 	// && || 논리
			if( (공격수==0 && 골키퍼==1) || (공격수==0 && 골키퍼==2) || (공격수==1 && 골키퍼==0) || (공격수==1 && 골키퍼==2) || 
				(공격수==2 && 골키퍼==0) || (공격수==2 && 골키퍼==1) 	) { System.out.println("공격수)득점  " ); }		
			// 골키퍼가 선방 할 경우
			else if( (공격수==0 && 골키퍼==0) || (공격수==1 && 골키퍼==1) || (공격수==2 && 골키퍼==2) )		
			{ System.out.println("골기퍼)선방  "); }
			
			판수 : 판수++;	// 종료(3) 을 클릭하면 몇판을 했는지 뜬다. 
			// 종료 
			if(공격수==3) {
				System.out.println("경기끝) 판수 :" +판수);
				if( 승리수 >= 1 ) { System.out.println("경기끝) 공격수승리"); } // 크거나 같으면 
				else { System.out.println("경기끝) 골기퍼승리"); }
				break;
			}	// if end

		} // while end 
		
	}	// main end
	
}	// class end
