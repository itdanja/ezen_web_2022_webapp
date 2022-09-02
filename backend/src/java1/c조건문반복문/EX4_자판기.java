package java1.c조건문반복문;

import java.util.Scanner;

public class EX4_자판기 { // class start
	public static void main(String[] args) { // class start 
		
		// 0. 입력객체
		Scanner scanner = new Scanner(System.in);
		
		// 1. 공통 변수( 제품3개->3개 , 장바구니제품3개->3개 )
		int 콜라재고 = 10;		int 환타재고 = 10;		int 사이다재고 = 10;	// 1. 각 변수에 10 대입 [ 재고 ]
		int 콜라구매수 = 0;	int 환타구매수 = 0;	int 사이다구매수 = 0;

		while(true) { // 2. 무한루프 [ 무한반복 ]
			System.out.println("---------[ 자판기 ]-----------");
			System.out.println("메뉴 : 1.콜라(300) 2.환타(400) 3.사이다(500) 4.결제 ");
			System.out.print(" 선택 : "); int 메뉴선택 = scanner.nextInt();
			if( 메뉴선택 == 1 ) { //  1 를 입력했을때 
				// 재고 있다/없다 [ 경우의수 2개 ]
				if( 콜라재고 > 0 ) { // 재고 있다
					콜라재고--;	콜라구매수++;
					System.err.println("안내) 콜라를 장바구니에 담았습니다. ");
				}else { // 재고 없다 
					System.err.println("안내) 콜라재고가 없습니다. [ 죄송합니다ㅠ]");
				}
			} 
			else if( 메뉴선택 == 2 ) {  //  2 를 입력했을때 
				
			}
			else if( 메뉴선택 == 3 ) {  //  3 를 입력했을때 
				
			}
			else if( 메뉴선택 == 4 ) {} //  4 를 입력했을때 
			else { System.err.println("안내) 선택할수 없는 번호입니다[다시선택] "); } // 그외 입력했을때 
		}
		
		
	} // main end 
} // class end
/*
	자판기 프로그램 
		[조건]
		1. 제품명 : 콜라 , 환타 , 사이다 
		2. 초기재고 : 각 10개 
		3. 메뉴판에서 선택한 제품을 장바구니 담기 
			1. 선택 제품의 재고가 0 이면 '재고 없음' 출력 -> 나감
			2. 제품재고 를 1차감	->  장바구니 제품 의 1증가
			3. '장바구니에 담았습니다.'
			
		4. 결제를 선택했을때 장바구니 현황 표시 결제
		5. 결제예정인 금액보다 투입금액 이 부족하면 결제취소 투입금액이 초과 잔돈 출력 
		[화면구현]
		1. 메뉴판 : 1.콜라 2.환타 3.사이다 4.결제   [ 경우의수 4개 ]
 */















