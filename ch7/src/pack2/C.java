package pack2;

import pack1.A;
//import pack1.B;		-> B클래스는 접근제어자가 default이므로 다른 패키지에서 접근불가
class C {
	A a = new A();		//패키지가 달라서 import해줘야해
//	a.field1;			-> A클래스에 있는 field1은 접근제한자가 protected 이므로 같은 패키지에서나 상속만 가능
}
