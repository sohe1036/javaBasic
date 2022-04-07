package sec4;

public class Child extends Parent{

	private int studentNo;
	
	public Child(String name, int studentNo) {
		super(name);		//생성자 안쓰면 컴파일에러
		this.name = name;		//name를 부모클래스에서 불러와야해 (생성자로)
		this.studentNo = studentNo;
	}
}
