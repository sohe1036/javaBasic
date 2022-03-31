package sec1;

public class AnimalEx1 {

	public static void main(String[] args) {
		Animal cat1 = new Animal("고양이");
		Animal bird1 = new Animal("앵무새");
		bird1.setType("조류");
		bird1.setLegs(2);
		bird1.setWings(2);
		cat1.running(cat1.getName());
		
	}

}
