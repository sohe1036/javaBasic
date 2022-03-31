package sec1;
//클래스 : 설게도 , 객체를 만들기 위한 틀
//클래스의 구성 : 멤버(변수)필드, 생성자, 멤버메서드
public class Sample1 {

	int field1;
	private float field2;
	double field3;
	short field4;
	boolean field5;
	String field6;		//멤버필드 : 해당 객체에 대한 특성을 저장하고 있는 객체에 딸린 변수
	
	Sample1() { }			//기본생성자
	Sample1(int field1) {
		this.field1 = field1;
	}
	Sample1(int field1, float field2){
		this.field1 = field1;
		this.field2 = field2;			//생성자 : 선언하지 않으면 기본생성자가 있다고 간주
	}
	//오버로딩 : 같은 이름으로 매개변수의 개수나 타입을 달리하여 함수를 저으이하는 것
	
	public void method1() {
		System.out.println("메서드");
	}
	public int method2() {
		return this.field1;
	}
	public int getField1() {
		return field1;
	}
	public void setField1(int field1) {
		this.field1 = field1;
	}
	public float getField2() {
		return field2;
	}
	public void setField2(float field2) {
		this.field2 = field2;
	}
	public double getField3() {
		return field3;
	}
	public void setField3(double field3) {
		this.field3 = field3;
	}
	public short getField4() {
		return field4;
	}
	public void setField4(short field4) {
		this.field4 = field4;
	}
	public boolean isField5() {
		return field5;
	}
	public void setField5(boolean field5) {
		this.field5 = field5;
	}
	public String getField6() {
		return field6;
	}
	public void setField6(String field6) {
		this.field6 = field6;
	}
	
	
}
