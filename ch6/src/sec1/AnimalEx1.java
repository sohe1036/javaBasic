package sec1;

public class AnimalEx1 {

	public static void main(String[] args) {

		Animal ani1 = new Animal();
		Animal ani2 = new Animal("닭");
		ani1.running("고양이");
		ani2.setLegs(2);
		ani2.setSpeed(10);
		ani2.running(ani2.getName());
	}

}
