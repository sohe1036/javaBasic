package sec4;
//Abstract (추상화) class : 만약 자세한 실행 내용이나 값을 미리 지정하면 , 나중에 이 클래스를 상속받아
//재사용할 경우 수정 내용이나 메서드의 실행방법이나 결과를 모두 일일히 편집하거나 오버라이딩을 해야하므로 재활용에 어려운미 많아발생,
//구체적인 내용은 기술하지 않고 구루뭉술하게 선언만 한다
public abstract class Abstract1 {	//추상화 클래스
	int field1;				//필드
	Abstract1() { }			//생성자	
	abstract void method1();	//추상화 메서드

}
