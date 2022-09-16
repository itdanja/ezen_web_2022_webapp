package java1.과제제출.과제2_비회원제게시판;

import java.util.Scanner;

public class 최윤미 {

	public static void main(String[] args ) {
		
	
		
		 String box2 [][] = new String [100][4];
		 Scanner scanner = new Scanner(System.in);  // 객체 입력
	
		 int i = 0;
		 
		

		 while (true) { // 게시판 반복

		   System.out.println("----------- 커뮤니티  -----------");
		   System.out.println(" 번호\t 작성자\t 제목");
		    for ( i = 0 ; i<box2.length; i++ ){
                            if (box2[i][0] != null) { // 값이 nll이 아니면 출력
                                   System.out.println ( i +"\t " +box2[i][0] + "\t" +box2[i][1]);
                              }
                   
		           }         

		   System.out.println("1. 글쓰기 2. 글보기  선택 : ");  int choice = scanner.nextInt();

                   
                    if ( choice == 1) {
                            
                            // 내용 입력 받음
                             System.out.println ("----------------------글쓰기 페이지 ---------------");
                             System.out.print( "title : " );   String title = scanner.next(); // tilte 내용 입력 받음
                             System.out.print ("content : " );  String content = scanner.next();
                             System.out.print (" writer : " ); String writer = scanner.next();
                             System.out.print (" password : " );  String password = scanner.next();


                          // 입력받은 내용을 배열에 저장
                        for (i =0; i<box2.length; i++) {
                          if ( box2[i][0] == null) {
                              box2[i][0] = writer ;// 작성자 
                              box2[i][1] = title; // 제목
                              box2[i][2] = content;
                              box2[i][3] = password; 
                                
                              break;

                           }
                      } // for 종료

                    }else if ( choice ==2 ) {
                              
                            System.out.println("게시물 번호 (인덱스) 선택   : "  );   i = scanner.nextInt();
                       
                             System.out.println (" -------------------게시물  상세페이지------------");
                             System.out.print( " 작성자 : " + box2[i][0] );  // 해당 i번째 인덱스의 작성자 내용을 출력
                             System.out.print( " 제목 : "  + box2[i][1] );
                             System.out.println("  내용 : " +  box2[i][2] );

                            System.out.println ( "1. 목록보기(뒤로가기)  2. 글삭제 3. 글수정  선택 : ");  int choice2 = scanner.nextInt();

                             if (choice2 == 2) {
                                    System.out.println("알림) 현 게시물 비밀번호 :"); String password = scanner.next();
                                      if( password.equals(box2[i][3])) {
                                    	  
                                    	  box2[i][0] = null;
                                          box2[i][1] = null;
                                          box2[i][2] = null;
                                          box2[i][3] = null; 
                                    	     
                                    	  
                                    	   System.out.println(" 알림) 삭제 성공");  
                                     }
                                  } //if end
                             else if ( choice2 == 3) {
                            	 
                            	 System.out.println("알림) 현 게시물 비밀번호 :" ); String password = scanner.next();
                            	 
                                  if( password.equals(box2[i][3])) { 
                                	  
                               	        System.out.println(" 수정할 제목 : " ); String content2 = scanner.next();
                               	        System.out.println(" 수정할 내용: " );  String title2 = scanner.next();
                               	        
                               	             box2[i][1] = title2; // 제목
                                             box2[i][2] = content2;
                               	       
                               	        System.out.println("알림) 내용이 수정되었습니다.");
                               	
                                       } else {System.out.println(" 알림)) 비밀번호가 다릅니다 [ 삭제실패 ]");}
                               	        
                             
                               	 
                               	  
                                }//else if end
                            	 
                            	 
                    
                             

                     } //else if2  종료
		   
		   
		   
		
 		 } // while end
		
		
	}// main end
	
 } // class end
