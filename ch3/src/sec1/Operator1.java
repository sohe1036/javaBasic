package sec1;

public class Operator1 {

	public static void main(String[] args) {
		//연산자
		//산술연산자 +, -, *, /, %
		//논리연산자 and(&&), not(!), or(||), &, |, ^
		//비교연산자 >, >=, <, <=, ==, !=
		//대입연산자 =, +=, -=, *=, /=
		//증감연산자 ++, --
		//비트연산자(2진수) &, |, ^, >>, <<, >>>
		//입력  및 비교하는 개(항)수 : 단한, 이항, 삼항
		
		
		//a = true;
		//b = !a;		-단항
		//a=20;
		//b=30;
		//c = a + b		-이항
		//변수 = 비교식 ? 참 : 거짓 		-삼항
		int a = 20;
		int b = 30;
		String pass= a>b ? "a가 더 크다" : "b가 더 크다";		//삼항연산자
		System.out.println("비교 결과 : "+pass);
		boolean c = true;
		System.out.println("c의 반대 : "+(!c));			//단항
		int res = a + b;
		System.out.println("a+b="+(a+b));
		//연산자의 우선순위 : 증감>산술>비교>논리>대입
		
		}

}
