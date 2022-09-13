package java1.과제1_틱택토 ;

import java.util.Random;
import java.util.Scanner;

public class 신지웅 {

	public static void main(String[] args) {
	
		String gameboard = "";
		
		String[] check_board = new String[9]; //게임상황 저장 배열 선언

		for(int i = 0 ; i<9 ; i++) {
			gameboard += "[ ] ";
			if(i%3==2) {
				gameboard += "\n";
			}
		}
		System.out.print(gameboard);  //최초 보드 출력
		gameboard = "";
		Scanner sel_numb = new Scanner(System.in); // 숫자로 돌입력 받기
		
		Random rand = new Random();
		
		int count = 0;
		
		boolean progress = true;
		
		while(true) {			
			for(int i = 1 ; i<=1 ; i++) {
				System.out.println("돌의 자리를 선택해 주세요 [ 0~8 ]");
				int selected = sel_numb.nextInt();
				if(check_board[selected]==null) {
					check_board[selected] = "O";
				}else {
					System.err.println("이미 둔 자리입니다.");
					i--;
				}				
			}			
			for(int i = 0 ; i<9 ; i++) {
				if(check_board[i]==null) {
					gameboard += "[ ] ";
				}else {
					gameboard += "["+check_board[i]+"] " ; 
					count++;
				}			
				if(i%3==2) {
					gameboard += "\n";
				}				
			}
			System.out.println("============player turn============");
			System.out.print(gameboard);
			gameboard = "";
			
			//승리판단
			
			for(int i = 0; i<=6 ; i+=3) {
				if( check_board[i]!=null && check_board[i].equals(check_board[i+1]) && check_board[i].equals(check_board[i+2])) {
					System.out.println( i + "승리");
					progress = false;
				}
			}
			for(int i = 0; i<=2 ; i++) {
				if( check_board[i]!=null && check_board[i].equals(check_board[i+3]) && check_board[i].equals(check_board[i+6])) {
					System.out.println( i + "승리");
					progress = false;
				}
			}
			if( check_board[0]!=null && check_board[0].equals(check_board[4]) && check_board[0].equals(check_board[8])) {
				System.out.println(check_board[0] + "승리");
				progress = false;
			}
			if( check_board[2]!=null && check_board[2].equals(check_board[4]) && check_board[2].equals(check_board[6])) {
				System.out.println(check_board[2] + "승리");
				progress = false;
			}
			if(!progress) {
				break;
			}
			
			if(count==9) {
				System.out.println("승자없음");
				break;
			}
			
			//player turn end
			
			for(int i = 1 ; i<=1 ; i++) {
				int pc_rand = rand.nextInt(9);	
				if(check_board[pc_rand]!=null) {
					i--;
					continue;
				}
				check_board[pc_rand] = "X";
			}			
			for(int j = 0 ; j<9 ; j++) {
				if(check_board[j]==null) {
					gameboard += "[ ] ";
				}else if(check_board[j]!=null){
					gameboard += "["+check_board[j]+"] " ; 
					count++;
				}			
				if(j%3==2) {
					gameboard += "\n";
				}				
			}
			System.out.println("============pc turn============");
			System.out.println(gameboard);
			gameboard = "";	
			//승리판단
			for(int i = 0; i<=6 ; i+=3) {
				if( check_board[i]!=null && check_board[i].equals(check_board[i+1]) && check_board[i].equals(check_board[i+2])) {
					System.out.println( i + "승리");
					progress = false;
				}
			}
			for(int i = 0; i<=2 ; i++) {
				if( check_board[i]!=null && check_board[i].equals(check_board[i+3]) && check_board[i].equals(check_board[i+6])) {
					System.out.println( i + "승리");
					progress = false;
				}
			}
			if( check_board[0]!=null && check_board[0].equals(check_board[4]) && check_board[0].equals(check_board[8])) {
				System.out.println(check_board[0] + "승리");
				progress = false;
			}
			if( check_board[2]!=null && check_board[2].equals(check_board[4]) && check_board[2].equals(check_board[6])) {
				System.out.println(check_board[2] + "승리");
				progress = false;
			}			
			if(!progress) {
				break;
			}			
		} // while end	
	}
}







/*

	3*3 틱택토

*/













