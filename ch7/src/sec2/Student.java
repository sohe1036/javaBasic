package sec2;
//super() : 부모생성자 호출
//this() : 현재 클래스의 생성자 호출
//super.필드명 : 부모의 필드
//this.필드명 : 현재 클래스의 필드
//super.메서드명() : 부모의 메서드를 호출
//this.메서드명() : 현재 클래스의 메서드
public class Student extends Human {
	public String no;
	public String part;
	
	
	public Student(String name, String jumin, int age, String no, String part) {
		super(name, jumin, age);	
	/*	super.name=name; ->부모 필드 호출
		super.jumin=jumin;
		super.age=age;	 */	
		this.no = no;
		this.part = part;
	}
	
}
