package Homework;

import java.time.LocalDateTime;
import java.util.Scanner;

public class day_9_Ex2_JAVA_Level2_ex_7 {
	public static void main(String[] args) {
		System.out.println(" >> Level2_7 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
	
		while(true) {
			System.out.print("배수 입력 :"); int input = scanner.nextInt();
		/* 문제풀이 위치 */					
			
			if(input==10) {
				//10단위 입력
				for(int i=10; i<=100; i+=10) {						
					if(input==10) {System.out.println(i);}					
				}				
			}
			
			else if(input==25) {
				//25단위
				for(int z=25; z<=100; z+=25) {	
					if(input==25) {System.out.println(z);}									
				}
			}			
			
			else if(input==35) {
				//35단위
				for(int j=35; j<=100; j+=35) {	
					if(input==35) {System.out.println(j);}										
				}
			}
			
			else {
				System.err.println("올바르지 않은 숫자입니다.");
			}
						
			//10,25,35,를 모두 입력하면 while문을 종료하려고 하는데 이렇게 하는거 아닌가요...?
			if(input==10&& input==25 && input==35) {				
				System.out.println("세가지 숫자를 모두 입력하였습니다. while문을 종료합니다.");
				break;
			}	
				
			
		
		}//while 종료
	}
}
	
	
	/* 
	[문제] 다음과 같이 배수를 무한입력을 받아 1~100 사이의 입력받은 배수 만 출력하시오.
	[조건] 
		1. 문제풀이 위치 외 코드는 수정 불가 합니다.
*/