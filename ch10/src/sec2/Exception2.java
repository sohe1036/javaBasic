package sec2;

public class Exception2 {
	//방법 1 예외 떠넘기기
	//메소드2가 실행되다가 실제 실행되는 내용인 메소드1이 실행되고 만약 예외처리가나오면 다시 메소드1로 돌아와 =>메소드 떠넘기기
	public static void method1() throws ClassNotFoundException {
		Class cla1 = Class.forName("java.lang.String2");
	} //만약 ClassNotFoundException 나오면 떠넘겨
	public static void method2() {
		try {
			method1();
		}catch(ClassNotFoundException e) {
			System.out.println("해당 클래스가 존재하지 않음");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("알 수 없는 오류");
			e.printStackTrace();
		}finally {
			System.out.println("프로그램종료");
		}

	}

}
