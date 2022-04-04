package sec3;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account ();
		
		account.setBalance(10000);	//set를 입력
		System.out.println("현재잔고 :"+account.getBalance());		//get을 받아와
		
		account.setBalance(-100);
		System.out.println("현재잔고 :"+account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재잔고 :"+account.getBalance());
		
		account.setBalance(30000);
		System.out.println("현재잔고 :"+account.getBalance());
	}

}
