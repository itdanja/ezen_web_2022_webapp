package java1.ch8인터페이스;

public class SmartTelevision implements RemoteControl , Searchable {

	private int volume;
	
	@Override
	public void search(String url) { System.out.println( url +"을 검색합니다."); }
	@Override
	public void turnOn() { System.out.println("스마트tv를 켭니다.");}
	@Override
	public void turnOff() { System.out.println("스마트tv를 끕니다.");}
	@Override
	public void setVolume(int volume) {
		// 만일 현재 tv 소음이 리모콘의 최대소음보다 크면 
		if( volume > RemoteControl.MAX_VOLUME ) {
			this.volume = RemoteControl.MAX_VOLUME; // tv소음을 10 고정 
		}else if ( volume < RemoteControl.MIN_VOLUME ) {
			this.volume = RemoteControl.MIN_VOLUME;	
		}else {
			this.volume = volume;
		}
		System.out.println("현재 스마트 tv 볼륨 : " + this.volume);
	}
	
}
