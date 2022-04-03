package sec2;

public class SingletonEx1 {

	public static void main(String[] args) {
		// Singleton s1 = new Singleton(); 		//생성자를 막아놔서 안됨
		// Singleton s2 = new Singleton();
		
		//싱글톤은 한번에 한개의 객체만 만들 수 있다 -> 아무리찍어내도  같은개체
		//또한 static은 정적데이터가 되므로 객체가 달라도 같은 저장소를 공유하고 있어 공유메모리며, 정적필드의 값은 객체가 달라도 같다.
		Singleton obj1 = Singleton.getInstance();	
		Singleton obj2 = Singleton.getInstance();
		obj1.num = 1004;
		if (obj1==obj2) {
			System.out.println("obj1==obj2");
		} else{
			System.out.println("obj1!=obj2");
		}
		System.out.println(obj2.num);
		obj2.num = 2008;
		System.out.println(obj1.num);
	}
}
