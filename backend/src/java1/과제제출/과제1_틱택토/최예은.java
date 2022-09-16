package java1.과제제출.과제1_틱택토;

import java.util.Random;
import java.util.Scanner;

public class 최예은 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		String[] 게임판 = { "[ ]", "[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"};
		int count=0;
		 String 이겼닭 = " ";
		// 1. 게임판 출력 - 배열내 모든 데이터 출력 
				while( true ) {
					for( int i = 0 ; i<게임판.length ; i++ ) { // i는 0부터 마지막인덱스( 배열의길이-1 ) 까지 1씩 증가

						System.out.print( 게임판[i] );
						// 1-2 3줄[ 인덱스 : 2 , 5 , 8 ] 마다 줄바꿈
						if( i == 2 || i == 5 || i == 8 ) { System.out.println(); }
						// if( i == 2 || i == 5 || i == 8 ) ---> if( i % 3 == 2 )
					} // for end 
					
					
					
	            	if(!게임판[0].equals("[ ]") && !게임판[0].equals("[ ]") &&  !게임판[1].equals("[ ]") && !게임판[2].equals("[ ]") &&
        			!게임판[3].equals("[ ]") && !게임판[4].equals("[ ]") && !게임판[5].equals("[ ]") &&
        			!게임판[6].equals("[ ]") && !게임판[7].equals("[ ]") && !게임판[8].equals("[ ]")  ) {
        			System.out.println("무승부");
        			break; 
	            	}
					
					if( !이겼닭.equals(" ") ) {
						System.out.println( 이겼닭 +"  승리 ");
						break;
					}

					// 2. 사용자 에게 위치 입력받기 
					while( true ) { // 무한루프 [ 종료조건 : 알을 두었을때 종료 break ] // while 2
						System.out.print("안내) 위치 선택 : "); int 위치 = scanner.nextInt();
						if( 위치 < 0 || 위치 > 8 ) { System.out.println("안내) 선택할수 없는 번호입니다.");}
						// 해당 위치에 알이 없으면 해당 위치에 알두기 
						if( 게임판[위치] .equals("[ ]") ) {  게임판[위치] = "[O]"; break; }
						if( 게임판[위치].equals("[ ]") ) {  게임판[위치] = "[O]"; break; } // 알을 두면 무한루프 종료
						else { System.out.println("안내) 이미 알이 존재하는 위치 입니다. "); }
					} // while 2 end 
					
	            	//게임판에 모든 모양이 들어가면 모든 공간에 공백이 없으면
	            	


					// 3. 컴퓨터 에게 위치 난수 생성
					while( true ) { // while 2
						Random random = new Random(); // 랜덤 객체 생성 
						int 위치 = random.nextInt(9); // 0~8 난수 생성 
						if( 게임판[위치].equals("[ ]")){ 게임판[위치] = "[X]"; break; } // 알을 두면 무한루프 종료
					} // while 2 end 

					// 4. 승리 판단 [ 과제 ] 
			
					 
					for(int i=0; i<=6; i+=3  ) {
		            	if( !게임판[i].equals("[ ]") && 게임판[i] .equals (게임판[i+1]) && 게임판[i+1] .equals (게임판[i+2])) {
		            		System.out.println("자네의 승리일세");
		            		이겼닭 = 게임판[i];
		            		break;
		            	}//if end
		            }//for end
		              
		                          
		            //세로로 이길때      0, 3 ,6 /1, 4 ,7/ 2, 5 ,8  i는 0부터 2까지 3씩증가,첫번째와 마지막번호는 6씩증가라는 규칙이 있음
		            for(int i=0; i<=2; i++) {
		            	if(!게임판[i].equals("[ ]") && 게임판[i] .equals (게임판[i+3]) && (게임판[i+3]) .equals (게임판[i+6])) {
		            		System.out.println("자네의 승리일세");
		            		이겼닭 = 게임판[i];
		            		break; 
		            	}
		            }//for 
		            
		            
		            //2,4,6
		            
		            	if(!게임판[2].equals("[ ]") && 게임판[2] .equals(게임판[4]) && (게임판[4]) .equals(게임판[6])) {
		            		System.out.println("자네의 승리일세");
		            		이겼닭 = 게임판[2];
		            		
		            	}            	
		          
		            
		            //0,4,8
		         
		            	if(!게임판[0].equals("[ ]") && 게임판[0].equals(게임판[4]) && (게임판[4]).equals(게임판[8])) {
		            		System.out.println("자네의 승리일세");
		            		이겼닭 = 게임판[0];
		            	}//if
		            	
		            	
	
		           
            		
		            	
		         	            
				}//while end		
	}//main
}//class
/*
	[조건]
	1. 게임판 9칸사용 ->  배열로 만들기 [0~8]
		String배열 사용	*비교연산자 먹히지 않음 -->equals사용
		==	:	문자열.equals(문자열)
		!== :	!문자열.equals(문자열)
	2. 사용자가 위치[인덱스] 입력
		1. 선택된 위치가 이미 다른 알이 존재하면 재입력
	3. 컴퓨터가 난수를 생성[0~8]	
		1.난수의 위치가 이미 다른알이 존재하면 재생성[중복제거]
	4. 승리자 판단
		1. 가로로 이기는 수
		2. 세로로 이기는 수
		3. 대각선으로 이기는 수
		4. 무승부
		
	[출력]
	1.게임판 출력 예시
	[ ] [ ] [ ]  
	[ ] [ ] [ ]
	[ ] [ ] [ ]
	
	
	만약에 입력창에 시작이라고 입력하면 게임판이 쫘르륵 하고 나오기
	근데 게임판은 한줄에 쫘르륵???아니면 2개씩? 3개씩? 몇개씩?
	9개 출력이니 깔끔하게 3개씩 출력하고 줄바꿈 하자 ㅇㅋ? 근데 index는 0부터인데 012,345,678?? 줄바꿈?? 어째?
	
 */