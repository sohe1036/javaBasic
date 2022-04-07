package sec1;

public class Array2 {

	public static void main(String[] args) {
		// 초기값 지정하지 않으면 정수 =0, 실수는 0.0, 문자열은 null -> 배열은 참조형
		
		int[] arr1 = {10,40,20,15,30};
		int[] arr2;
		//arr2 = {10,20,30,40,50};	->선언 하고난 뒤 값 지정할 수 없다 ->new이용해서 값을 넣어줘야함
		arr2 = new int[] {10,20,30,40,50}; //값을 나중에 지정할시 꼭 new 연산자 이용
		
		String[] names;
		names = new String[] {"김동협", "김성민", "김예은", "김준호", "김찬미"};
	for(int i =0; i<names.length; i++) {		//length는 names의 수량
		System.out.println(names[i]);
	}
	float [] arr3 = {3.14f, 2.84f, 6.24f, 5.18f};
	int[] arr4 = new int[5];	//값을 지정하지 않았기때문에 arr4[0]~arr[4]는 0으로 초기화
	double [] arr5 = new double[5];
	
	for (int i=0; i<arr4.length;i++) {
		System.out.println(arr4[i]);
	}
	for (int i=0; i<arr5.length; i++) {
		System.out.println(arr5[i]);
	}
	}

}
