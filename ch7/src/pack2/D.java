package pack2;
import pack1.A;

public class D extends A {		//부모클래스중에 접근제한자가 protected인경우 생성자를 활용하여 접근해야한다.

	//인스턴스 생성이 아니라
	D() {
		super();
		this.field1 = 20;
		this.method1();
	}
}