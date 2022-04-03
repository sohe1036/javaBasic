package sec2;

public class Singleton {
//Singleton() 생성자의 접근제어가 private이므로 현재 클래스 내부에서만 접근 가능
//미리 생성자 함수에 의해 객체를 만들 수 있는 구문을 먼제 제시함
	private static Singleton singleton = new Singleton();
	private Singleton() {} 	//생성자
	int num;
	static Singleton getInstance() {
		return singleton;		//기본아니어도 리턴가능
	}
}
