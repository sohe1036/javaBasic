package sec3;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {

	public static void main(String[] args) {
		int[] intArr = {20,40,35,25};
		String[] strArr = {"김", "이", "박", "최", "정", "김", "이"};
		Object[] objArr = {"김",1,2,"박",5,8,"김",5};			//Object는 문자든 숫자든 사용가능
		
		System.out.println("요소의 수 : " +strArr.length);		//문자열의 경우에는 .length()
		System.out.println("strArr");
		
		for (int i=0; i<strArr.length; i++) {
			System.out.print(strArr[i]+ ",");
		}
		
		Set set1 = new HashSet();
		for(int i=0; i<strArr.length; i++) {
			set1.add(strArr[i]);
		}
		System.out.println("\nset :" +set1);
	}

}
