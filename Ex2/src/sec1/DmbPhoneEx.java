package sec1;

public class DmbPhoneEx {

	public static void main(String[] args) {
		DmbPhone dmb1 =new DmbPhone("모델", "블랙", 6);
		System.out.println(dmb1.model);
		System.out.println(dmb1.color);
		System.out.println(dmb1.channel);
		
		dmb1.powerOn();
		dmb1.bell();
		dmb1.sendVoice("여보세요");
		dmb1.receiveVoice("안녕하셨습니까?");
		dmb1.hangUp();
		dmb1.tureOnDmb();
		dmb1.changeChannelDmb(12);
		dmb1.turnOffDmb();
	}

}
