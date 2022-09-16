package java1.과제제출.과제2_비회원제게시판;

import java.util.Scanner;

public class 주혁 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String [][] list = new String [100] [4]; 	
		
		while(true) {
		
			System.out.println("----게시물----");
			System.out.println("번호\t 제목\t 작성자\t"); {
				for (int i = 0 ; i<list.length; i++) {
					if(list[i][0] !=null) {
					System.out.print(i+"\t");
					System.out.print(list[i][0]+ "\t");
					System.out.print(list[i][2]+"\n");
					}
				}
			}
			
			
			System.out.println("1.글쓰기 2.글보기"); int 버튼 = scanner.nextInt(); 
		
		if( 버튼 == 1) {
			System.out.println("제목 :"); String 제목 = scanner.next();
			System.out.println("작성자 :"); String 작성자 = scanner.next();
			System.out.println("내용"); String 내용 = scanner.next();
			System.out.println("비밀번호"); String 비밀번호 = scanner.next();
			for( int i = 0 ; i<list.length; i++) {
				if(list[i][0]==null) {
					list[i][0] =제목;
					list[i][1] =내용;
					list[i][2] =작성자;
					list[i][3] =비밀번호;
					break;
				}
			}
			
			
			
		}
		else if (버튼 ==2) {
			System.out.println("게시물 선택:"); int btn = scanner.nextInt();
			System.out.println("1.제목"+list[btn][0] +"2.작성자"+list[btn][2]+ "3.내용"+list[btn][1]);
			
			System.out.println("1.뒤로가기 2.삭제하기 3.수정하기"); int btn2 = scanner.nextInt();
			if(btn2 == 1) {}
			else if (btn2 == 2) {
				System.out.println("비밀번호 입력하세요"); String btn3 =scanner.next();
				if( btn3.equals(list[btn][3]) ) {
				for(int j = 0 ; j<list.length; j++) {
					list[j][0] = list[j+1][0];
					list[j][1] = list[j+1][1];
					list[j][2] = list[j+1][2];
					list[j][3] = list[j+1][3];						
					if(list[j+1][0] == null)break;
				}
				}else {System.out.println("비밀번호가 틀렸습니다");}
			}
			else if ( btn2 == 3) {
				System.out.println("비밀번호 입력하세요"); String btn3 =scanner.next();
				if( btn3.equals(list[btn][3]) ) {
					
					System.out.println("수정할 제목");String 수정할제목= scanner.next();
					System.out.println("수정할 내용");String 수정할내용 = scanner.next();
					list[btn][0] = 수정할제목;
					list[btn][1] = 수정할내용;
					
		}
				
				
			}
			else {}
			
			
			
		}
		
		else {}
		
		
		}
		
		
		
		
	}
}
