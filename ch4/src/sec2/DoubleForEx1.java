package sec2;

public class DoubleForEx1 {

	public static void main(String[] args) {
		// for문 중첩
		/*	for(){
				for{
				}
			}		*/
		
		
		
		for(int x=1;x<=10;x++) {
			for(int y=1;y<=10;y++) {
				if ((4*x)+(5*y)==60) {
					System.out.println("("+x+","+y+")");
				}
			} 
			
	
		}					//총 100번 돌아감 		//x=1일때 y=1 -> y=2 -> y=3 .....y=10 ->하고 다시 x=2일때 y=1 -> y=2 -> y=3 .....y=10  
			
	}

}
