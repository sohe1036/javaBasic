package sec1;

public class Brother extends Parent {
double field3;				//필드추가됨
	
	Brother () {}
	Brother(int field1, String field2, double fIeld3){
		this.field1=field1;
		this.field2=field2;
		this.field3=field3;		//상속받아서 사용가능
	}
	@Override
	public void method2() {System.out.println("형제 메서드2입니다.");}
	public void method3() { }
}
