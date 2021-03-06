package sec2;

public class NullEx1 {

	public static void main(String[] args) {
		//int a null; ->기본형은 null값을 가질 수 없다
		String b = null; //String는 기본형이 아니다
		int c = 20;	//기본형은 ==나 !=비교가능
		int d = 20;
		
	System.out.println("c == d:" +(c == d));
	System.out.println("c != d:" +(c != d));
	
	
	int[] e = {10,20,30};//참조형은 ==나 !=비교불가 ->참조형은 값비교가아니라 주소비교 ->'전체'적인e의주소와 f의주소를 비교(더 큰범위임)
	int[] f = {10,20,30};
	System.out.println("e == f:"+(e == f));
	System.out.println("e != f:"+(e != f));
	
	System.out.println(e.equals(f)); //참조형은 이렇게 비교한다 ->'각각'비교하는것 e의10에대한저장소위치와 e의 10에대한저장소위치 비교
	
	String g = "임소희";
	String h = "임소희";
	System.out.println("g == h:"+(g == h));		//스트링은 값비교가 된다 
	System.out.println("g != h:"+(g != h));
	
	String i = new String ("임소희");
	String j = new String ("임소희");
	System.out.println("i == j:"+(i == j));		//new String 사용하면 참조형처럼 주소를 비교
	System.out.println("i != j:"+(i != j));
	
	System.out.println("i == j :" +i.equals(j)); //new String 비교는 참조형이므로 equals로 비교

	}

}
