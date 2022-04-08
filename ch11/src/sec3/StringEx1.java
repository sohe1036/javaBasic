package sec3;

public class StringEx1 {
	public static void main(String[] arg) {
		byte[] bytes = {74, 101, 107, 111, 34, 66};		//배열을 문자열로 바꾸고싶을때
		char[] chars = {'A', 'B', 'C'};
		//String 생성자는 문자배열이나 바이트배열을 문자로 변환함
		String str1 = new String(bytes);		//bytes의 숫자를 문자열로 바꿔서 str1에 저장할것
		System.out.println("str1="+str1);
		String str2 = new String(chars);
		System.out.println("str2="+str2);
		String str3 = new String(bytes,2,3);//String(문자배열,시작인덱스,갯수)//2-시작인덱스(인덱스가 0부터) //3-갯수(시작인덱스부터 몇개까지)
		System.out.println("str3="+str3);	//str1에서 2번째인덱스부터 3개까지만 출력
		
		
		String data = "가나다 라 마";
		System.out.println(data.charAt(2));
		System.out.println("문자 배열의 주소 : "+data.getBytes()); 		//주소출력
		System.out.println("다의 위치(index) : "+data.indexOf("다"));	//특정 문자의 위치를 반환
		System.out.println("data의 글자수 : "+data.length()); 		//특정 문자열의 글자수반환 ->length는 배열에서쓰고 문자열은 length()
		String a= data.replace("나다", "사아");
		System.out.println(a);
		String jumin = "123456-3412118";
		System.out.println("출생연도 : "+jumin.substring(0,2)); //begin이상~ end미만 (end를 1을하면 1미만이라 1이포함안됨)
		System.out.print("성별 : ");
		int ma = Integer.parseInt(jumin.substring(7, 8)); //7번 이상~8번미만  //int로 값 변경 Integer.parseInt
			switch(ma) {
			case 1:
			case 3:
				System.out.print("남\n");
				break;
			case 2:
			case 4:
				System.out.print("여\n");
				break;
			default :
				System.out.println("잘못된성별입니다\n");
			}
			
		System.out.println("주민번호 뒷자리 : "+jumin.substring(7));		//7이상부터 끝까지
		
		String learn = "   Java Web Programming   ";
		System.out.println("소문자로 : "+learn.toLowerCase());
		System.out.println("대문자로 : "+learn.toUpperCase());
		System.out.println("글자수 : "+learn.length());
		String kim = learn.trim();
		System.out.println("공백을 제거한 글자수 : "+kim.length());
		System.out.println("공백을 제거한 텍스트 : " +kim);
		
		int b = 1004;
		float c = 32.128f;
		
		String d = String.valueOf(b);	//b의 정수 숫자 1004를 문자열"1004"로변경 ->static이라 클래스사용(클래스:String)
		int e =Integer.parseInt(d);		//"1004"문자열을 숫자정수 1004로변경
		
		String f =String.valueOf(c);	//c의 실수숫자를 문자열로
		float g = Float.parseFloat(f);	//"32.128"문자열을 float로 형변환
				
		
		String name1 = "가나다";
		String name2 = "라마바";
		if(name1.equals(name2)) {
			System.out.println("문자열이같음");
		}else {
			System.out.println("문자열이다름");
		}
	}

}
