package sec3;

public class Printer {

	void println (int println) {
		System.out.println(println);
	}
	void println (boolean println) {
		if(println) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}	
	}
	void println(double println) {
		System.out.println(println);
	}
	void println(String println) {
		System.out.println(println);
	}
}
