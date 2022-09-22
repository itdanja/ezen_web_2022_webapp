package java1.가계부;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ExpenseDAO {
	// 1. 필드
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private static ExpenseDAO dao = new ExpenseDAO(); // 싱글톤 객체 [ 생성자를 private ]
	
	// 2. 생성자
	private ExpenseDAO() {
		try {
		con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/test",
				"root", "1234");
		}
		catch (Exception e) { System.out.println("DB오류:"+e);}
	}
	
	// 3. 메소드 
	public static ExpenseDAO getInstance() { return dao; }
	

}
