package 과제2_비회원제게시판;

import java.util.Scanner;

public class 박수현 {
	public static void main(String[] args) {
		String[][] boardlist= new String[100][4]; //4개 변수 담고 총 100개 게시물 담을 수 있는 배열 선언
		Scanner scanner= new Scanner(System.in);
		
		while(true) {//프로그램 실행[무한반복 / 종료조건 X]
			System.out.println("----------------커뮤니티-----------------------");
			System.out.println("번호\t작성자\t제목");	

			//입력 게시물 화면 출력
			for(int i=0; i<boardlist.length; i++) {
				if(boardlist[i][0]!=null) {
					System.out.println(i +"\t"+boardlist[i][2] +"\t"+ boardlist[i][0]);
				}
			}
			
			System.out.print("1. 글쓰기 2. 글보기 선택 : "); int btn= scanner.nextInt();
			
			if(btn==1) {// 글쓰기 버튼 눌렀을때 
				System.out.println("--------------- 글쓰기 페이지 ---------------------------");
				
				System.out.print("title : "); String title=scanner.next();
				System.out.print("content : "); String content=scanner.next();
				System.out.print("writer : "); String writer=scanner.next();
				System.out.print("password : "); String password=scanner.next();
				
				for(int i=0; i<boardlist.length; i++) { // 작성 변수 배열에 담기
					if(boardlist[i][0]==null) {
						boardlist[i][0]= title; boardlist[i][1]= content;
						boardlist[i][2]= writer; boardlist[i][3]= password;
						System.out.println();
						break;
					}
					if(i==99) {System.out.println("안내 ) 더 이상 게시물을 작성할 수 없습니다. 관리자에게 문의바랍니다.");}
				}
				
			}//글쓰기 버튼 끝
			
			else if(btn==2) {//글보기 버튼
				boolean del=true;
				while(del) {//while2	종료조건 목록돌아가면?
					System.out.print("게시물 번호 선택 : "); int boardnum=scanner.nextInt();
					System.out.println("--------------- 게시물 상세페이지 ---------------------------------");
					
					System.out.println("작성자 : " + boardlist[boardnum][2]+"\t 제목 : " + boardlist[boardnum][0]);
					System.out.println("내용 :" +boardlist[boardnum][1]);
					System.out.println("----------------------------------------------------------");
					System.out.println("1. 목록보기(뒤로가기) 2. 글삭제 3. 글수정 선택 : "); int btn2=scanner.nextInt();
					
					if(btn2==1) {
						System.out.println("메인으로 돌아갑니다. ");
						break;//while2 탈출
					}//btn2-1 종료
					
					else if(btn2==2) {
						System.out.println("알림 ) 선택하신 게시물의 비밀번호 : "); String password2= scanner.next();
						for(int i=0; i<boardlist.length; i++) {
							if(boardlist[i][0]!=null && boardlist[i][3].equals(password2)) {
								//비밀번호가 같으면
								boardlist[i][0]=null; boardlist[i][1]=null;
								boardlist[i][2]=null;  boardlist[i][3]=null;
								System.out.println("알림 ) 삭제 성공");
								
								// 당기기
								for(int j=i; j<boardlist.length; j++) {
									boardlist[j][0]= boardlist[j+1][0];
									boardlist[j][1]= boardlist[j+1][1];
									boardlist[j][2]= boardlist[j+1][2];
									boardlist[j][3]= boardlist[j+1][3];
									
									//다음 값이 등록안돼있을때까지
									if(boardlist[j+1][0]==null) {break;}
									
								}// 당기기 for end
								
								del=false;
								break;
								
							}//비밀번호 동일 if end
							else {System.out.println("비밀번호가 다릅니다. [삭제실패]"); break; }
							
							
						}//btn2-2 for end
					}//btn2-2 종료
					
					else if(btn2==3) {
						System.out.println("알림 ) 수정할 게시물의 비밀번호"); String password2= scanner.next();
						for(int i=0; i<boardlist.length; i++) {
							if(boardlist[i][0]!=null && boardlist[i][3].equals(password2)) {
								System.out.println("수정할 제목 : "); String title2= scanner.next();
								System.out.println("수정할 내용 : "); String content2= scanner.next();
								boardlist[i][0]=title2; boardlist[i][1]=content2; 
								System.out.println("알림 ) 내용이 수정되었습니다.");
								del=false;
								break;
							}
							else {System.out.println("비밀번호가 다릅니다"); break; }
						}//btn2-3 for end
					
					
					}//btn2-3 종료
					
					
				}//while2 end
				
			}//글보기 버튼 끝
			
			
			
			else {System.out.println("안내 ) 잘못된 입력입니다. 다시 입력해주세요");}
			
		}//main while end
		
	}//main end
}
