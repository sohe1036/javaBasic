package sec1;

public class Logical1 {

	public static void main(String[] args) {
		// 논리연산 && || ! & | ^
		int a = 30;			//2진수->11110
		int b = 20;			//10100
		int c = 10;
		
		System.out.println("a와 b의 AND 연산 : "+(a & b));
		System.out.println("a와 b의 OR 연산 : "+(a | b));
		System.out.println("a와 b의 XOR 연산 : "+(a ^ b));
		System.out.println(" ~a -> a의 보수 : "+(~a));
		boolean d = true;
		boolean e = true;
		boolean f = false;
		//$$는 입력값이 모두 참일때만 결과가 참
		System.out.println("$$ => AND연산의 결과1 : "+(d && e));
		System.out.println("$$ => AND연산의 결과2 : "+(d && f));
		System.out.println("$$ => AND연산의 결과3 : "+(f && d));
		System.out.println("$$ => AND연산의 결과4 : "+(f && f));
		
		//||는 하나라도 입력이 참이면 결과가 참
		System.out.println("|| => AND연산의 결과1 : "+(d || e));
		System.out.println("|| => AND연산의 결과2 : "+(d || f));
		System.out.println("|| => AND연산의 결과3 : "+(f || d));
		System.out.println("|| => AND연산의 결과4 : "+(f || f));

		//! 입력 된 논리값을 true는 false로 false는 true로 	반대로변환
		System.out.println(d+"! => NOT의 결과1 : "+(!d));
		System.out.println(f+"! => NOT의 결과2 : "+(!f));
	}

}
