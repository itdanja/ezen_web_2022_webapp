package controller.member;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Email;
import model.dao.MemberDao;

/**
 * Servlet implementation class findid
 */
@WebServlet("/member/findpassword")
public class findpassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public findpassword() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String mid = request.getParameter("mid");
		String memail = request.getParameter("memail");
		
		boolean result = MemberDao.getInstance().findpassword(mid, memail);
		if( result ) {
			
                String authkey = "";
                Random random = new Random();
                for( int i = 0 ; i<15 ; i++ ){ // 15자리 문자 난수 생성
                    char randomchar = (char)(random.nextInt(26) + 97);// 97~122 // 소문자 a -> z 중 하나 난수 발생
                    authkey += randomchar; // 생성된 문자 난수들을 하나씩 연결 -> 문자열 만들기
                }
            
			boolean result2 =  Email.sendemail(memail, authkey );
			if( result2 ) { MemberDao.getInstance().findpasswordchange(mid, authkey); }
			
		}
		response.getWriter().print(result);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
