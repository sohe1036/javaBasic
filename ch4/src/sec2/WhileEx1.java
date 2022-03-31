package sec2;

public class WhileEx1 {

	public static void main(String[] args) {
		//카운트변수(증가되고 감소되는값)의 초기값;
		//while(조건식) {반복수행문; 증감식;}		

		
		
		//1~100 4의배수의 합산결과를 출력
		int x, sum;
		x=0; sum=0;
		while(x<100) {			//x<=100 이면  아래 증감식에서 104까지 합이됨
			x+=4;			//0		4		8		12			//0부터 시작해야 x+=4;가 4의배수가됨
			sum+=x;			//0		4		12		
		} System.out.println("1~100 4의배수의 합산결과 : "+sum);
		
		int y = 0;
		int sum1 = 0;
		while(y<=100) {		
			sum1+=y;		
			y+=4;
		} System.out.println("1~100 4의배수의 합산결과 : "+sum);
	}

}
