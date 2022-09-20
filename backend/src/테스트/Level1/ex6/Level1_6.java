package 테스트.Level1.ex6;

public class Level1_6 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_6 answer >> \n");
		
		
		/* 문제풀이 위치 */
	
		short value1 = 30000;			byte 변환1 = (byte)value1; 		System.out.println("byte <- short : " + 변환1 );
		int value2 = 2000000000;		short 변환2 = (short)value2;		System.out.println("short <- int : " + 변환2 );
		long value3 = 40000000000L;		int 변환3 = (int)value3;			System.out.println("int <- long : " + 변환3 );
		float value4 = 3.123123123F;	long 변환4 = (long)value4;		System.out.println("long <- float : " + 변환4 );
		double value5 = 3.123123123;	float 변환5 = (float)value5;		System.out.println("float <- double : " + 변환5 );
			
		/* ----------- */
	}
}
/* 
	[문제] 그림과 같이 기본자료형을 이용하여 변수 5개 선언되어 있습니다. 그림과 같이 강제 형변환을 하여 출력하시오.
	[조건] 
		1. 문제풀이 위치 외 코드는 수정 불가 합니다.
		2. 강제 형변환 만 사용하여 그림과 같이 출력합니다.
		
*/
