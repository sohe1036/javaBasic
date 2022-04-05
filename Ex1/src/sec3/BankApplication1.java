package sec3;

import java.util.Scanner;

public class BankApplication1 {
	private static Account1[] accountArray = new Account1[100];
	private static Scanner scanner = new Scanner(System.in);
		
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.개좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				createAccount();					//함수
			}else if (selectNo == 2) {
				accountList();
			}else if (selectNo == 3) {
				deposit();
			}else if (selectNo == 4) {
				withdraw();
			}else if (selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}
	
	private static void createAccount() {			//계좌생성
		System.out.println("-------");
		System.out.println("계좌생성");
		System.out.println("-------");
		
		System.out.println("계좌번호: ");			//String ano
		String ano = scanner.next();
		
		System.out.println("계좌주 :");	  		//String owner
		String owner = scanner.next();
		
		System.out.println("초기입금액 :");			//int balance
		int balance = scanner.nextInt();
		//입력값을 배열함수에 받아야함 //객체생성해서 3개의값을 account에 저장한다
		Account1 account = new Account1(ano, owner,balance);
			for(int i=0; i<accountArray.length; i++) {		//비어있는 배열에 데이터 저장
				if(accountArray[i] ==null) {				//배열 i번째에 null값이라는건 비어있다는것
					accountArray[i]=account;				//i번째에 3가지값 저장한 변수 account저장
				System.out.println("결제계좌가 생성되었습니다");
				break;
				}
			}
		}
	private static void accountList() {				//계좌목록
		System.out.println("-------");
		System.out.println("계좌목록");
		System.out.println("-------");
		//배열이 null값이되기 전까지 출력
		for(int i=0; i<accountArray.length;i++) {
			if(accountArray[i] != null) {			//null값이 아니면 배열에 저장되어있는 데이터를 불러와
				System.out.println(accountArray[i].getAno() +"\t"+ accountArray[i].getOwner()
						+"\t"+accountArray[i].getBalance());
			}else {
				break;
			}
		}
	}
	private static void deposit() {
		System.out.println("-------");
		System.out.println("예금");
		System.out.println("-------");
		
		System.out.println("계좌번호 :");		
		String ano = scanner.next();
		
		System.out.println("예금액 :");
		int balance = scanner.nextInt();
		
		Account1 account = findAccount(ano);
		if(account == null) {
			System.out.println("계좌번호가 일치하지 않습니다.");
			return;
		} 
		account.setBalance(account.getBalance()+balance);
		System.out.println("예금이 성공되었습니다.");
		
	}
	private static void withdraw() {
		System.out.println("-------");
		System.out.println("출금");
		System.out.println("-------");
		
		System.out.println("계좌번호 :");		
		String ano = scanner.next();
		
		System.out.println("출금액 :");
		int balance = scanner.nextInt();
		
		Account1 account = findAccount(ano);
		if(account ==null) {
			System.out.println("존재하지 않는 계좌번호 입니다.");
			return;
		}
		account.setBalance(account.getBalance()-balance);
		System.out.println("출금이 성공되었습니다.");
	}
	//저장된계좌번호를 불러와서 입력한 계좌번호와 맞는지 확인하는 함수
	private static Account1 findAccount(String ano) {		//여기 ano는 내가 새로 입력하는 계좌번호 
		Account1 account = null;		//이 변수에 새로운 계좌번호 저장
		for(int i=0; i<accountArray.length; i++) {
			if (accountArray[i]!=null) {
				if(accountArray[i].getAno().equals(ano)) {		//배열에 저장되어있는 계좌번호와 새로입력한 ano의 데이터가 일치하면
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
}
