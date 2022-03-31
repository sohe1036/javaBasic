package sec2;

public class ForceCasting1 {
	public static void main(String[] args) {
		//강제캐스팅(수동캐스팅) : 더 큰 데이터를 작은 다입의 변수에 데이터를 저장하는것
		int a = 100;
		//short b = a;	
		short b = (short) a;		//강제캐스팅
		byte c = (byte) a;
		
		int i1 = 65000;
		short s1 = (short) i1;		//short의 표현범위 : -32768~32767 범위 외 
		byte b1 = (byte) i1;
		//만약 담지못하는 데이터를 강제 캐스팅할 경우, 데이터가 왜곡된다.
		
		System.out.println("s1="+s1);		//왜곡
		System.out.println("b1="+b1);		//왜곡
	}

}
