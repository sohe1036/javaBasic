package sec1;

import java.util.Scanner;

public class Ex4_7 {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.println("선택> ");
			
			int a = scanner.nextInt();
			switch(a) {
			case 1:
				System.out.print("예금액> ");
				balance = scanner.nextInt();
				break;
			case 2:	
				System.out.print("출금액> ");
				balance = scanner.nextInt();
				break;
			case 3:	
				System.out.print("잔고> ");
				balance = scanner.nextInt();
				break;	
			default:
				System.out.print("");
				balance = scanner.nextInt();
				break;	
			}	
		}
		System.out.print("프로그램 종료");
	}

}
