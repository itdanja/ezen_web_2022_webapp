package controller.member;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

import model.dao.MemberDao;
import model.dto.MemberDto;

/**
 * Servlet implementation class list
 */
@WebServlet("/member/list")
public class list extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public list() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<MemberDto> list =  MemberDao.getInstance().list();
		
		String jsonText = "[{\"name\":\"kim\"}, {\"name\":\"lee\"}]";
		
		JSONParser jsonParser = new JSONParser();
		
		JSONArray arr = null;
		
		try {
			arr = (JSONArray) jsonParser.parse(jsonText);
		}catch (Exception e) {}
		
		
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(list);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
