package sec1;

public class TvRemote implements RemoteControl{
	int volume;
	int channal;
	
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
		this.volume = volume;
	}

	@Override
	public int getVolume() {
		return volume;
	}
	public void setchannal(int channal) {
		this.channal = channal;
	}
	public int getChannal() {
		return channal;
	}
	
}
