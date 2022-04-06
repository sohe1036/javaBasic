package sec3;

public class CarEx1 {

	public static void main(String[] args) {
		Car car1 = new Car();
		for(int i=1; i<110;i++) {
			int errTire = car1.run();
			switch(errTire) {
			case 1:
				System.out.println("앞 왼쪽바퀴 펑크");
				break;
			case 2:
				System.out.println("앞 오른쪽 바퀴 펑크");
				break;
			case 3:
				System.out.println("뒤 왼쪽 바퀴 펑크");
				break;
			case 4:
				System.out.println("뒤 오른쪽 바퀴 펑크");
				break;
			}
			System.out.println("-----------------------------");
		}

	}

}
