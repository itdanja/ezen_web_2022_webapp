package controller.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

import model.dao.BoardDao;
import model.dao.MemberDao;

/**
 * Servlet implementation class write
 */
@WebServlet("/board/write")
public class write extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String mid = (String)request.getSession().getAttribute("mid");	// 1. 로그인 세션[ 로그인한 사람의 아이디] 가져오기 
		int mno = MemberDao.getInstance().getMno(mid);					// 2. 회원 아이디 ---> 회원번호
			System.out.println( mno );											// fk는 pk에 있는 데이터만 저장가능 [ 무결성 ] 
		String btitle = request.getParameter("btitle");					// 3. 입력받은 데이터1 요청
		String bcontent = request.getParameter("bcontent");				// 3. 입력받은 데이터2 요청
			System.out.println( btitle );
			System.out.println( bcontent );			
		boolean result = 												// 4. DAO 호출 [ 저장 ]
		BoardDao.getInstance().write(btitle, bcontent , mno );
			System.out.println( result );
		/* js 전송용  */
		response.getWriter().print(result);								// 5. 결과를 AJAX 돌려주기
		
		/* form 전송용  */
		//if( result ) { response.sendRedirect("list.jsp");}
		//else {response.sendRedirect("write.jsp");}
		
	}
	
	private static final long serialVersionUID = 1L;
     
    public write() {
        super();
        // TODO Auto-generated constructor stub
    }



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 첨부파일[ cos.jar 라이브러리 필요 ]
			// 1. cos.jar 빌드 추가 
			// 2. HttpServletRequest : 첨부파일 지원x 	[ 소량의	문자 가능 ]
			// 3. MultipartRequest	: 첨부파일 지원o	[ 대용량의 문자 가능 ]
				// 첨부파일 : http post메소드 지원
			// new MultipartRequest( 1.요청방식 , 2.파일저장경로 , 3.최대용량범위 , 4.인코딩타입 , 5.기타(보안기능)  )
		
		// 1. 저장 경로 [ 프로젝트 저장 ] 
		String uploadpath = "C:\\Users\\504t\\git\\ezen_web_2022_webapp\\jspweb\\src\\main\\webapp\\upload";
		
		MultipartRequest multi = new MultipartRequest(
							request ,  // 1. 요청방식 
							
				);
		
		
		
		
		
		
	}

}




















