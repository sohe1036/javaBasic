package sec2;

public class AutoCasting1 {

	public static void main(String[] args) {
		
	//정수를 담을 수 있는 저장소(타입)	
		byte a =40;			//1byte
		short b = 240;		//2byte
		int c = 40;			//4byte
		long d = 40;		//8byte
		long k = 12345678907890L;		//뒤에L을 붙혀서 더 큰 숫자임을 표시(쓰지않으면 기본인 4byte로 인식해서 에러)
		
		short s1 = a;	//a값을 s1에 저장		//자동으로 byte->short 	1byte->2byte 자동형변환
		
		//byte b2 = b;	//2byte값을 1byte저장할 수 없음 	오버플로우
		int i1 = b;
		long l1 = b;
		
		//short s2 = d;			오버플로우
		//int i2 = d;			오버플로우
		long l2 = c;
		
		
		
		
	//실수
		float e = 256.278f;		//4byte
		double f = 256.278;		//8byte
		double g = 486341587.165054542772246897748643D; //이것도 D로 더 큰 표시임을 표시
		
		//float e1 = f;			오버플로우
		double d1 = e;			//자동형변환 (auto casting)
		
		
	
		char c1 = 'g';		//2byte
		byte k1 = 120;		//1byte
		System.out.println("c1="+c1);
		System.out.println("k1="+k1);
		
		//byte k2 = c1;			//2byte를 1byte에 저장할 수 없음
		//char c2 = k1;			//서로 성격이 달라서 캐스팅안됨 숫자를 문자에 담을 수 없음
		int j1 = c1;			//예외로 성격이 다르나 캐스팅 됨 ->아스키코드로 인식
		System.out.println("g의 아스키코드="+j1);
		
		
		//정수 -> 실수 (0)
		//실수 -> 정수 (x)
		
		
		//float avg = (100+70+80) / 3;			->이렇게하면 정수타입이라 소수점 안나옴
		float avg = (100+700+80) / 3.0f;		//뒤에 .0f붙이기
		float avg1 = (float) (100+700+80) / 3;	//형변환연산자를 넣어서 강제 캐스팅
		System.out.println("평균 : "+avg);
		System.out.println("평균 : "+avg1);
		
	}

}
