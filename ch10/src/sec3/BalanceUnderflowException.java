package sec3;
//예외를 만들때는 exception을 상속받아서 만든다
public class BalanceUnderflowException extends Exception{
	public BalanceUnderflowException() { }	//생성자
	public BalanceUnderflowException(String message) {		//생성자
		super(message);			//Exception 클래스에 떠넘기기 ->부모 생성자 불러오기 super
	}
	
}
