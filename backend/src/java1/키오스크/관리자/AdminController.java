package java1.키오스크.관리자;

public class AdminController {
	
	
	// 2. 메뉴 추가 로직
	boolean inMenu( String menuname ) {
		return AdminDAO.getInstance().inMenu(menuname); // 싱글톤객체 메소드 호출 
	}
	
	
	// 3. 제품 추가 로직 
	void inProduct( ) { }
	// 4. 주문 확인 로직 
	void getOrder( ) { }
	
}
