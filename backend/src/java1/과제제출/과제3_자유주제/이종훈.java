package java1.과제제출.과제3_자유주제;

import java.util.Scanner;

public class 이종훈 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int 비밀번호 = 1234;
		
		while(true) {
		// 첫화면
		System.out.println("현금 자동 입출금기");
		System.out.println("1.입금 2.출금 3.거래취소"); int 버튼 = scanner.nextInt();
		
		
		// 경우의수 4개
		if( 버튼 == 1 ) {
			System.out.println("입금할 금액을 넣어주세요 : "); int 입금액 = scanner.nextInt();
			System.out.println(입금액+"원을 입금하시겠습니까?");
			System.out.println("1.예\t 2.아니요"); int 버튼3 = scanner.nextInt();
			if( 버튼3 == 1 ) {}
			else if(버튼3 == 2) {
				System.out.println("거래를 종료합니다.");break;
			}
			
			System.out.println("입금이 완료되었습니다. 거래를 더 하시겠습니까?");
			System.out.println("1.거래 더 하기 2.거래종료"); int 버튼2 = scanner.nextInt();
			if( 버튼2 == 1 ) {// 거래 더 하기  초기화면으로 이동
				
			}
			else if ( 버튼2 == 2 ) { // 거래종료 인삿말
				System.out.println("거래 감사합니다. 카드를 받아주세요.");break;
			}
			
			
		}
		else if ( 버튼 == 2 ) {
			for(int i = 0; i<5; i++) {
				System.out.println("비밀번호를 입력해주세요."); int 입력번호 = scanner.nextInt();
				if( 비밀번호 == 입력번호 ) {
					
					
					System.out.println("출금할 금액을 입력해주세요."); int 출금액 = scanner.nextInt();
					System.out.println(출금액 + "원을 인출하시겠습니까?");
					System.out.println("1.예\t2.아니요"); int 출금btn = scanner.nextInt();
					if( 출금btn == 1) { 
						System.out.println(출금액+"원이 인출되었습니다.\n감사합니다."); break;
					}else if ( 출금btn == 2) {
						System.out.println("거래를 종료합니다."); break;
					}else {}
					
					break;
				}else {
					System.err.println("비밀번호가 틀렸습니다."); 
					
				}
					
			}
			
			
			
		}

		else if ( 버튼 == 3 ) {System.out.println("감사합니다. \n카드를 받아주세요.");break;}
		else {}
			
			
		
		
		} // while end
	}// main end
	
}// class end
