package java1.과제제출.과제2_비회원제게시판;

import java.util.Scanner;

public class 신지웅 {

	public static void main(String[] args) {
		
		String[][] 게시판 = new String[100][4];
		Scanner 입력 = new Scanner(System.in);
		
		int count = 0;
		while(true) {			
			System.out.println("==============커뮤니티===============");
			System.out.println("번호\t작성자\t제목");
			if(count>=1) {
				for(int i=0 ; i<count ; i++) {
					System.out.println(i+"\t"+게시판[i][2]+"\t"+게시판[i][0]);
					
				}
			}
			System.out.print("1.글쓰기\t2.글보기\t 선택 : ");

			int sel_numb = 입력.nextInt();
			
			if(sel_numb<1 || sel_numb>2) {
				System.err.println("\n유효하지 않은 숫자입니다.");
			}			
			if(sel_numb==1) {
				System.out.println("제목 : ");
				String title = 입력.next();
				
				System.out.println("내용 : ");
				String content = 입력.next();
				
				System.out.println("작성자 : ");
				String writer = 입력.next();
				
				System.out.println("비밀번호 : ");
				String PW = 입력.next();
				
				게시판[count][0] = title;
				게시판[count][1] = content;
				게시판[count][2] = writer;
				게시판[count][3] = PW;						
				count++;
			}
			if(sel_numb==2) {
				System.out.println("게시물 번호 선택 : "); 
				int sel_index = 입력.nextInt();			
				System.out.println(count);
				if(sel_index>count-1) {
					System.err.println("유효하지 않은 숫자입니다.");
					continue;
				}
				
				System.out.println("=======게시물 상세 페이지=======");
				System.out.println("작성자 : " + 게시판[sel_index][2]+"\t제목 : "+게시판[sel_index][0]);
				System.out.println("내용 : " + 게시판[sel_index][1]);
				System.out.println("==========================");
				System.out.println("1.목록보기\t2.글삭제 3.글 수정");
				int sel_num = 입력.nextInt();	
				
				if(sel_num>3 || sel_num<1) {
					System.err.println("유효하지 않은 숫자입니다.");
					continue;
				}				
				if(sel_num==1) {
					continue;
				}else if(sel_num==2) {
					System.out.println("비밀번호 입력");
					String del_pw = 입력.next();
					if(del_pw.equals(게시판[sel_index][3])) {
						게시판[sel_index][0]=null;
						게시판[sel_index][1]=null;
						게시판[sel_index][2]=null;
						게시판[sel_index][3]=null;
						
						for(int i = sel_index ; i<count; i++) {
							게시판[i][0]=게시판[i+1][0];
							게시판[i][1]=게시판[i+1][1];
							게시판[i][2]=게시판[i+1][2];
							게시판[i][3]=게시판[i+1][3];
						}
						count--;
						continue;
					}else {
						System.err.println("글 삭제 실패. 비밀번호 불일치");
					}
				}else if(sel_num==3) {
					System.out.println("새로운 제목을 입력해주세요.");
					String correct_title = 입력.next();
					System.out.println("내용을 입력해주세요.");
					String correct_content = 입력.next();
					
					게시판[sel_index][0] = correct_title;
					게시판[sel_index][1] = correct_content;
					continue;
				}
			}
		}	
	}	
}






