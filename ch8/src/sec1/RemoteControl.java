package sec1;

public interface RemoteControl {
	//인터페이스 안의 구성멤버에서 메서드는 abstract되어 선언되어야 한다.
	//필드는 final static이 되어 상수화함
	public int MAX_VOLUME = 100;
	public int MIN_VOLUME = 0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	public int getVolume();
}
