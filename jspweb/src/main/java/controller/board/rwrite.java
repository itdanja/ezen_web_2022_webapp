package controller.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.BoardDao;
import model.dao.MemberDao;

/**
 * Servlet implementation class rwrite
 */
@WebServlet("/reply/rwrite")
public class rwrite extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 요청 
		request.setCharacterEncoding("UTF-8");
			// 댓글내용 , 작성자번호 , 게시물번호 
		String rcontent = request.getParameter("rcontent");	System.out.println( rcontent );
		int mno = MemberDao.getInstance().getMno( 
				(String)request.getSession().getAttribute("mid")
				) ;
		// **비로그인 일경우 반환
		if( mno == 0 ) { response.getWriter().print("0");  return; }
		
		int bno = (Integer)request.getSession().getAttribute("bno");
		// 2. db 처리 
		boolean result = BoardDao.getInstance().rwrite( rcontent , mno , bno );
		// 3. 결과 반환 
		if( result )response.getWriter().print("1");	// 성공
		else response.getWriter().print("2");			// db오류
	}
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public rwrite() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */


}
