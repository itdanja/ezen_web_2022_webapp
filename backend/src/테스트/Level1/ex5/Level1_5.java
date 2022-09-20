package 테스트.Level1.ex5;

public class Level1_5 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level2_5 answer >> \n");
		
		
		/* 문제풀이 위치 */
	
		byte value1 = 100;				short 변환1 = value1; 	System.out.println("byte -> short : " + 변환1 );
		short value2 = 30000;			int 변환2 = value2;		System.out.println("short -> int : " + 변환2 );
		int value3 = 2000000000;		long 변환3 = value3;		System.out.println("int -> long : " + 변환3 );
		long value4 = 40000000000L;		float 변환4 = value4;		System.out.println("long -> float : " + 변환4 );
		float value5 = 3.123123123F;	double 변환5 = value5;	System.out.println("float -> double : " + 변환5 );
		
		/* ----------- */
	}
}
/* 
	[문제] 그림과 같이 기본자료형을 이용하여 변수 5개 선언되어 있습니다. 그림과 같이 자동 형변환을 하여 출력하시오.
	[조건] 
		1. 문제풀이 위치 외 코드는 수정 불가 합니다.
		2. 자동 형변환 만 사용하여 그림과 같이 출력합니다.
		
*/
