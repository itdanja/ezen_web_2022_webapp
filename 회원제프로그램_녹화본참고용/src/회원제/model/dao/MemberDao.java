package 회원제.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import 회원제.model.dto.MemberDto;

public class MemberDao {
	private Connection con; 
	private PreparedStatement ps; 	// 접속된 DB에 SQL 연결 조작하는 인터페이스 
	private ResultSet rs;			// SQL 결과[쿼리]를 조작하는 인터페이스 
	private MemberDao() {
		try {
			 con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/testdb",
				"root",
				"1234");
		}catch (Exception e) { System.out.println("경고) DB 접속 실패 " + e ); }
	}
	private static MemberDao mDao = new MemberDao();
	public static MemberDao getInstance() { return mDao; }
	
	public boolean signup( MemberDto dto) {
		String sql ="insert into member values( null , ? , ? , ? , ?)"; // String sql = "insert into 테이블명 values( 값1, 값2 , 값3 )";
		try {
			ps = con.prepareStatement(sql);
			ps.setString( 1 ,  dto.getId() );
			ps.setString( 2 ,  dto.getPassword() );
			ps.setString( 3 ,  dto.getName() );
			ps.setString( 4 ,  dto.getPhone() );
			ps.executeUpdate(); return true;
		}catch (Exception e) {System.out.println(e);}
		return false;
	}
	
	public boolean login( String id , String password ) {
		String sql = "select * from member where id = ? and password = ?"; // 1. sql 작성한다.
		try {
			ps = con.prepareStatement(sql); // 2. 연결된(con) db에 sql 넣어준다.
			ps.setString( 1 , id );  ps.setString( 2 , password ); // 3. 연결된 sql를 조작한다.
			rs = ps.executeQuery(); // 4. 검색결과  [ rs( null ) ---next() --> 다음레코드
			if( rs.next() ) { // 5. 검색된 다음 레코드 [ rs.next() ] 존재하면 true 없으면 false
				return true; // 로그인성공 
			}
		} catch (Exception e) { System.out.println(e); } 
		return false; // 로그인 실패
	}
	
	public boolean idcheck( String id ) {
		String sql = "select * from member where id = ? ";
		try {
			ps = con.prepareStatement(sql);
			ps.setString( 1 , id );
			rs = ps.executeQuery();
			if( rs.next() ) { return true; } // 중복 있어 
		} catch (Exception e) { System.out.println(e); } 
		return false; // 중복 없어 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

