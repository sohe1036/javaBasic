package sec2;

public class ClassEx2 {

	public static void main(String[] args) {
	
		Class2 obj1 = new Class2();		//객체는 동적 할당
		//Class2.cnt = 1004;  ->(x)
		obj1.cnt = 1004;	//(0)
		//Class.method1();   ->(x)
		obj1.method1();
		
		Class2.method2();  //(0)
				
				
	}

}
