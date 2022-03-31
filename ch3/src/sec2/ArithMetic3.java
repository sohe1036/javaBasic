package sec2;

public class ArithMetic3 {

	public static void main(String[] args) {
		//NaN의 검사
		String indata = "NaN";			//""떼어내도 연산불가능  NaN은 숫자가 될수 없는 넘버
		String data1 = "500.4";			//""떼내면 연산가능->숫자형문자  문자->숫자
		double val1 = Double.valueOf(indata);		//더블형태의 실수로 바꿔서 val1에저장(아직 안배움)
		double data2 = 500.4;
		data2 += val1;		//data2 = 500.4+NaN
		System.out.println("출력 결과 : "+data2);		//"NaN"을 NaN으로 바꿔도 숫자로 인식x
		
		data2 = 500.4;
		double val2 = Double.valueOf(data2);		//" 500.4"(문자)을 숫자 500.4로 바꿈 
		data2 += val2;
		System.out.println("출력 결과 : "+data2);		//"500.4"를 500.4로 바꾸면 숫자로 인식o
		
	}

}
