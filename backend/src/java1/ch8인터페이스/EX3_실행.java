package java1.ch8인터페이스;

public class EX3_실행 {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.run();
		
		// 구현객체 교체 
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();
		
	}
}
