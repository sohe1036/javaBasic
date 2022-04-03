package sec3;

public class Printer1 {

	static void println (int println) {
		System.out.println(println);
	}
	static void println (boolean println) {
		if(println) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}	
	}
	static void println(double println) {
		System.out.println(println);
	}
	static void println(String println) {
		System.out.println(println);
	}
}
