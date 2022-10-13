package model.dao;

import java.util.ArrayList;

import model.dto.BoardDto;

public class BoardDao extends Dao {
	
	private static BoardDao bdao = new BoardDao();
	public static BoardDao getInstance() { return bdao; }
	
	// 1. 글등록 
	public boolean write( String btitle , 
			String bcontent , int mno) {
		
		String sql ="insert into board(btitle,bcontent,mno) "
				+ "values( ? , ? , ? )";
		try {
			ps = con.prepareStatement(sql);
			ps.setString( 1 , btitle );
			ps.setString( 2 , bcontent );
			ps.setInt( 3 , mno);
			ps.executeUpdate(); return true;
		}catch (Exception e) {System.out.println( e );}
		return false;
	}
	// 2. 글출력 [ JSP 용 ] 
	public ArrayList< BoardDto > getlist( ) {
		ArrayList< BoardDto > list = new ArrayList<>();
		String sql = "select * from board";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			// if[한개] -> dto vs while[여러개] -> list
			while( rs.next() ) {
				BoardDto dto = new BoardDto(
						rs.getInt(1) , rs.getString(2) , 
						rs.getString(3), rs.getInt(4) );
				list.add(dto); // 리스트에 담기
			}
			return list;
		}
		catch (Exception e) {System.out.println(e);} return list;
	}
	
	// 3. 글 조회
	public BoardDto getboard( int bno) {
		String sql ="select * from board "
				+ "where bno =  "+bno;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if( rs.next() ) {
				BoardDto dto = new BoardDto( 
						rs.getInt( 1 ) , rs.getString(2),
						rs.getString(3) , rs.getInt(4) );
				return dto;
			}
		}catch (Exception e) {System.out.println(e);}
		return null;
	}
	
	
	
	
}























