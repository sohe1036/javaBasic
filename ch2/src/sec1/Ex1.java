package sec1;

//변수 : 주기억장치 안에 데이터를 넣는 공간 하나로 개발자가 이름을 부여하여 필요시 데이터를 가저갈 수 있도록
//하기 위한 기억장소의 이름 ->변할 수 있는 값
//상수 : 주기억장치 안에 데이터를 넣는 공간 하나로 개발자가 이름을 부여하여 필요시 데이터를 가저갈 수 있도록
//하기 위한 기억장소의 이름 ->변하지 않는 값

public class Ex1 {		//Ex1은 클래스 이름
	public static void main(String[] args) {
		//변수선언시에는 순서를 자료형/변수명;
		
		String name;		//String 문자열   name 변수이름  ->변수선언
			name = "임소희";		//변수의 초기화		:변수명 = 리터럴(변수에 저장되는 값)
			//name이란 기억장소에 임소희라는 데이터를 저장해라
		
		//기본 자료형  (primitive)
		char pass = 'y';			//char 한글자 문자 ->그래서 '작은따음표'  pass 변수이름	2bytr
		byte data1;			//1바이트만 저장		1byte=8bit ->2의8승=256가지  -128~-1,0,1~127 (-128~127) 
		boolean data2;		//yes나 no만 저장		표현용량 1bit 저장용량 1byte
		int su1 = 1;		//정수만 저장			4byte=32bitt
		long su2; 			//넓은범위 정수 저장 -> 숫자는 따옴표 x		8byte=64bit
		float su3 = 3.6245f;			//실수(부동소수점수)만 저장	4byte	10진법으로쓸땐 뒤에f 붙혀서 두종소수점수인걸 알려줘야함
		double su4 = 3.6245;			//넓은범위 실수 저장		8byte	더블은 f 생략가능
		short su5;						//2byte
		
		
		//예약어(점유어) : 자바에서 정해놓은 키워드는 변수이름이나 클래스이름으로 쓸 수 없음
		
		
	//그러므로 변수명이란? 하나의 값을 저장할 수 있는 메모리 공간의 이름이다.
		
	/*변수명의 명명 규칙	
		 * 첫 글자는 영문으로 시작하는 것이 원칙이나, 특수문자 중에서 $(달러) 또는 _(언더스코어)로 시작할 수 있다.
		 * 영문 대소문자는 엄격히 구분되며, 변수명은 관례상 소문자로 쓰며, 클래스 이름은 대문자로 시작한다.
		 * 자바의 예약어는 사용할 수 없으니 다른 문자나 숫자를 혼용하여 사용은 가능 ex) int1
		 * 변수명이나 클래스명은 관례상 그 용도를 쉽게 알 수 있게 사용해야한다.
		 * 변수명이나 클래스명, 메서드명 등은 여러 단어를 연결하여 선언 할 경우는 언더스코어방식 또는 카멜방식을 활용한다.
		 	->여러 단어을 이어서 선언할 경우 읽거나 판독이 어려움 
		 			 limsoheegohome   (x)
		 			 limsoheeGoHome   (o) : 카멜방식
		 			 limsohee_go_home (o) : 언더스코어		*/
		
	/*예약어(점유어) : 자바에서 정해놓은 키워드는 변수이름이나 클래스이름으로 쓸 수 없음
		선언자(private, public, protected, static, final) 
		기본 자료형 선언 키워드(char, byte, boolean, short, int, long, float, double)
		참조형 선언 키워드(Char, Byte, Boolean Long, Float, Double)
		클래스 관련 키워드(class, abstract, interface, extends, implements, enum)
		객체 관련 키워드(new, this, super, instanceof, null)
		명영문 키워드 (if, else,switch, case, for, while, break, continue)
		기타 키워드 (true, false, return, try, catch, finally, throw, throws)	 */
		
		//리터럴 : 변수에 저장되는 값, 문자, 문자열, 정수(단,일,배), 실수(단,배), 2진수, 8진수, 16진수
		
		
		int k1 = 0b1101;
		System.out.println("k1="+k1);
		
		int k2 = 0123;
		System.out.println("k1="+k1+"k2="+k2);
			
				
	}

}		
