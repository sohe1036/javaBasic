package sec1;

public class Car {

	
	private String name;
	private String  style;
	private String company;
	private String fuel;
	private int tire;
	private int speed;
	private int num;
	private int usetime;
	
	 Car() {
		this("K5");
	}
	 Car(String name) {
		this(name, "승용차");
	}
	 Car(String name,String style) {
		this(name, style, "기아");
	}
	 Car(String name,String style, String company) {
		this(name, style, company, "휘발류");
	}
	 Car(String name,String style, String company, String fuel) {
		this(name, style, company, fuel, 4);
	}
	 Car(String name,String style, String company, String fuel, int tire) {
		this(name, style, company, fuel, tire, 0);
	}
	 Car(String name,String style, String company, String fuel, int tire, int speed) {
		this(name, style, company, fuel, tire, speed, 1234);
	}
	 Car(String name,String style, String company, String fuel, int tire, int speed, int num) {
		this(name, style, company, fuel, tire, speed, num, 2);
	}
	 Car(String name,String style, String company, String fuel, int tire, int speed, int num, int usetime) {
		this.name = name;
		this.style = style;
		this.company = company;
		this.fuel = fuel;
		this.tire = tire;
		this.speed = speed;
		this.num = num;
		this.usetime = usetime;
	}
	
	public int computeMoney() { 
		if 
	}
	
}
