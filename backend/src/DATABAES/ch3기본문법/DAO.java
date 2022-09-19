package DATABAES.ch3기본문법;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAO { // mysql 라이브러리가 프로젝트 build 포함
	
	// 1. 필드
	Connection con;			// db연결 인터페이스 
	PreparedStatement ps;	// sql연결/조작 인터페이스 
	ResultSet rs;			// sql결과[쿼리] 조작 인터페이스
	
	// 2. 생성자 : 객체 생성시 초기값
	public DAO() {
		try {
			con = DriverManager.getConnection( 
					"jdbc:mysql://localhost:3306/market_db", 
					"root", 
					"1234");
		}catch (Exception e) { System.out.println("오류 : " + e); }
	}
	
	// 3. 메소드
	// 1. 예제1 : 레코드10줄 -> memberDto 8개 -> 배열/리스트
	public ArrayList< MemberDto > 예제1결과( ) {
		// 배열(array) 대신에 배열을 편하게 사용할수 있는 미리 만들어진 클래스 [ 컬렉션(수집) 프레임워크 ]
			// 리스트 [선언] :  ArrayList< 리스트에 들어갈 객체의 클래스 > 리스트명 = new ArrayList<>();
			// 리스트에 객체 담기 : 리스트명.add( 객체명 ) 
		ArrayList< MemberDto > list  = new ArrayList<>();	// MemberDto 로 생성된 객체 여러개를 담을수 있는 list 객체 선언
		// 1. sql작성
		String sql = "select * from member";
		// 2. sql연결조작
		try {
			ps = con.prepareStatement(sql);
			// 3. sql결과조작
			rs = ps.executeQuery();
			while( rs.next() ) {
				// 레코드 -> 객체화
				MemberDto dto = new MemberDto(
						rs.getString(1), rs.getString(2), 
						rs.getInt(3), rs.getString(4),
						rs.getString(5), rs.getString(6),
						rs.getShort(7), rs.getString(8));
				// 객체 -> 배열/리스트 담기
				list.add(dto);
			} // while 
			return list;
		}catch (Exception e) { System.out.println(" 예제1 오류 : " + e); }
		return list;
	}
	
}






