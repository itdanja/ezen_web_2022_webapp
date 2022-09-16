package java1.과제제출.과제2_비회원제게시판;

import java.util.Scanner;

public class 성지혜 { // class s

	public static void main(String[] args) { // main s
		
		// 0. 메모리
		String[][] memberlist = new String[100][4]; // 문자열 300개를 저장할 수 있는 배열 선언
		Scanner scanner = new Scanner(System.in); 	// 입력객체
		int box = 0; // 
		
		// 1. 무한루프 [ 프로그램 실행 ]
		while( true ) { // while s ( 종료조건 : 없음 )
			System.out.println("------------- 커뮤니티 ------------");
			System.out.println("번호\t작성자\t제목"); // \t : 5칸씩 띄어쓰기
			if( box > 0 ) {
				for( int i=0; i<box; i++ ) {
					System.out.printf("%d\t%s\t%s\n" , i ,memberlist[i][2], memberlist[i][0] ); // %d : , \t : 5칸 띄어쓰기, %s : , \n : 줄바꿈
				}
				System.out.println();
			}
			System.out.println("1.글쓰기 2. 글보기 선택 : "); int btn = scanner.nextInt();
			System.out.println();
			
			if( btn == 1 ) { // 글쓰기. 1 입력했을때
				System.out.println("============== 글쓰기 페이지 =========");
				// 1. 글쓰기 정보를 입력받는다.
				System.out.print("title : ");		memberlist[box][0] = scanner.next();
				System.out.print("content : ");		memberlist[box][1] = scanner.next();
				System.out.print("writer : ");		memberlist[box][2] = scanner.next();
				System.out.print("password : ");	memberlist[box][3] = scanner.next();
				box++; //
				} // if end
			
			else if ( btn == 2 ) { // 글보기. 2 입력했을때
				System.out.print("게시물 번호(인덱스) 선택 : "); int btn2 = scanner.nextInt();
				System.out.println("------------ 게시물 상세페이지 -------------");
				
				if( btn2>=box || btn2<0 ) // 인덱스번호가 3보다 크거나 0보다 작을경우 안내 메시지 출력
					System.out.println("등록되지 않은 인덱스입니다.");
				else {
					System.out.printf("작성자 : %s\t제목 : %s\n" , memberlist[btn2][2], memberlist[btn2][0]);
					System.out.println("내용 : " + memberlist[btn2][1] );
					System.out.println("------------------------------------");
					System.out.print("1.목록보기(뒤로가기) 2.글삭제 3.글수정 선택 : ");
					int btn1 = scanner.nextInt();
					
					if( btn1 == 1 ) { // 목록보기(뒤로가기)
						System.out.println();
					}
					else if( btn1 == 2 ) { // 글삭제
						System.out.print("알림))현 게시물 비밀번호 : ");
						String password = scanner.next();
						if( memberlist[btn2][3].equals(password) ) { // 비밀번호가 일치할때
								memberlist[btn2][0] = null;
								memberlist[btn2][1] = null;
								memberlist[btn2][2] = null;
								memberlist[btn2][3] = null;
								
								// 삭제한 글 뒤로 한칸씩 당기기
								for( int j=btn2; j<memberlist.length-1; j++ ) { 
										memberlist[j][0] = memberlist[j+1][0];
										memberlist[j][1] = memberlist[j+1][1];
										memberlist[j][2] = memberlist[j+1][2];
										memberlist[j][3] = memberlist[j+1][3];
										// 다음 인덱스가 null이면 [ 작성한 글 목록이 없다는 뜻 ]
										if( memberlist[btn2+1] == null )
											break;
							} // for e
							box--;
							System.out.println("알림) 삭제 성공");
						} // if e
						else{
							System.err.println("알림) 비밀번호가 다릅니다 [삭제실패]");
						}
					} // else if2 e
					
					else if( btn1 == 3 ) { // 글수정
						System.out.print("알림) 현 게시물 비밀번호 : ");	String password = scanner.next();
						if( memberlist[btn2][3].equals(password) ) {
							System.out.print("수정할 제목 : ");
							String changetitle = scanner.next();
							System.out.print("수정할 내용 : ");
							String changecontent = scanner.next();
							
							memberlist[btn2][0] = changetitle;
							memberlist[btn2][1] = changecontent;
							
							System.out.println("알림) 내용이 수정되었습니다.");
						}
						else {
							System.err.println("알림) 비밀번호가 다릅니다.");
						}
					}
					else {
						System.err.println("선택할 수 없는 번호를 입력하였습니다.");
					}
				}
			
			}
			else {
				System.out.println("알 수 없는 번호를 입력하였습니다.\n");
			}
			
			
		} // while end
		
		
		
	} // main e
	
} // class e

