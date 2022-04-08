package sec1;

import java.util.HashMap;

class Key{
	public int number;
	public String value;
	public Key (int number){
		this.number = number;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number) {
				
			}
		}
		return true;
	}
	//Student.name="임소희"; name:key , "임소희":value -> 키와 값을 따로저장
	@Override
	public int hashCode() {
		return number;
	}
	@Override
	public String toString() {		//출력형태를 꾸미고 싶을 때
		return number+" : "+value;		//이렇게 리턴해서 출력
	}
	
}
public class ObjectEx3 {

	public static void main(String[] args) {
		HashMap<Key,String> hash1 = new HashMap<>();  //import지정  		//키, 갑
		hash1.put(new Key(200), "임소희");

	 String value = hash1.get(new Key(200));
	 System.out.println(value);
	 
	 Key k = new Key(100);
	 k.value = "조수민";
	 System.out.println(k.toString());
	}

}
