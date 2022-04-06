package sec3;

public class CarEx2 {

	public static void main(String[] args) {
		Car car1 = new Car();
		for(int i=1; i<110;i++) {
			int errTire = car1.run();
			switch(errTire) {
			case 1:
				System.out.println("앞 왼쪽바퀴 펑크");
				car1.frontLefTire = new KumhoTire("앞 왼쪽");
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
		//instanceof 특정 클래스로부텉 만들어진 인스턴스인지 비교
	}

}
//자식클래스로 만들어진 인스턴트는 부모클래스로 만들어진 인스턴스를 대입 시킬 수 없으므로 강제형변환
//부모 클래스로 만들어진 인스턴스는 자식클래스로 만들어진 인스턴스로 대입 시킬 수 있다->오토캐스팅
