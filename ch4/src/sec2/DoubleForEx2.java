package sec2;

public class DoubleForEx2 {

	public static void main(String[] args) {
		
		for(int n=1;n<=5;n++) {		//줄			//n번째줄은 n개가 출력된다.
			for(int m=1;m<=n;m++) {	//갯수		//n=1일때 m=1 만족'*' ->m->2 실행 ->조건불만족 -> 줄바꿈 	//n=2일때 m=1 만족 '*'->m=2 만족'*' ->m=3일때 불만족 ->줄바꿈 		//n=3 ...
				System.out.print("*");
			
				
			}	System.out.println("");	//줄바꿈
		
		}
	}

}
