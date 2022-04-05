package sec1;

public class DmbPhoneEx {

	public static void main(String[] args) {
		DmbPhone dmb1 =new DmbPhone();
		System.out.println(dmb1.model);
		System.out.println(dmb1.color);
		System.out.println(dmb1.channel);
		
		dmb1.powerOn();
		dmb1.bell();
		dmb1.setMessge("여보세요");
		dmb1.getMessge();
		System.out.println(dmb1.getMessge());
		dmb1.hangUp();
		dmb1.tureOnDmb();
		dmb1.changeChannelDmb(12);
		dmb1.turnOffDmb();
	}

}
