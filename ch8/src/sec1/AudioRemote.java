package sec1;

public class AudioRemote implements RemoteControl{
	int volume;		//private으로 자동으로 
	
	@Override
	public void turnOn() {
		System.out.println("오디오 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오 전원을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public int getVolume() {
		return volume;
	}

	
}