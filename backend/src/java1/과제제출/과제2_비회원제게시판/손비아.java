package java1.과제제출.과제2_비회원제게시판;

import java.util.Scanner;

public class 손비아 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] postlist = new String[100][4];
		int postIndex = 0;
		
		while(true) {
			System.out.println("--------- 커뮤니티 ----------");
			System.out.println("번호\t작성자\t제목");
			if(postIndex>0) {
				for(int i=0;i<postIndex;i++) {
					System.out.printf("%d\t%s\t%s\n",i,postlist[i][2],postlist[i][0]);
				}
				System.out.println();
			}
			System.out.print("1.글쓰기 2.글보기  선택 : ");	int num = sc.nextInt();
			System.out.println();
			
			if(num==1) {		//글쓰기
				System.out.print(" title : ");		postlist[postIndex][0] = sc.next();
				System.out.print(" content : ");	postlist[postIndex][1] = sc.next();
				System.out.print(" writer : ");		postlist[postIndex][2] = sc.next();
				System.out.print(" password : ");	postlist[postIndex][3] = sc.next();
				postIndex++;
				
			}else if(num==2) {	//글보기
				System.out.print(" 게시물 번호(인덱스) 선택 : ");	int row = sc.nextInt();
				System.out.println("\n------------- 게시물 상세페이지 -------------");
				
				if(row>=postIndex || row<0)
					System.err.println("없는 인덱스를 입력했습니다.");
				else {
					System.out.printf("작성자 : %s\t제목 : %s\n",postlist[row][2],postlist[row][0]);
					System.out.println("내용 : "+postlist[row][1]);
					System.out.println("----------------------------------------");
					System.out.print("1.목록보기(뒤로가기) 2.글삭제 3.글수정  선택 : ");
					int num2 = sc.nextInt();
					if(num2==1) {			//목록보기(뒤로가기)
						System.out.println();
					}else if(num2==2) {		//글삭제
						System.out.print("알림) 현 게시물 비밀번호 : ");
						String password = sc.next();
						if(postlist[row][3].equals(password)) {		//비밀번호 맞음
							postlist[row][0] = null;
							postlist[row][1] = null;
							postlist[row][2] = null;
							postlist[row][3] = null;
							
							for(int j=row;j<postlist.length-1;j++) {
								postlist[j][0] = postlist[j+1][0];
								postlist[j][1] = postlist[j+1][1];
								postlist[j][2] = postlist[j+1][2];
								postlist[j][3] = postlist[j+1][3];
								if(postlist[row+1] == null) break;		//다음이 null이 나올 때까지 [게시글이 없다는 뜻으로] 
							}
							postIndex--;
							System.out.println(" 알림) 삭제 성공 ");
						}else {										//비밀번호 틀림
							System.out.println(" 알림) 비밀번호가 다릅니다 [ 삭제실패 ]");
						}
					}else if(num2==3) {		//글수정
						System.out.print("알림) 현 게시물 비밀번호 : ");
						String password = sc.next();
						if(postlist[row][3].equals(password)) {		//비밀번호 맞음
							System.out.print(" 수정할 제목 : ");
							String changeTitle = sc.next();
							System.out.print(" 수정할 내용 : ");
							String changeContent = sc.next();
							
							postlist[row][0] = changeTitle;
							postlist[row][1] = changeContent;
							
							System.out.println(" 알림) 내용이 수정되었습니다.");
						}else {										//비밀번호 틀림
							System.out.println(" 알림) 비밀번호가 다릅니다 [ 삭제실패 ]");
						}
					}else {
						System.out.println("선택할 수 없는 번호를 입력하였습니다.\n");
					}
				}
			}else {
				System.out.println("알 수 없는 번호를 입력하였습니다.\n");
			}
		}
	}

}
/*
비회원제 게시판
	[조건]
	2차원 배열, 변수, 제어문, 반복문, 1차원 배열 사용
	메소드 사용 불가
	
	[출력 예시]
	--------- 커뮤니티 ----------


~~~~~~~~~~~~~~~~~~~~~~~~~
번호	작성자	제목
1.글쓰기 2.글보기  선택 : 1



~~~~~~~~~~~~~~~~~~~~~~~~~
----------------- 글 쓰기 페이지 ----------------
 title : 안녕자바
 content : 자바
 writer : 유재석
 password : 1234


~~~~~~~~~~~~~~~~~~~~~~~~~
--------- 커뮤니티 ----------
번호	작성자	제목
0	유재석	안녕자바 
1.글쓰기 2.글보기  선택 : 1



~~~~~~~~~~~~~~~~~~~~~~~~~
----------------- 글 쓰기 페이지 ----------------
 title : 안녕
 content : 하하하
 writer : 강호동
 password : 4567


~~~~~~~~~~~~~~~~~~~~~~~~~
--------- 커뮤니티 ----------
번호	작성자	제목
0	유재석	안녕자바 
1	강호동	안녕 
1.글쓰기 2.글보기  선택 : 1


~~~~~~~~~~~~~~~~~~~~~~~~~
----------------- 글 쓰기 페이지 ----------------
 title : gkgkgk
 content : zzzzzz
 writer : 신동엽
 password : 7891


~~~~~~~~~~~~~~~~~~~~~~~~~
--------- 커뮤니티 ----------
번호	작성자	제목
0	유재석	안녕자바 
1	강호동	안녕 
2	신동엽	gkgkgk 
1.글쓰기 2.글보기  선택 : 2
 게시물 번호(인덱스) 선택 : 1

~~~~~~~~~~~~~~~~~~~~~~~~~
------------- 게시물 상세페이지 --------------------
작성자: 강호동  제목 : 안녕 
내용 : 하하하 
----------------------------------------
 1. 목록보기(뒤로가기) 2.글삭제 3.글수정 선택 : 1


~~~~~~~~~~~~~~~~~~~~~~~~~
--------- 커뮤니티 ----------
번호	작성자	제목
0	유재석	안녕자바 
1	강호동	안녕 
2	신동엽	gkgkgk 
1.글쓰기 2.글보기  선택 : 2
 게시물 번호(인덱스) 선택 : 1


~~~~~~~~~~~~~~~~~~~~~~~~~
------------- 게시물 상세페이지 --------------------
작성자: 강호동  제목 : 안녕 
내용 : 하하하 
----------------------------------------
 1. 목록보기(뒤로가기) 2.글삭제 3.글수정 선택 : 2
 알림)) 현 게시물 비밀번호 : 
4567
 알림)) 삭제 성공 


~~~~~~~~~~~~~~~~~~~~~~~~~
--------- 커뮤니티 ----------
번호	작성자	제목
0	유재석	안녕자바 
1	신동엽	gkgkgk 
1.글쓰기 2.글보기  선택 : 2
 게시물 번호(인덱스) 선택 : 1
------------- 게시물 상세페이지 --------------------
작성자: 신동엽  제목 : gkgkgk 
내용 : zzzzzz 



~~~~~~~~~~~~~~~~~~~~~~~~~
----------------------------------------
 1. 목록보기(뒤로가기) 2.글삭제 3.글수정 선택 : 3
 알림)) 현 게시물 비밀번호 : 7891
 수정할 제목 : 하하하하
 수정할 내용 : ㅋㅋㅋㅋㅋ
 알림)) 내용이 수정되었습니다. 
--------- 커뮤니티 ----------
번호	작성자	제목
0	유재석	안녕자바 
1	신동엽	하하하하 
1.글쓰기 2.글보기  선택 : 2
 게시물 번호(인덱스) 선택 : 1


~~~~~~~~~~~~~~~~~~~~~~~~~
------------- 게시물 상세페이지 --------------------
작성자: 신동엽  제목 : 하하하하 
내용 : ㅋㅋㅋㅋㅋ 
----------------------------------------
 1. 목록보기(뒤로가기) 2.글삭제 3.글수정 선택 : 2
 알림)) 현 게시물 비밀번호 : 
7777
 알림)) 비밀번호가 다릅니다 [ 삭제실패 ]
--------- 커뮤니티 ----------
번호	작성자	제목
0	유재석	안녕자바 
1	신동엽	하하하하 
1.글쓰기 2.글보기  선택 : 
	

*/