package sec3;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {
//3가지방법
	public static void main(String[] args) {
		//String 객체.split("구분기호"); 	-StringTokenizer클래스
		String str = "길정훈&김동협,김성민-김예은&김준호";
		String[] arr = str.split("&|,|-"); //분리할 기호 사이에 오와기호
		/* for(int i=0;<arr.length;i++){
		  System.out.println(arr[i]);
		 */
		
		for(String name : arr) {		//name 임의변수
			System.out.println(name);		//자바 1.6이상만가능
		}
		
		System.out.println("-------for문 -countTokens()---------");
		
		//StringTokenizer클래스 : countTokens()-토큰의수 / hasTokens() -남아있는 토큰의 여부
		str = "신길호/여승원/이규진/이규호";
		StringTokenizer s = new StringTokenizer(str,"/");	//import필요
		int l = s.countTokens();		//ㅣ의 갯수만큼 나눠
		for(int i=0;i<l;i++) {
			String t = s.nextToken();
			System.out.println(t);
		}
		System.out.println("-------While문-hasTokens()--------");
		
	}

}
