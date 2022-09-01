package java1.b연산자;

import java.util.Scanner;

public class EX2_연산자문제 { // class s
	public static void main(String[] args) { // main s
		// 1. 입력객체 [ 1번만 선언 ] 
		Scanner scanner = new Scanner(System.in);
				// scanner.nextInt()  	: 입력된 데이터를 int형으로 가져오기 
				// scanner.nextDouble() : 입력된 데이터를 double형으로 가져오기 
				// scanner.next() 		: 입력된 데이터를 String형으로 가져오기 
		/*
			문제1 : 급여 계산 
				[조건] 입력받기 : 기본급 , 수당 
				[출력] 실수령액 = 기본급 + 수당 - 세금[기본급10%]
		*/
		
		/*
		//문제1 모법답안
		System.out.print("문제1) 기본급 : "); 	int 기본급 = scanner.nextInt();
		System.out.print("문제1) 수당 : "); 	int 수당 = scanner.nextInt();
		int 실수령액 = 기본급 + 수당 - (int)(기본급*0.1);
								// * 강제 형 변환 : double -> int 
		System.out.println("문제1) 결과 : " + 실수령액 );
		 */
		
		/*
		 	문제2 : 지폐 개수 세기 
		 		[조건] 십만원 단위의 금액을 입력받기 
		 		[출력] 입력받은 금액의 지폐수 출력 
		 		[예시]  356789
		 			십만원 : 3장 
					만원 : 5장 
					천원 : 6장
		 */
		
		//문제2 모범답안 
		System.out.print("문제2) 금액 : ");	
		int 금액;   // 변수 선언 하고 자료형 선택 : ??? 1.논리2.정수3.실수4.문자열 
		금액 = scanner.nextInt();	 // 입력받은 데이터를 정수형으로 가져와서 변수에 대입 
			// 1. 십만원 계산 
			System.out.println("십만원 : " + (금액/100000)+"장");
				금액 -= (금액/100000) * 100000;	// 십만원 단위 제거 
			// 2. 만원 계산 
			System.out.println("만원 : " + (금액/10000) + "장");
				금액 -= (금액/10000) * 10000; // 만원 단위 제거 
			// 3. 천원 계산 
			System.out.println("천원 : " + (금액/1000) + "장");
		/*
		 	문제3 : 하나의 정수를 입력받아 7의 배수 이면 '맞다' 아니면 '아니다' [ if x ]
		 	문제4 : 하나의 정수를 입력받아 홀수이면 이면 '홀수' 아니면 '짝수' [ if x ]
		 	문제5 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 이면 '참' 아니면 '거짓' 
		 	문제6 : 두개의 정수를 입력받아 더 큰수 출력 
		 	문제7 : 반지름을 입력받아 원 넓이 출력하기 
		 		// 원 넓이 공식 = 반지름 * 반지름 * 원주율[3.14]
		 	문제8 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇 %인지 출력하기 
		 		// 예) 54.5     84.3  입력했으면    64.285714% 출력 
		 	문제9 : 사다리꼴 넓이 구하기 [ 윗변과 밑변 높이를 입력받아 출력하기 ] 
		 		// 사다리꼴 계산식 -> ( 윗변 * 밑변 ) * 높이 / 2 
		 	문제10: 키를 정수를 입력받아 표준체중 출력하기
				//표준체중 계산식 = > (키 - 100) * 0.9
			문제11 : 키와 몸무게를 입력받아 BMI 출력하기
				//BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
		 	문제12 : inch 를 입력받아 cm 로 변환하기 [ 1 inch -> 2.54cm ] 
		 	문제13 :  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하기
					//소수 둘째 자리 까지 점수 출력하기
					//중간고사 반영비율 => 30 %
					//기말고사 반영비율 => 30 %
					//수행평가 반영비율 => 40 %
			문제14 :  연산 순서 나열 하고 x와 y값 예측하기
	 				//int x = 10;
					//int y = x-- + 5 + --x;
					//printf(" x의 값 : %d , y의값 :  %d ", x, y)
		 */
		
		
	} // main e 
} // class e
