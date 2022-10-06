package model.dao;

import java.util.ArrayList;

import model.dto.MemberDto;

public class MemberDao extends Dao {
	// 0. 싱글톤 객체 선언 [ 공유 메모리 ] 
	private static MemberDao mdao = new MemberDao();
	public static MemberDao getInstance() { return mdao;}
	
	//1. 회원가입 메소드 
	public boolean signup( MemberDto dto ) {
		String sql ="insert into"
				+ " member( mid ,mpassword,"
				+ "mname,mphone,"
				+ "memail,maddress)"
				+ " values(?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString( 1 , dto.getMid() );
			ps.setString( 2 , dto.getMpassword() );
			ps.setString( 3 , dto.getMname() );
			ps.setString( 4 , dto.getMphone() );
			ps.setString( 5 , dto.getMemail() );
			ps.setString( 6 , dto.getMaddress() );
			ps.executeUpdate(); return true;
		}catch (Exception e) {System.out.println(e);}
		return false; 	
	} // 회원가입 end 
	
	// 2. 로그인 메소드 
	public boolean login( String id , String password) {
		String sql = "select * from member "
				+ "where mid=? and mpassword = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString( 1 , id );
			ps.setString( 2 , password );
			rs = ps.executeQuery();
			if( rs.next() ) { // 만약에 다음 레코드가 존재하면
				return true;
			}
		}catch (Exception e) { System.out.println(e); }
		return false;
	}
	
	// 3. 아이디찾기
	public String findid( String mname , String memail ) {
		String sql ="select * from member where mname=? and memail = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString( 1 , mname );
			ps.setString( 2 , memail );
			rs = ps.executeQuery();
			if( rs.next() ) { // 만약에 다음 레코드가 존재하면
				return rs.getString(2);
			}
		}catch (Exception e) { System.out.println(e); }
		return null;
	}
	
	// 4. 비밀번호찾기
	public boolean findpassword( String id , String memail ) {
		String sql ="select * from member where mid=? and memail =?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString( 1 , id );
			ps.setString( 2 , memail );
			rs = ps.executeQuery();
			if( rs.next() ) { // 만약에 다음 레코드가 존재하면
				return true;
			}
		}catch (Exception e) { System.out.println(e); }
		return false;
	}
	
	// 4. 비밀번호 번경
	public boolean findpasswordchange( String mid , String authkey ) {
		String sql ="update member set mpassword = ? where mid = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString( 1 , authkey );
			ps.setString( 2 , mid );
			ps.executeUpdate(); return true;
		}catch (Exception e) { System.out.println(e); }
		return false;
	}
	
	
	
	// 3. 아이디 중복체크
	public boolean idcheck( String mid ) {
		String sql ="select * from member where mid=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString( 1 , mid );
			rs = ps.executeQuery();
			if( rs.next() ) { // 만약에 다음 레코드가 존재하면
				return true;
			}
		}catch (Exception e) { System.out.println(e); }
		return false;
	}
	
	// 3. 회원목록 메소드 
	public ArrayList< MemberDto > list( ) {
		ArrayList< MemberDto > list = new ArrayList<>();
		String sql = "select * from member";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while( rs.next() ) { // 만약에 다음 레코드가 존재하면
		
				MemberDto dto = new MemberDto(
						rs.getInt(1), rs.getString(2),
						rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6),
						rs.getString(7), rs.getString(8),
						rs.getInt(9));
				list.add(dto);
			}
			return list;
		}catch (Exception e) { System.out.println(e); }
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
