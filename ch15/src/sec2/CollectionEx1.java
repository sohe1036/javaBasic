package sec2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Student { String name; }

//List : 순서형 , 중복저장 가능
//Set : 비순서형, 중복저장 불가능
//Map : 비순서형, 키와 값으로 저장됨 , 키는 중복불가 , 값은 중복 가능

public class CollectionEx1 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();	//인터페이스라 하위 생성자로 생성 //List가 부모이므로 다른 하위로변환가능
		ArrayList<String> list2 = new ArrayList<>();	//ArrayList는 List의 자식이므로 다른 형태로 변경불가능
		
		Set<String> set1 = new HashSet<String>();	//하위생성자로 생성 TrssSet로 변환가능 	
		HashSet<String> sec2 = new HashSet<>(); 	//TrssSet로 변환 qnf가능
		
		//Map<Student, Integer> map1 = HashMap<>();	//다른형태로 변환 가능
		//HashMap<Student, Integer> map2 = HashMap<Stufent, Integer>();		//다른형태로 변환 불가능
	}

}
