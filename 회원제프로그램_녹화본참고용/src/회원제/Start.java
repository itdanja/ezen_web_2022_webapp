package 회원제;

import 회원제.view.Index;

public class Start {
	public static void main(String[] args) {
		Index.getInstacne().mainpage();	//  index.mainpage();
	}
}

// 메소드를 호출하는 방법
// 1. new 이용한 객체 선언 -> 객체명.메소드명()
// 2. static 메소드명()  -> 클래스명.메소드명()
// 3. 싱글톤 객체 호출한다. -> 클래스명.getInstacne().메소드명()
//							[  싱글톤 호출 ] 
// 4. 동일한 클래스내에서  ->  메소드명() 
// Index.getInstacne() ----> 반환 : index객체 반환
