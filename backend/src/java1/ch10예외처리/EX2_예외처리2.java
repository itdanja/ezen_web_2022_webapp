package java1.ch10예외처리;

public class EX2_예외처리2 {
	
	// 필드
	
	// 생성자 
	
	// 메소드
		// String[] args : 기본적으로 비어있는 배열 
	public static void main( String[] args ) {
		
		// 0.  Class.forName : 일반예외발생
		try { 
			Class clazz = Class.forName("java.lang.String2");
		}catch ( ClassNotFoundException e ) { 
			System.out.println("클래스가 존재하지 않습니다.: " + e); 
		}finally {
			System.out.println("클래스 찾든 안찾든 무조건 실행");
		}
		
		// 1. NullPointer
		try {
			String data = null;
			System.out.println( data.toString() );
		}catch ( NullPointerException e) { 
			System.out.println("객체의 내용이 없습니다.[참조없다] : " + e); 
		}
		// 2. ArrayIndexOutOfBounds
		try {
			String data1 = args[0];
			String data2 = args[1];
			System.out.println( "data1 : " + data1 );
			System.out.println( "data2 : " + data2 );
		}catch ( ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 없습니다. : " + e );
		}
		
		try {
			int[] 정수배열 = new int[3];
			for( int i = 0 ; i <= 정수배열.length ; i++ ) {
				System.out.println( 정수배열[i] );
			}
		}catch ( ArrayIndexOutOfBoundsException e) { 
			System.out.println("배열의 없는 인덱스 입니다 : " + e );
		}
	
	/*
		// 3. NumberFormat
			 	자료형 입력 안했을때 기본적으로 설정되는 자료형 
			 		1234 <--- int 
			 		12.34 <--- double
			 		'A'   <--- char
			 		"안녕" <--- String (클래스)
			  	int 정수 = 123  <-- int에 저장되기전 123 무슨 자료형??
	*/		
		try {
			String data1 = "100"; // 문자열 100  // 왜?   " " <--- String
			String data2 = "a100";
				// * 메소드 호출방법1 : Static메소드는 : 클래스명.메소드명()
			int value1 = Integer.parseInt( data1 );	// "100" --> 100
			int value2 = Integer.parseInt( data2 ); // "a100" --> x
			
			int result = value1 + value2;
			System.out.println( data1 + data2 + "=" + result );
		}catch (NumberFormatException e) { 
			System.out.println(" 정수형으로 변환 실패 : " + e );
		}
	 
		try {
			// 1. 자식 객체 선언 
			Dog dog = new Dog();
			changeDog( dog );
			
			// 2. 자식 객체 선언 
			Cat cat = new Cat();
			changeDog(cat); // 예외발생 시점 ---> catch
		}catch ( ClassCastException e) {
			System.out.println("클래스형 변환 실패 : " +  e);
		}
		
	} // main end 
	public static void changeDog( Animal animal ) {
		Dog dog = (Dog)animal;
	}
	
}
/*
 		스택			힙
 		
 		지역변수 		객체		
 		(메소드)
 */







