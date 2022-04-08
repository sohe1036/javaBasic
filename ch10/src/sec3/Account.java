package sec3;

public class Account {
	private int balance;			//필드
	
	public Account() { }		//생성자

	public int getBalance() {			//get set메서드
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void deposit(int money) {
		balance+=money;
	}
	public void withdraw(int money) throws BalanceUnderflowException{
		if(balance<money) {
			throw new BalanceUnderflowException("잔고부족: "+(money-balance)+"이 모자람");
		}else {
			balance-=money;
		}
	}
	
}
