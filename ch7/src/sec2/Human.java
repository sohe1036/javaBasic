package sec2;

public class Human {
	public String name;
	public String jumin;
	public int age;
	
	
	Human() {}
	Human(String name) {
		this.name = name;
	}
	Human(String name, String jumin) {
		this.name = name;
		this.jumin = jumin;	
	}
	Human(String name, String jumin, int age) {
		this.name = name;
		this.jumin = jumin;
		this.age = age;
	}
	
	public void method1() {
		System.out.println("메서드 1");
	}
	public final void method2() {
		System.out.println("메서드 2");
	}
	
}
