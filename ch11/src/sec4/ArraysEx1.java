package sec4;

import java.util.Arrays;

public class ArraysEx1 {

	public static void main(String[] args) {
		char[] arr1 = {'J','A','V','A'};
		char[] arr2 = arr1;
			System.out.println("얕은복제");	//주소만복제한것 나중에 하나의데이터값 변경되면 다른하나도 변경됨
			System.out.println(arr1);
			System.out.println(arr2);
			System.out.println("----------------");
			
			System.out.println("깊은복제");	//값을 복제해서 다른 장소에 저장
		char[] arr3 = Arrays.copyOf(arr1, arr1.length);
			System.out.println(arr3);
		char[] arr4 = Arrays.copyOfRange(arr1, 0, 2);
			System.out.println(arr4);
			System.out.println("----------------");
		System.out.println(Arrays.equals(arr1, arr2));	
		System.out.println(Arrays.equals(arr1, arr4));		//2차원배열은 deepEquals
		System.out.println("arr1의 주소 : "+Arrays.hashCode(arr1));
		System.out.println("arr2의 주소 : "+Arrays.hashCode(arr2));	
		System.out.println("arr4의 주소 : "+Arrays.hashCode(arr4));
		
		String[] arr5 = {"하정우","배성우","김선우","고정우","배동우"};
		Arrays.sort(arr5);
		System.out.println("정렬 후");		//기본 오름차순
		for(String name : arr5) {
			System.out.println(name);
		}
		System.out.println("정보 검색 : 몇번째 있는지?");
		String data = "배동우";
		int idx = Arrays.binarySearch(arr5, data);
		System.out.println("배동우의 인덱스 : " +idx);
	}

}
