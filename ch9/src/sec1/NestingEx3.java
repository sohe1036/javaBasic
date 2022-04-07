package sec1;
//로컬클래스 : 특정 클래스의 메서드 안에 내부 클래스를 정의하고 객체를 만들어 실행할 수 있도록 한 클래스
//내부클래스에서 객체 생성하면 내부클래스에서 다 해결해야한다

class E {
	void method() {			//멤버들은 메서드안에서 구현되면 디폴드만 사용가능
		class F {
			int field1;
			//static int field2
			void method1() {
				System.out.println("내부메서드1");
			}
			F f = new F();
			
		}
	}
}
public class NestingEx3 {

}
