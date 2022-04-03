package sec3;

public class MemberServiceEx {

	public static void main(String[] args) {
		
		MemberService memberService = new MemberService();		//객체생성
		boolean result = memberService.login("hong", "12345");
		if(result) {
			System.out.println("로그인되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		

	}

}
