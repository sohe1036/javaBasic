package sec1;

public class CellPhone {

	String model;
	String color;
	String messge;
	
	public void powerOn() {
		System.out.println("전원을 켭니다.");
		}
	public void powerOff() {
		System.out.println("전원을 끕니다.");
		}
	public void bell() {
		System.out.println("벨이 울립니다.");
		}
	public void sendVoice(String messge) {}
	public void receiveVoice(String messge) {}
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
		}
	public String getMessge() {
		return messge;
	}
	public void setMessge(String messge) {
		this.messge = messge;
		System.out.println(messge);
	}

	
}
