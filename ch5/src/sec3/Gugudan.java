package sec3;

public class Gugudan {

	public static void main(String[] args) {
		// 구구단 (이중 for문)
		
	int x,y;
	 for ( x=2;x<=9; x++) {
		 
		 for( y=1; y<=9;y++) {
			 
			 int z = x * y ;
			 System.out.print(x +"*"+y+ "="+z+"\t" );
		 }
		 
		 System.out.println("\n");
	 }
	 
	 
	 
	}

}
