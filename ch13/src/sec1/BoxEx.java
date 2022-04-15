package sec1;
//제네릭 : 숫자든 문자든 타입에 관계없이 저장 및 전달이 가능하도록 한 구조
//클래스 이름<T> { private T t; get; set;}			//T는 관례
class Box<T>{
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t=t;
	}
}
public class BoxEx {

	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		box1.set("제네릭");
		System.out.println(box1.get());
		
		Box<Integer> box2 = new Box<>();		//1.8부터 뒤쪽의 타입 생략가능
		box2.set(6);
		System.out.println(box2.get());
	}

}
