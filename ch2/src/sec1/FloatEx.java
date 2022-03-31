package sec1;

public class FloatEx {

	public static void main(String[] args) {
		 int kor = 100;
		 int eng = 70;
		 int mat = 90;
		 int tot = kor + eng + mat;
		 //int avg = tot / 3;			//평균은 소수점 이하가 나올 수 있으므로 int는 안됨
		 float avg = tot / 3.1f;		//정수와 정수 연산결과는 정수가 나오므로 소수점 표기, 실수는 뒤에 f적어줘야함			
		 double pi1 = 3.1415;
		 float pi2 = 3.1415f;			//double은 f생략가능 그러나 float는 f생략불가
		 
		 int radius = 20;
		// float area = radius * radius * pi1; 	//float=4byte인데 pi1은 double타입이라 오버플로우
		 float area = radius * radius * pi2;
		 float data1 = 3e6f;			//3* 10의6승 = 3000000		3:가수  10의6승:지수
		 float data2 = 3e-6f;			//3* 10의-6승 = 0.0000003	
		 System.out.println("총점 = "+tot);
		 System.out.println("편균 = "+avg);
		 System.out.println("반지름이 20인 원의 면적 = "+area);
		 /* 표현범위가 작은타입은 데이터 저장하거나 처리x 
		    표현범위가 크면 용량 많이 차지 -> 느려짐	따라서 적절히 사용		*/
	}

}
