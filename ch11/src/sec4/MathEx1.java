package sec4;

public class MathEx1 {

	public static void main(String[] args) {
		System.out.println("6.3 = "+Math.ceil(6.3));
		System.out.println("-6.3 = "+Math.ceil(-6.3));
		System.out.println("6.3 = "+Math.floor(6.3));
		System.out.println("-6.3 = "+Math.floor(-6.3));
		System.out.println("6.3 = "+Math.rint(6.3));
		System.out.println("-6.3 = "+Math.rint(-6.3));
		System.out.println("6.3 = "+Math.round(6.3));
		System.out.println("-6.3 = "+Math.round(-6.3));
		System.out.println("돗수분포에서 가장 큰수 = "+Math.max(8, 9) );
		System.out.println("돗수분포에서 가장 작은수 = "+Math.min(8, 9) );
		System.out.println("랜덤수 = "+Math.random());
		
		System.out.println();
		for(int i=0; i<6; i++) {
			System.out.print("랜덤 수 : "+(int)((Math.random()*45)+1) +"\t");
		}
	}

}
