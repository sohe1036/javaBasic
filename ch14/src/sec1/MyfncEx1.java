package sec1;
//람다식은 인터페이스라 선언만했고 구현클래스가 필요 ->선언하고 값을 적용
public class MyfncEx1 {

	public static void main(String[] args) {
		MyFnc1 f1;
		f1 = () -> {				//매개변수x 리턴x
			System.out.println("MyFnc1실행");
		};
		f1.method1();
		
		MyFnc2 f2;			//선언
		f2 = (x) -> {					//값() {};
			System.out.println(x*x);
		};
		f2.method2(6);
		
		MyFnc3 f3;
		f3 = () -> {
			return 1004;
		};
		System.out.println(f3.method3());
		
		MyFnc4 f4;
		f4 = (x) -> {
			return x;
		};
		System.out.println(f4.method4(5));
	}

}
