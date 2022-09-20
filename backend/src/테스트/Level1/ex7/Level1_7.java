package 테스트.Level1.ex7;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level1_7 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_3 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
		/* 문제풀이 위치 */
		System.out.print("회원명 String : ");		String value9 = scanner.next();
		System.out.print("상태 boolean : ");		boolean value1 = scanner.nextBoolean();
		System.out.print("회원번호 byte : ");			byte value2 = scanner.nextByte();
		System.out.print("성별 char : ");			char value3 = scanner.next().charAt(0);
		System.out.print("나이 short : ");			short value4 = scanner.nextShort();
		System.out.print("포인트 int : ");			int value5 = scanner.nextInt();
		System.out.print("예금액 long : ");			long value6 = scanner.nextLong();
		System.out.print("평균 float : ");			float value7 = scanner.nextFloat();
		System.out.print("평균 double : ");		double value8 = scanner.nextDouble();
		
		String output = "\n============회원통장===============\n"
				+"|\t 회원명 : "+value9+"\t\t|\n"
				+"|\t 상태 : "+value1+"\t\t|\n"
				+"|\t 회원번호 : "+value2+"\t\t|\n"
				+"|\t 성별 : "+value3+"\t\t|\n"
				+"|\t 나이 : "+value4+"\t\t|\n"
				+"|\t 포인트 : "+value5+"\t\t|\n"
				+"|\t 예금액 : "+value6+"\t\t|\n"
				+"|\t 평균 : "+value7+"\t\t|\n"
				+"|\t 평균 : "+value8+"\t\t|\n"
				+"=================================";
		
		System.out.println(output);
		/* ----------- */
	}
}
/* 
	[문제] 그림과 같이 기본자료형을 이용하여 변수 8개를 출력하시오.
	[조건] 모든 기본자료형을 사용한다.
*/
