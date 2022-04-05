package sec1;

public class ExtendsEx1 {

	public static void main(String[] args) {
		Parent p1;		//선언만 한 생태 -> 객체생성x
		Parent p2 = new Parent();  //선언과 생성
		
		//p1.method1(); ->생성을 안해서 불가
		p1 = new Parent();
		p1.method1();
		p1.method2();
		
		p2.method1();
		p2.method2();
		
		System.out.println("---------");
		//부모->자식 타입변경
		p1 = new Children();		//생성자 빈거 있어야 적용가능
		p1.method1();
		p1.method2();
		
		System.out.println("---------");
		//자식-> 부모 타입변경
		p1 = new Parent();
		p1.method1();
		p1.method2();
		
		System.out.println("---------");
		//부모-> 자매 타입변경
		p1 = new Sister();
		p1.method1();
		p1.method2();
		
		System.out.println("---------");
		//부모-> 형제 타입변경
		p1 = new Brother();
		p1.method1();
		p1.method2();
		
		
		//그러나 부모메서드에서 선언된것아 아니라 다른 서브클래스의 메소드에서 선언이 되면 형변환 불가
		Children c1;
		// c1 = new Parent();		->불가
		//c1 = new Sister();		->불가
		//c1 = new Brother();		->불가
		//부모클래스로부터 유도된 인스턴스로 선언해야 상속받은 다른 클래스 타입변환 가능
	}

}
