package sec1;
//class 클래스명 extends 부모클래스명 {}
public class Children extends Parent {
	double field3;				//필드추가됨
	
	Children () {}
	Children(int field1, String field2, double fIeld3){
		this.field1=field1;
		this.field2=field2;
		this.field3=field3;		//상속받아서 사용가능
	}
	
	@Override
	public void method2() {System.out.println("자식 메서드2입니다.");}
	public void method3() { }
	
}
