package java1.가계부;

public class Controller {
	
	// 1. 내용추가 컨트롤러
	boolean create( String edate , 
			int emoney , String ecomment) {
		// 매개변수3개 --> 1개 dto 객체 선언 
		ExpenseDTO dto = new ExpenseDTO( 0 , edate,
				emoney, ecomment);
		// dto객체 -> dao 메소드 
		return ExpenseDAO.getInstance().create( dto );
	}

}

