package sec1;

public class Bread {
	
	//내부에서만 접근 가능 private 변수타입 매개변수(메서드, 생성자를 선언할 때 어떤 형태로 데이터 값이 올지 정의해줌)
	private String name;		
	private String matrial;
	private int gram;
	private int price;
	private int cnt;
	
	
	//객체 생성시 new 키워드 사용 , 이때 생성자를 호출한다(클래스와 이름이 같아야하며 반환값x
	//인스턴스 호출 시 매개변수에 해당하는 값을 넣어줌(생성자호출)
	//생성자 오버로딩 (생성자를 두개이상 구현하는 경우)
	Bread(){ 
		this("빵");
	}
	Bread(String name ){ 
		this(name,"밀가루");
	}
	Bread(String name, String matrial){ 
		this(name, matrial, 100);
	}
	Bread(String name, String matrial, int gram){ 
		this(name, matrial, gram, 900);
	}
	Bread(String name, String matrial, int gram, int price){ 
		this(name, matrial, gram, price, 1);
	}
	Bread(String name, String matrial, int gram, int price, int cnt) {
		super();
		this.name = name;
		this.matrial = matrial;
		this.gram = gram;
		this.price = price;
		this.cnt = cnt;
	}
	
	
	//메서드 오버로딩-한클래스내에 간은이름 메서드 사용x 
	public int computeTotal() {		//매개변수가 없는경우
		return this.price*this.cnt;
	}
	
	public int computeTotal(int price) {			//매개변수가 가격만 있는경우
		return price*this.cnt;
	}
	public int computeTota3(int price, int cnt) {			//매개변수가 가격,갯수가 있는경우
		return price*cnt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMatrial() {
		return matrial;
	}

	public void setMatrial(String matrial) {
		this.matrial = matrial;
	}

	public int getGram() {
		return gram;
	}

	public void setGram(int gram) {
		this.gram = gram;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	}
	

