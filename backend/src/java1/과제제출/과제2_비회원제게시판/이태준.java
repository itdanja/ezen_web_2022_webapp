package java1.과제제출.과제2_비회원제게시판;

import java.util.Scanner;

public class 이태준 {
	public static void main(String[] args) {
	      
	      //변수
	         // 자료형 변수명 = 데이터      1개 저장 
	      // 1차원 배열 
	         // 자료형[] 변수명 = new 자료형[길이]      길이만큼 저장 
	      // 2차원 배열 
	         // 자료형[][] 변수명 = new 자료형[행][열]    행x열 만큼 저장 
	      String[][] box = new String[100][4];
	      Scanner scanner = new Scanner(System.in);
	      
	      while(true) {
	         System.out.println("----커뮤니티-----");
	         System.out.println("번호 \t 작성자 \t 제목");
	         
	         for( int i = 0 ; i<box.length ; i++ ) {
	            if( box[i][0] != null ) {
	               System.out.print( i +"\t" );
	               System.out.print( box[i][2] +"\t" );         
	               System.out.println( box[i][0] );
	            } // if end
	         }	// for end
	   
	         
	         System.out.println("1.글쓰기 2.글보기 선택 :");
	         
	         int box1 = scanner.nextInt();
	      
	         if( box1==1) {
	            System.out.println("제목 : "); 		String 제목= scanner.next();
	            System.out.println("내용 : ");  		String 내용= scanner.next();
	            System.out.println("작성자 : ");  	String 작성자= scanner.next();
	            System.out.println("비밀번호 : ");  	String 비밀번호= scanner.next();
	            
	            for( int i = 0 ; i<box.length ; i++ ) { //  i = 행 = 인덱스 
	               if( box[i][0] == null ) {   
	                  box[i][0] = 제목;
	                  box[i][1] = 내용;
	                  box[i][2] = 작성자;
	                  box[i][3] = 비밀번호;
	                  break; // 1개만 저장 
	               }	// if end 2
	            } // for end
	         } // if end 1
	         else if(box1 == 2) {
	            
	            int 입력 = scanner.nextInt();
	            
	            System.out.println(  "제목"+ box[입력][0] + "작성자" + box[입력][2] );
	            System.out.println( "내용 :" + box[입력][1] );
	            System.out.println("1. 뒤로가기 2.삭제 3수정  : ");
	            
	            int box3 = scanner.nextInt();
	            // 삭제
	            if( box3 == 1 ) { }
	            else if( box3 == 2 ) {
	               System.out.println("비밀번호 : "); String 비밀번호 = scanner.next();
	               if( box[입력][3] .equals(  비밀번호 )  ) {
	                  // 문자열은 == 사용불가능 --->  equals 메소드
	                  box[입력][0] = null;
	                  box[입력][1] = null;
	                  box[입력][2] = null;
	                  box[입력][3] = null;
	                  System.out.println("그 게시물을 삭제 되었습니다.");
	               }
	               else { System.out.println("비밀번호가 다릅니다. ");}
	            }
	            // 수성궁
	            else if( box3 == 3 ) { System.out.println("비밀번호 : "); String 비밀번호 = scanner.next();
	               if(box[입력][3].equals(비밀번호)) {
	            	  System.out.println("비번일치. 수정시작");  
	            	  System.out.println("수정할 제목 : "); 		String 입력1 = scanner.next();
	            	  System.out.println("수정할 내용 : "); 		String 입력2 = scanner.next();
	            	  System.out.println("수정할 작성자 : "); 		String 입력3 = scanner.next();     
	            	  System.out.println("수정할 비밀번호 : "); 	String 입력4 = scanner.next();
	                  
	                  box[입력][0] = 입력1;
	                  box[입력][1] = 입력2;
	                  box[입력][2] = 입력3;
	                  box[입력][3] = 입력4;
	                  
	                  System.out.println(입력+"수정궁 완료");
	               }
	            }
	            else {}
	         }
	         else {}
	      }
	   }

}
