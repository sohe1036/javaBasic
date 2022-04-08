package sec1;

class Car{
	public int num;
	public int speed;
	public String name;
	
	Car(int num) {this.num = num; };
}
class Employee implements Cloneable{
	public int no;
	public String name;
	public Car car;		//클래스도 참조형이니까 데이터타입으로 선언
	
	public Employee(int no, String name, Car car) {		//생성자
		this.no = no;
		this.name = name;
		this.car = car;

		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {	//복제할 내용 기술
		Employee cloned = (Employee) super.clone();		//얕은 복제(no,name만 족제됨 Car은 객체라 그안에 또 내용이 있어서 x) //임의의 객체를 만들고 오브젝트의 클론을 불러와
		//cloned.car = new Car(this.car.name);		//깊은 복제(아까 객체 Car는 내부내용(필드)까지 복제해야하므로)
		return cloned;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(no+"인 사원의 객체를 제거합니다.");
		super.finalize();
	}
	
	
}
public class CloneEx1 {

	public static void main(String[] args) {
		Car car = new Car(1234);
		Employee emp1 = new Employee(1,"임소희",car);
		System.out.println(emp1.toString());
		emp1 = null;		//날릴 값을 써주고
		System.gc();		//finalize()를 오버라이딩해서 메세지를 띄워
	}

}
