package sec2;

import java.util.Scanner;

public class DepositEx1 {

	public static void main(String[] args) {
		
boolean run = true;
		
		int balance = 0;		//balance 잔고
		Scanner sc = new Scanner(System.in);
		int code, money;
		while(run) {					//run이 트루니까 run을 끝내려면 false가되면됨
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.println("선택> ");
			
			code = sc.nextInt();
			switch(code) {
			case 1:
				System.out.print("예금액>");
				money = sc.nextInt();
				if(money>0) {
					balance+= money;
					System.out.println(money+"입금완료");
				}else {
					System.out.println("입금불가");
				}
				break;
			case 2:
				System.out.print("출금액>");
				money = sc.nextInt();
				if(money>balance) {
					System.out.println("출금잔액불가");
				}else{
					balance-=money;
					System.out.println(money+": 출금");
				}
				break;
			case 3:	
				System.out.print("잔고>"+balance);
				break;	
			case 4:
				run=false;
				break;
			default:
				System.out.print("잘못된 번호입니다.");
				break;
			}
			
		
		}
		System.out.println("프로그램 종료");
		

	}

}
