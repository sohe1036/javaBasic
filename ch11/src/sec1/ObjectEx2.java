package sec1;
class Member{	//모든 클래스의 조상은 Object이므로 extends를 하지 않아도 Object클래스로부터 상속됨 
	public String id;			//필드
	Member(String id){			//생성자(매개변수 id)
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {		
		if(obj instanceof Member) {		//obj가 Member로부터 만들어졌는지부터 확인 ->obj가 멤버로부터 인스턴스되었나
		Member mem = (Member) obj;
		if(id.equals(mem.id)) {
			return true;
		}
		}
		return false;
	}
	
}
public class ObjectEx2 {

	public static void main(String[] args) {
		Member obj1 =new Member("kkt");		//객체 생성 Member생성자로부터 객체를 생성하고 그 주소를 obj1에저장
		Member obj2 =new Member("yeeun");
		Member obj3 =new Member("kkt");
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 같다.");
		}else {
			System.out.println("obj1과 obj2는 다르다.");
		}
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 같다.");
		}else {
			System.out.println("obj1과 obj3는 다르다.");
		}
	}

}
