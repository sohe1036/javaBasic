package sec1;

public class TvRemote implements RemoteControl{
	int voulum;
	
	@Override
	public void turnOn() {
		System.out.println("TV전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV전원을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		this.voulum = voulum;
	}

	@Override
	public int getVolume() {
		return voulum;
	}

	
}
