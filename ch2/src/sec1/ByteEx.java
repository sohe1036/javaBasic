package sec1;

public class ByteEx {

	public static void main(String[] args) {
		// byte 타입의 변수 활용
		byte b1 = -128;
		//byte b2 = 128;		//표현범위에 속하지 않음 (-128~127)
		byte b3 = 0;
		//byte b4 = 0b10010110;		//2진수 ->150이므로 표현범위 벗어남 
		//byte b5 = 0300;			//8진수 ->표현범위벗어남
		//byte b6 = 0x3f4;			//16진수 ->표현범위벗어남
		byte b7 = 0b101101;
		byte b8 = 0132;
		byte b9 = 0x3e;
		System.out.println("b1="+b1);
		System.out.println("b3="+b3);
		System.out.println("b7="+b7);
		System.out.println("b8="+b8);
		System.out.println("b9="+b9);
	}

}
