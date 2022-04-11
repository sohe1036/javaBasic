package sec3;

public class StringBuilderEx1 {

	public static void main(String[] args) {
		String lim = "임소희";
		String lee = "이순신";
		System.out.println(lim+","+lee); 	//하나의 데이터가 아님
		//스트링빌더를 통해 하나의 데이터로 만들수있다
		StringBuilder sb = new StringBuilder();		//스트링버퍼는 유틸이나 빌터는 랭스
		sb.append("Java ");		//append-추가
		sb.append("Web ");
		sb.append("Programming");
		System.out.println(sb);
		
		//특정위치에 삽입-insert
		sb.insert(4, "6"); 	//인덱스4번에 문자열 6을추가
		System.out.println(sb);
		//특정 위치에 문자를 변경-setCharAt
		sb.setCharAt(4, '8');	//인덱스4번에 문자를 8로->1글자
		System.out.println(sb);
		//특정번째 문자열 바꾸기 - replace
		sb.replace(10, 21, "Programmer"); 	//끝 인덱스는 포함 안되서 +1 추가해서 작성(20번째까지면 21로작성)
		System.out.println(sb);
		//특정 범위의 글 삭제 - delete
		sb.delete(4, 5);		//이것도 끝 인덱스 포함x
		System.out.println(sb);
		//글자수 length
		System.out.println("글자수 : "+sb.length());
		//StringBuilder을 String로 변환-toString
		String res = sb.toString();
		//String를 StringBuilder객체로 변환
		StringBuilder sb2 = new StringBuilder(res);
	}

}
