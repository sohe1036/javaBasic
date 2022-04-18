package sec3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Map <Key, value>
public class MapEx1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();		//키에 의해 값에 접근가능
		map.put("a", 100);
		map.put("b", 50);
		map.put("c", 80);
		map.put("d", 70);
		map.put("e", 90);
		
		System.out.println("저장된 데이터 건수 : " +map.size());
		System.out.println("b의 점수 : "+map.get("b"));
		System.out.println("c의 점수 : "+map.get("c"));
		map.remove("a");
		//--------------------key와 value 의 분리 -->Iterator-------------
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();		//키
			Integer value = map.get(key);		//키값을 통해 값 가져옴
			System.out.println("key : "+key+", value : "+value );
		}
	}

}
