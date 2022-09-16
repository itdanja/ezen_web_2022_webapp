package java1.과제제출.과제3_자유주제;

import java.util.Scanner;

public class 주혁 {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	  	
		while(true) {
		
		
		System.out.println("1.놀이터가기 2.집가기 선택:"); int 번호 = scanner.nextInt();
		if(번호 == 1) {
			System.out.println("놀이터 도착");
			
			System.out.print(" 1.그네 ");  
			System.out.print(" 2.시소 ");
			System.out.print(" 3.미끄럼틀 선택:"); int 번호1 = scanner.nextInt();
						if(번호1==1) {
							while(true) {
								System.out.println("그네탄다");
								System.out.println("1.계속탄다 2.다른거탄다 3.집가기 "); int 번호2 = scanner.nextInt();
								if(번호2==1) {System.out.println();} 
								if(번호2==2) {System.out.println("다른거탄다"); break; }
								if(번호2==3) {System.out.println("집가기"); return;}
								
							}
						}
			
						else if (번호1==2) {
							while(true) {
								System.out.println("시소탄다");
								System.out.println("1.계속탄다 2.다른거탄다 3.집가기"); int 번호2 =scanner.nextInt();
								if(번호2==1) {System.out.println();}
								if(번호2==2) {System.out.println("다른거탄다");break;}
								if(번호2==3)	{System.out.println("집가기");return;}
						}
						
						
					}
					
						else if (번호1==3) {System.out.println("미끄럼틀탄다");
							while(true) {
							System.out.println("1.계속탄다 2.다른거탄다 3.집가기 "); int 번호2 = scanner.nextInt();
							if(번호2==1) {}
							if(번호2==2) {System.out.println("다른거탄다");break;}
							if(번호2==3) {System.out.println("집가기");return;}
							}
						
					}
				
		else if (번호 == 2 ){System.out.println("집가는중");} 
			
		}
		}//while e
	} //main e

}//class e
