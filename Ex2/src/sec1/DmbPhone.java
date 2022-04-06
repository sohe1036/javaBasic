package sec1;

public class DmbPhone extends CellPhone{
	
	int channel;

	
	
	DmbPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	public void tureOnDmb () {
		System.out.println("현재"+this.channel+"번으로 방송을 시작합니다.");
	}
	public void changeChannelDmb (int ch) {
		System.out.println("채널"+ch+"번으로 변경합니다.");
	}
	public void turnOffDmb() {
		System.out.println("DMB 방송을 종료합니다.");
	}
	}
	

