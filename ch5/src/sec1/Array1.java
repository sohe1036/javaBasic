package sec1;

public class Array1 {

	public static void main(String[] args) {
		//배열 :같은 타입을 가진 여러 개의 연속한 기억장소 배열은 초기화를 하지않아도 0으로 셋팅됨
		int jum1=100, jum2=80, jum3=50, jum4=60;
		
		int[]jum = {100,80,50,60};
		//int절의 배열		100=Arrjum[0] ...60=Arrjum[3]
		
		int tot=0;
		for (int i=0; i<=jum.length;i++) {
			System.out.println(i+ "의 정수 = " +jum[i]);
		}

	}

}
