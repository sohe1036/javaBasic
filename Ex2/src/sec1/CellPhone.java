package sec1;

public class CellPhone {

	String model;
	String color;
	
	
	public void powerOn() {
		System.out.println("전원을 켭니다.");
		}
	public void powerOff() {
		System.out.println("전원을 끕니다.");
		}
	public void bell() {
		System.out.println("벨이 울립니다.");
		}
	public void sendVoice(String messge) {
		System.out.println("메시지를 전송했습니다. :"+messge);
	}
	public void receiveVoice(String messge) {
		System.out.println("메시지가 도착했습니다. :"+messge);
	}
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
		}


	
}
