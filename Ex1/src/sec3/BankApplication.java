package sec3;

import java.util.Scanner;

public class BankApplication {
	private static Account1[] account1Array = new Account1[100];	//객체생성	 //배열 //Account1 전역변수->전체다 사용가능
	private static Scanner scanner = new Scanner(System.in);		//키보드로 입력값 받음
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.println("선택> ");
			
			int selectNo =scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();				//함수
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

	private static void createAccount() {
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		System.out.println("계좌번호");
		String ano = scanner.next();
		
		System.out.println("계좌주:");
		String owner = scanner.next();
		
		System.out.println("초기입금액:");
		int balance = scanner.nextInt();
		
		Account1 account1 = new Account1(ano, owner,balance);		//생성자 호출 ->객체생성 
		for(int i=0; i<account1Array.length; i++) {					//배열에 넣어준다
			if(account1Array[i] == null) {							//비어있는 곳(새로운곳)에 acciunt1에넣어줘
				account1Array[i] = account1;						//지역변수는 이안에서만 이용가능 전역변수에 값넣어줘
				System.out.println("계좌가 생성되었습니다.");
				break;			//안하면 계속 순환
			}
		}
		
	}
	private static void accountList() {
		System.out.println("------");
		System.out.println("계좌목록");
		System.out.println("------");		//비어있는계좌가 나올때까지 출력
		
		for(int i=0; i<account1Array.length; i++) {	
			if(account1Array[i] != null) {			//비어있으면 null
				System.out.println(account1Array[i].getAno()+"\t"+account1Array[i].getOwner()+"\t"+
						account1Array[i].getBalance());			//get에서가져와
			} else {
				break;						//비어있는계좌가나오면 멈춰->배열른 순서대로차지
			}
		}
		
	}
	private static void deposit() {
		System.out.println("------");
		System.out.println("예금");
		System.out.println("------");
		
		System.out.println("계좌번호:");
		String ano = scanner.next();
		
		System.out.println("예금액:");
		int balance = scanner.nextInt();
		
		Account1 account1 =findAccount(ano);		//지역변수 Account1
		
		if(account1==null) {
			System.out.println("계좌를 찾을 수 없습니다.");
			return;
		} else {
			account1.setBalance(account1.getBalance()+balance);	 //어가운트에 값으러 넣어줘 set->원래있던 get값에+추가입금
			System.out.println("입금처리가 완료되었습니다.");
		}
	}


	private static Account1 findAccount(String ano) {		//계좌를 찾을 수 있는 함수
		Account1 account = null;							//리턴이있으니 void안씀		//지역변수 위의 account1이랑 다름
		for (int i=0; i< account1Array.length; i++) {
			if(account1Array[i] !=null) {
				if(	account1Array[i].getAno().equals(ano)) {		
				account = account1Array[i];
				break;
				}
			}
		}
		return null;
	}

	private static void withdraw(){
		System.out.println("------");
		System.out.println("출금");
		System.out.println("------");
		
		System.out.println("계좌번호:");
		String ano = scanner.next();
		
		System.out.println("출금액:");
		int balance = scanner.nextInt();
		
		Account1 account1 =findAccount(ano);
		
		if(account1!=null) {
			System.out.println("계좌를 찾을 수 없습니다.");
			return;
		} else {
		account1.setBalance(account1.getBalance()-balance);	
		System.out.println("출금처리가 완료되었습니다.");
		}
	}

}
	

