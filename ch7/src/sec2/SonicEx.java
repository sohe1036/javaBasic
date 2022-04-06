package sec2;

public class SonicEx {

	public static void main(String[] args) {
	SupersonicAirplane plane = new SupersonicAirplane();
	plane.takeOff();
	plane.fly();
	plane.flyMode = SupersonicAirplane.SUPERSONIC;		//상수는 바로 선언 static이니까 생성자명. (new로 가져오는거 x)
	plane.fly();
	plane.flyMode = SupersonicAirplane.NORMAL;
	plane.fly();
	plane.landing();
	}

}
