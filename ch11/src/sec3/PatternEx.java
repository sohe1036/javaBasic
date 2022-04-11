package sec3;

import java.util.regex.Pattern;

public class PatternEx {

	public static void main(String[] args) {
		// 정규표현식(Regular Expression)=패턴
		//입력된 데이터가 원하는 형식이 맞는지 검증하는 식
		
		String regExp = "(02|031|010)-\\d{3,4}-\\d{4}";
		String[] data1= {"010-1234-5678","02-458-1234","031-525-336"};
		
		for(String tell : data1) {		//data1을 tell에 넣어
			boolean res = Pattern.matches(regExp, tell);	//tell의 데이터패턴이 resExp와 일치하는가
			if(res) {
				System.out.println("올바른 전화번호 형식입니다.");
			}else {
				System.out.println("전화번호 형식이 올바르지않습니다.");
			}
		}
		System.out.println("----------------");
		String regExp2 = "\\w+@\\w+(\\.\\w+)?";
		String[] emails = {"asdf@naver.com","15442.gmail.com","a1b2@naver.com.com"};
		for(String email : emails) {		//emails데이터를 email에 저장->String으로
			boolean res = Pattern.matches(regExp2, email);	//위의res랑 다른것 
			if(res) {
				System.out.println("올바른 이메일 형식입니다.");
			}else {
				System.out.println("이메일형식이 올바르지 않습니다.");
			}
		}
		System.out.println("----------------");
		String regExp3 =  "\\w{2,8}";
		String[] ids = {"dpje36","asdcgds","a12","1234511167"};
		for (String id : ids) {
			boolean res = Pattern.matches(regExp3, id);
			if(res) {
				System.out.println("올바른 id 형식입니다.");
			}else {
				System.out.println("id형식이 올바르지 않습니다.");
			}
		}
	}

}
