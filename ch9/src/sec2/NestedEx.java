package sec2;
//중첩클래시에서 내부 클래스의 매서드가 외부 멤버의 접근 제한
class A{
	int item1;
	void func1() {System.out.println("기능1"); }
	static int item2;
	static void func2() {System.out.println("기능2");}
	class B {
		void method() {
			item1 = 1004;
			func1();
			item2 = 2008;
			func2();
		}
	}
	static class S {		//S클래스는 스태틱이므로 필드접근시 내부 메서드에서 static멤버만 접근가능
		void method() {
			//item1 = 100;
			item2 = 200;
			//func1();
			func2();
		}
	}
}
public class NestedEx {
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();	//a인스턴스 안의 새로운 B
		A.S s = new A.S();	//static이니까
	}

}
