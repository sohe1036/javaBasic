package sec5;

public class Anonymous {
	Vehicle field = new Vehicle() {
	
	@Override		//해도되고안해도되고
	public void run() {
		System.out.println("자전거가 달립니다");
		}
	};
	void method1() {
		Vehicle localVer = new Vehicle() {
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
				}
		};
		localVer.run();
	}
	void method2(Vehicle v) {
		v.run();
	}
}
