package sec1;
class Animal{
	String name;
}
public class ClassCastEx {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeType(dog);
	}
	public static void changeType(Animal animal) {
		try {
			Dog dog = (Dog) animal;
			Cat cat = (Cat) animal;	//형제끼리 형변환x
		}catch(ClassCastException e){
			System.out.println("형변환을 할 수 없음");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("알 수 없는 이유로 인한 예외사항");
			e.printStackTrace();
		}finally {
			System.out.println("프로그램종료");
		}
	}
}
