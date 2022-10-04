package java1.ch8인터페이스;

public interface 게임패드 {
	public void A버튼(); // 추상메소드 = 선언만o 구현x -> 객체마다 다르게 구현
	public void B버튼();
	public abstract void C버튼();
}
