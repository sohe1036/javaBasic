package sec2;

public class Member extends Human {
	String id;
	String pw;
	public void join() {
		System.out.println("회원가입");
	}
	public void login() {
		System.out.println("로그인");
	}
	public void modify() {
		System.out.println("회원 정보 수정");
	}
}
