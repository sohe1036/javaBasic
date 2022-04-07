package sec1;
//인터페이스로부터 다중상속을 받은 SmartTv는 두개의 인터페이스 선언내용이 구현되어야한다
//다중상속 : 여러개의 인터페이스를 하나의 클래스가 상속받는 것
public class SmartTv implements RemoteControl, Searchable{
	private int volume;
	private int channel;
	@Override
	public void search(String url) {
	}
	@Override
	public void turnOn() {
	}
	@Override
	public void turnOff() {
	}
	@Override
	public void setVolume(int volume) {
	}
	@Override
	public int getVolume() {
		return 1004;
	}
	public int getCannel() {
		return channel;
	}
	public void setCannel(int channel) {
		this.channel = channel;
	}
	
	
}
