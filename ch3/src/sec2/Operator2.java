package sec2;

public class Operator2 {

	public static void main(String[] args) {
		int a=20;  boolean b=true;		
		System.out.println("a="+a	
				+", b="+b);				//컴파일러가 1줄로 인식
		//int c=20, d=true; 			//컴파일러가 2줄로 인식
		int c=20;
		int d = a+c;		//이항연산
		boolean e = !b;		//단항연산
		String pass = a>=20 ? "한격" : "불합격"; 	//삼항 연산자
		System.out.println(pass);
		//연산자(operator)=연산=명령어(Instruction)
		//op-code		operand
		/* 연산자			피연산자
		 	end							메모리 쓰는게 없어 => 제0주소 명령어 형식
		 	!			  b				=> 단항(unary)	저장장소가 하나	=> 제 1주소 명령어 형식
		 	+			a, c			=> 이항(binary)	저장장소가 두개 => 제 2주소 명령어 형식
		 	=			  d	
		 	?:			조건, 참, 거짓		=> 기타			저장장소가 세개 => 제 3주소 명령어 형식
		 */
	}

}
