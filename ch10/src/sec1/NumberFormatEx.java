package sec1;

public class NumberFormatEx {
	public static void main(String[] args) {
		String data1 = "90";
		String data2 = "6.28";
		String data3 = "g90";
		
		try {
			System.out.println(Integer.parseInt(data1));
			System.out.println(Double.parseDouble(data2));		//문자열을 숫자로 바꿀때
			System.out.println(Integer.parseInt(data3));
		}catch(NumberFormatException e){
			System.out.println("숫자로 변환되지 않는 데이터");
			e.printStackTrace();
		}catch(Exception e){
			System.out.println("이유를 알 수 없음");			//위의 오류가 아니라 다른오류일 수도 있으므호 작성
		}finally {
			System.out.println("프로그램 종료");
		}
	}
}
