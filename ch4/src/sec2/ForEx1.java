package sec2;

public class ForEx1 {

	public static void main(String[] args) {
		// for(초기값;조건식;증감식) {반복실행 할 문장;}
			for(int i=1;i<=10;i++) {System.out.println(i+"번째-----------");}
		/*        (1)	(2)	  (3)			(4)
		  (1)초기값 ->처음 한번만 실행
		  (2)실행 -> (4)실행
		  (3)증감 실행 -> (2) 실행 -> (4)실행
		  (3)증감 실행 -> (2) 실행 -> (4)실행
		  ........
		  (3)증감 실행 -> (2)실행x(조건안맞음) ->(4)실행x
		  조건식이 만족할 때까지 반복하는것
		 */	
			for(int i=0;i<=10;i++) {			//for안의 i라 위의 i 랑 다른것
				if (i%2 == 0) {
					continue;					//건너뛰기
				}
				System.out.println("i="+i);
			}
			//or
			System.out.println("");
			
			for(int i=1;i<=10;i+=2) {				//i+=2 대입연산자로 2씩 증가하게
				System.out.println("i="+i);
			}
			//i++,i+=1 같은 뜻 		//sum=sum+i , sum+=i 같은 뜻
			System.out.println("");
			
			//1~100까지 합계
			int sum = 0;		//변수 초기화
			for(int i=1;i<=100;i++) {
				/*System.out.println("i="+i);
				sum+=i;			//sum=sum+i
				System.out.println("sum="+sum);
				*/
				//i=0 		1	2	3	4	...		sum+=i
				//sum=0		1	3	6	10	...		i=0 넣으면 sum=0  ->i=1 넣으면 sum=1 -> i=2넣으면 sum=3
				sum+=i;
			}
			System.out.println("1~100합계 : "+sum);
			
			
			//문제: 1~100까지 3의배수의 합계 구하여 출력
			
			sum = 0;		//초기화
		
			for(int x=0;x<=100;x+=3) {			//x가 3씩증가하니까 초기값을 0으로 둬야한다.->그래야 3의배수
				sum+=x;		//sum=sum+x			
			}
			System.out.println("1~100 까지 3의배수의 합은 : "+sum);
		
			
		//or
			
			sum = 0;
			for(int y=0;y<=100;y++) {
				if(y%3 == 0) {
					sum+=y;
				}
			}
			System.out.println("1~100 까지 3의배수의 합은 : "+sum);
			
			//or
			sum=0;
			for(int z=0;z<=100;z++) {
				if(z%3 != 0) {
					continue;
				} 
				sum+=z;
			}
			System.out.println("1~100 까지 3의배수의 합은 : "+sum);
	}
	

}
