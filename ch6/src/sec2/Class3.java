package sec2;
//정적 블록
public class Class3 {
	int field1;
	void method1() { }
	static int field2;
	static void method2() { }
	
	static {		//정적 할당된 자원을 묶어서 처리하거나 활용할 일 있음
		//field1 = 100;		(x)
		//method1();		(x)
		field2 = 100;
		method2();
	}
}
