package sec2;
//Member로 상속받을 수 없다 ->final이기때문
public class Employee extends Human{
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("오버라이딩");
	}
	
	
//부모클래스인 휴먼클래스에서 메서드2는 final로 지정된 메서드라 오버라이딩 할 수 없다.	
	//@Override
	//public void method2() {}	
}
