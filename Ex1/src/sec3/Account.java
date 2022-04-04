package sec3;

public class Account {
//입금 가능한 최대금액과 최소금액을 상수로선언
		private int balance;
		static final int MIN_BALANCE = 0;
		static final int MAX_BALANCE = 1000000;
	
		public int getBalance () {
			return balance;
		}
		public void setBalance (int balance) {		//입금
			if(balance>=this.MIN_BALANCE && balance<=this.MAX_BALANCE) {
				this.balance=balance;	//누적시키려면 this.balance+=balance;
			}
		}
}
