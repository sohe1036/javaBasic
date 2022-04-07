package sec1;

class C{
	static class D {
		int field1;
		static int field2;	//내부메서드에는 static사용 불가하나 class에 static걸어주면 가능
		void method1() {}
		static void method2() { }
	}
}

public class NestingEx2 {
	public static void main(String[] args) {
		C.D d = new C.D();	//개체생성
		d.field1 = 1004;		//필드1에는 statis이 없으므로 선언한 개체이용
		C.D.field2 = 0x2CB;
		d.method1();
		C.D.method2(); //클래스 C안에있는 D클래스의 메소드를 불러오기에 C.D 이고 메서드2가 static이므로 new쓰지않고 클래스자체로 사용
	}
}
