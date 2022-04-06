package sec3;

public class Car{

	Tire frontLefTire = new Tire("앞 왼쪽",100);
	Tire frontRightTire = new Tire("앞 오른쪽",100);
	Tire backLetrTire = new Tire("뒤 왼쪽",100);
	Tire backRightTire = new Tire("뒤 오른쪽",100);
	
	public int run() {
		System.out.println("자동차가 달립니다.");
		if(frontLefTire.roll()==false) {
			stop();
			return 1;
		}
		if (frontRightTire.roll()==false){
			stop();
			return 2;
		}
		if (backLetrTire.roll()==false){
			stop();
			return 3;
		}
		if (backRightTire.roll()==false){
			stop();
			return 4;
		}	
		return 0;
	}
	public void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	
}
