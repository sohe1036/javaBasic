package sec1;

public class Parent {
	int field1;
	String field2;
	
	Parent(){}
	Parent(int field1){
		this.field1 = field1;
	}
	Parent(int field1, String field2){
		this.field1 = field1;		//this필드 = 매개변수
		this.field2 = field2;
	}
	public void method1() {System.out.println("부모 메서드1입니다.");}
	public void method2() {System.out.println("부모 메서드2입니다.");}
}
