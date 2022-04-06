package sec2;

public class SupersonicAirplane extends AirPlane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	//부모클래스의 메서드를 변환하여 flyMOde가 노멀이면 일반비행모드를 합니다 출력하고 슈퍼소닉이면 초음속비행을 합니다 출력
	
	@Override
	public void fly() {
	
		if(flyMode==2) {
			System.out.println("초음속비행을 합니다.");
		} else {
			super.fly();
		}
	}
}
