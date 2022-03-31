package sec2;

public class ArithMetic2 {

	public static void main(String[] args) {
		// 연산 오류에 대한 예외
		//문법적 오류, 연산 오류, 논리 오류
	
		int a =25, b=0, c;  
		String name = "임소희";
		System.out.println("a/b = "+(a/b));		//문법오류x 연산불가  //불능(무한대 = Infinity)
		//System.out.println("a/c = "+(a/c));	//null 데이더 없음
		System.out.println("a&b = "+(a%b));		//나머지값		//부정(NaN) 
		//System.out.println("a/name = "+(a/name));	//문자로 나누기 안됨, 문자는 더하기만 됨
		
		//문법적 오류는 나오지 않고 예외처리
	}

}
