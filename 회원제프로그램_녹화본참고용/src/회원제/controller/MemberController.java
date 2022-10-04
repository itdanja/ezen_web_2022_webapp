package 회원제.controller;

import 회원제.model.dao.MemberDao;
import 회원제.model.dto.MemberDto;

public class MemberController {
	private MemberController() {}
	private static MemberController mcontrol = new MemberController();
	public static MemberController getInstance() { return mcontrol; }
	
	private boolean login = false; // 로그인했다 안했다 기록 남기는 변수 
	
	public boolean getLogin() { return login; }
	
	public void setLogin(boolean login) { this.login = login; }

	public boolean login( String id , String password ) {
		return MemberDao.getInstance().login(id, password);
	}
	
	public int signup( MemberDto dto ) {
		// 중복체크 진행 
		boolean result =  MemberDao.getInstance().idcheck( dto.getId() );
		if( result ) { return 3;  } // 중복 있으니 함수 종료 
		else { // 중복 없으니 회원가입 그대로 진행  
			boolean result2 =  MemberDao.getInstance().signup(dto);
			if( result2 ) { return 1; }
			else { return 2 ;} 
		}
	}
	
	
}
















