package sec1;

public class DmbPhone extends CellPhone{
	
	int channel;

	
	DmbPhone() {
		this("모델");
	}
	DmbPhone(String model) {
		this( model ,"검정색");
	}
	DmbPhone(String model, String color) {
		this( model ,color, 6);
	}
	DmbPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	public void tureOnDmb () {
		System.out.println("현재"+channel+"번으로 방송을 시작합니다.");
	}
	public void changeChannelDmb (int ch) {
		System.out.println("채널"+ch+"번으로 변경합니다.");
	}
	public void turnOffDmb() {
		System.out.println("DMB 방송을 종료합니다.");
	}
	}
	

