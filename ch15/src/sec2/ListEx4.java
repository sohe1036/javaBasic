package sec2;

import java.util.ArrayList;
import java.util.List;

class Member{
	private String uid;
	private String pw;
	private String email;
	private String tel;
	
	public Member () {
	}
	
	public Member(String uid, String pw, String email, String tel) {
		super();
		this.uid = uid;
		this.pw = pw;
		this.email = email;
		this.tel = tel;
	}
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}
public class ListEx4 {

	public static void main(String[] args) {
		List<Member> list1 = new ArrayList<Member>();
		Member member1 = new Member();
		member1.setUid("id1");
		member1.setPw("1234");
		member1.setTel("010-1111-1111");
		member1.setEmail("a@naver.com");
		list1.add(member1);
		
		Member member2 = new Member();
		member2.setUid("id2");
		member2.setPw("2345");
		member2.setTel("010-2222-2222");
		member2.setEmail("b@naver.com");
		list1.add(member2);
		
		Member member3 = new Member();
		member3.setUid("id3");
		member3.setPw("3456");
		member3.setTel("010-3333-3333");
		member3.setEmail("c@naver.com");
		list1.add(member3);
		
		Member member4 = new Member("id4", "4567",  "d@naver.com","010-4444-4444");
		list1.add(member4);
		
		Member member5 = new Member("id5", "5678", "e@naver.comm", "010-5555-5555");
		list1.add(member5);
		
		System.out.println("아이디\t비밀번호\t전화번호\t\t이메일");
		
		for(Member m : list1 ) {
			System.out.print(m.getUid()+"\t");
			System.out.print(m.getPw()+"\t");
			System.out.print(m.getTel()+"\t");
			System.out.print(m.getEmail()+"\n");
		}
		
	}

}
