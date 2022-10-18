package controller.board;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import model.dao.BoardDao;
import model.dto.BoardDto;

/**
 * Servlet implementation class list
 */
@WebServlet("/baord/list")
public class list extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 페이지당 게시물수 
		int listsize = Integer.parseInt(request.getParameter("listsize"));
		// 2. 전체 게시물수 
		int totalsize = BoardDao.getInstance().gettotalsize();
		// 3. *전체 페이지수 계산
		int totalpage = 0;
		if( totalsize % listsize == 0 ) totalpage = totalsize / listsize;	// 나머지가 없으면
		else totalpage = totalsize / listsize + 1;	// 나머지가 존재하면 나머지를 표시할 페이지+1
		// 3. 현재 페이지 번호  
		int page = Integer.parseInt( request.getParameter("page" )  );
		// 3. 페이지별 시작 게시물 행번호 
		int startrow = (page-1)*listsize;
			// 1페이지 -> 1-1 * 3 => 0 // 2페이지 -> 2-1 * 3 => 3 // 3페이지 -> 3-1 * 3 => 6
		// * 페이징처리에 필요한 정보 담는 jsonobject 
		JSONObject boards = new JSONObject();
		// 2. db
		ArrayList<BoardDto> list =  BoardDao.getInstance().getlist( startrow , listsize);
			// ** arraylist ---> jsonarray 변환[ js에서 쓸려고 ]
			JSONArray array = new JSONArray();
			for( int i = 0  ; i<list.size() ; i++ ) {
				JSONObject object = new JSONObject();
				object.put("bno", list.get(i).getBno() );
				object.put("btitle", list.get(i).getBtitle() );
				object.put("bdate", list.get(i).getBdate() );
				object.put("bview", list.get(i).getBview() );
				object.put("mid", list.get(i).getMid() );
				array.add(object);
			}		
		// 4. 
		boards.put("totalpage", totalpage );
		boards.put("data", array);
		// 3. 응답o
		response.setCharacterEncoding("UTF-8"); 
		response.getWriter().print( boards );
		
		
		
		
	}
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


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
