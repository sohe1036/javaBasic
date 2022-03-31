package sec1;

public class IntEx {

	public static void main(String[] args) {
		// int 타입의 변수 활용
		//integer(정수) : 소수점 이하가 없는 수
		//단정도(short)-2byte, 일반(int)-4byte, 배정도(long)-8byte
		
		int i1 = 1024;
//		short i2 = 102400; 		//오버플로우
		short a1 = 5120;
		int a2 = a1 * 2;		//short로 a1을 선언하면 오버플로우
		System.out.println("i1="+i1);
		System.out.println("a1="+a1);
		System.out.println("a2="+a2);
		
		long b1 = 65530;
		//int b2 = b1 * 10;		//long타입이 훨씬 크므로 더 작은 int 타입의 변수에 저장하지 못함
		

	}

}
