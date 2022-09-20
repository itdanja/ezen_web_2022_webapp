package 테스트.Level1.ex8;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level1_8 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_3 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
		
		String header = "\n============방문록===============\n번호\t 작성자 \t 방문록\n";
		String boardlist = "";
		String footer = "================================\n";
		String output = "";
		
		/* 문제풀이 위치 */
		System.out.print("[1]작성자 : ");		String title1 = scanner.next();
		System.out.print("[1]방문록 : ");		scanner.nextLine(); String content1 = scanner.nextLine();
		boardlist += " 1 \t "+title1+" \t "+content1+"\n";
		output = header;	output += boardlist; 	output += footer; 
		System.out.println(output);
		
		System.out.print("[2]작성자 : ");		String title2 = scanner.next();
		System.out.print("[2]방문록 : ");		scanner.nextLine(); String content2 = scanner.nextLine();
		boardlist += " 2 \t "+title2+" \t "+content2+"\n";
		output = header;	output += boardlist;	output += footer;
		System.out.println(output);
		
		System.out.print("[3]작성자 : ");		String title3 = scanner.next();
		System.out.print("[3]방문록 : ");		scanner.nextLine(); String content3 = scanner.nextLine();
		boardlist += " 3 \t "+title3+" \t "+content3+"\n";
		output = header;	output += boardlist;	output += footer;
		System.out.println(output);
		
		System.out.print("[4]작성자 : ");		String title4 = scanner.next();
		System.out.print("[4]방문록 : ");		scanner.nextLine(); String content4 = scanner.nextLine();
		boardlist += " 4 \t "+title4+" \t "+content4+"\n";
		output = header;	output += boardlist;	output += footer;
		System.out.println(output);
		
		System.out.print("[5]작성자 : ");		String title5 = scanner.next();
		System.out.print("[5]방문록 : ");		scanner.nextLine(); String content5 = scanner.nextLine();
		boardlist += " 5 \t "+title5+" \t "+content5+"\n";
		output = header;	output += boardlist;	output += footer;
		System.out.println(output);
		
		boolean 불 = true;          System.out.printf("boolean  \t"+"\t" +불+"\t"+"%b\n");
		
		/* ----------- */
	}
}
/* 
	[문제] 그림과 같이 기본자료형을 이용하여 변수 8개를 출력하시오.
	[조건] 모든 기본자료형을 사용한다.
*/
