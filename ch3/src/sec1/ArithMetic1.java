package sec1;

public class ArithMetic1 {

	public static void main(String[] args) {
		// 산술연산 + - * / %
		
		int a = 20;
		int b = 7;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));		//정수끼리 연산은 정수가 출력 (정수/실수->실수)
		System.out.println("a&b="+(a%b));		//20/7의 나머지
		System.out.println("임소희는 "+"잘생긴 "+1004+" 입니다.");
		//문자+숫자는 		->문자열
		//숫자+숫자+문자		->더한숫자+문자    ->문자열
	}

}
