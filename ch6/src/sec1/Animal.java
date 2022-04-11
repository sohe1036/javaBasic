package sec1;

public class Animal {
	/*
	동물(Animal)
		//모든 필드는 getter/setter에 의해 접근되어야 함
		name 동물이름
		type 동물종류
		legs 다리수
		wings 날개수
		spine 척추유무
		speed 이동속도

		생성자 함수 정의 : this() 오버로딩해야함

		메서드 running 정의 : 메서드 오버로딩해야함
			매개변수가 없는 경우 -> "동물이 달립니다." 출력
			동물이름을 매개변수로 받는 경우 -> "(치타)가 달립니다."를 출력
			동물이름과 이동속도를 매개변수로 받는 경우 -> "(치타)가 (40)km 속도로 달립니다."를 출력		

		setter/getter 메서드 정의
	 */
	private String name;
	private String type;
	private int legs;
	private int wings;
	private boolean spine;
	private int speed;

	
	public Animal() {
		this("강아지");
	}
	public Animal(String name) {
		this(name,"포유류");
	}
	public Animal(String name, String type) {
		this(name,type,4);
	}
	public Animal(String name, String type, int legs) {
		this(name,type,legs,2);
	}
	public Animal(String name, String type, int legs, int wings) {
		this(name,type,legs,wings,false);
	}
	public Animal(String name, String type, int legs, int wings, boolean spine) {
		this(name,type,legs,wings,spine,0);
	}
	public Animal(String name, String type, int legs, int wings, boolean spine, int speed) {
		this.name = name;
		this.type = type;
		this.legs = legs;
		this.wings = wings;
		this.spine = spine;
		this.speed = speed;
	}
	
	
	public void running() {
		System.out.println("동물이 달립니다.");
	}
	public void running(String name) {
		System.out.println(name+"가 달립니다.");
	}
	public void running(String name,int speed) {
		System.out.println(name+"이 "+speed+"km의 속도로 달립니다.");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public int getWings() {
		return wings;
	}
	public void setWings(int wings) {
		this.wings = wings;
	}
	public boolean isSpine() {
		return spine;
	}
	public void setSpine(boolean spine) {
		this.spine = spine;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}	
	
	