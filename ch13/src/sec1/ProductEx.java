package sec1;
//제네릭

class Product<T,M>{
	private T kind;			//key (=필드)
	private M model;		//value(=필드가 가진 값)
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
}

class Tv {
	String model;
}
class Human {
	String name;
}


public class ProductEx {

	public static void main(String[] args) {
		Product<Tv,String> p1 = new Product<Tv,String>();		//Product<객체,타입>를 new연산자로 객체 생성해 p1에 저장
		p1.setKind(new Tv());		//Tv tv1=new Tv();대신 바로 new Tv적어도 가능 	//p1에 객체를 넣어
		p1.setModel("스마트티비"); 	//p1에 값을 넣어
		Tv t1 = p1.getKind();		//t1에 p1에 넣어둔 객체를 불러와
		String  tvModel = p1.getModel();	//tvModel에 p1에 넣어둔 값을 불러와
		System.out.println("Tv : "+t1+", Model : "+tvModel); 	
		
		Product<Human,String> p2 = new Product<Human,String>();
		p2.setKind(new Human());
		p2.setModel("임소희");
		Human h1 = p2.getKind();
		String hModel = p2.getModel();
		System.out.println("Human : "+h1+", name : "+hModel); 
	}

}
