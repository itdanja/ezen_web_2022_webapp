package java1.과제제출.과제2_비회원제게시판;

import java.util.Scanner;

public class 이종훈 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[][] list = new String[100][4];
		
		while(true){ // 무한반복
			
			System.out.println("번호\t작성자\t제목");
			for( int i = 0 ; i<list.length; i++ ) {
				if(list[i][0] != null ) {
					
				System.out.print(i+"\t");
				System.out.print(list[i][2]+"\t");
				System.out.print(list[i][0]+"\n");
				
				}
			}
			
		System.out.println("------------비회원 게시판---------------");	
		System.out.println("1. 글쓰기 2.글보기 선택 : "); int 버튼 = scanner.nextInt();
		
		
		if( 버튼 == 1) {
		System.out.println("제목"); String 제목 = scanner.next();
		System.out.println("내용"); String 내용 = scanner.next();
		System.out.println("작성자"); String 작성자 = scanner.next();
		System.out.println("비밀번호"); String 비밀번호 = scanner.next();
		
		for( int i = 0 ; i<list.length; i++) {
			if( list[i][0] == null ) {
				list[i][0] = 제목;
				list[i][1] = 내용;
				list[i][2] = 작성자;
				list[i][3] = 비밀번호;
				break;
			}
		}
		}
		else if(버튼 == 2) {
			System.out.println("게시물번호선택 :"); int i = scanner.nextInt();
			System.out.println("제목" + list[i][0] + "작성자: " +list[i][2]+ "내용 :"+ list[i][1]);
			System.out.println("1.뒤로가기 2.삭제 3.수정하기"); int bnum = scanner.nextInt();
			
			if( bnum == 1) {} 
			else if( bnum == 2) {
				System.out.println("비밀번호를 입력해주세요"); String 비밀번호 = scanner.next();
				if(비밀번호.equals(list[i][3]) ) {
					// 삭제처리
				for( int j = i ; j<list.length; j++) {	
					list[j][0] = list[j+1][0];
					list[j][1] = list[j+1][1];
					list[j][2] = list[j+1][2];
					list[j][3] = list[j+1][3];
					if(list[j+1][0] == null)break;
				}
				}else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
				
				
			}
				
			else if( bnum == 3) {
				System.out.println("비밀번호를 입력해주세요"); String 비밀번호 = scanner.next();
				if(비밀번호.equals(list[i][3]) ) {
					// 수정처리
					System.out.println("수정할 제목"); String 새로운제목 = scanner.next();
					System.out.println("수정할 내용"); String 새로운내용 = scanner.next();
					list[i][0] = 새로운제목;
					list[i][1] = 새로운내용;			
				}else {
					System.out.println("비밀번호가 틀렸습니다.");
					
				}
			}
			else {}
			
			
			
		}
		else {}
		
		
			
			
			
			
			
		}
		
		
	}
	
}
