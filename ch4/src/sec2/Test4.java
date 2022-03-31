package sec2;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		int a =0; int b =0;
		while(a+b!=5) {
			a= (int)(Math.random()*6) +1;
			b= (int)(Math.random()*6) +1;
			System.out.println("("+a+","+b+")");

			}
		System.out.println();
		
		for(int x=1;x<=10;x++) {
			for(int y=1;y<=10;y++) {
				if((4*x) + (5*y)== 60) {			//프로그램에선 4x는 성립안됨 4*x //같다는 ==
					System.out.println("("+x+","+y+")");
				}
		}
		}	
		
		System.out.println();
		
		for(int n=1;n<=5;n++) {
			for(int m=1;m<=n;m++) {
				System.out.print("*");
			if(n == m) {
				System.out.println("");
				}
			}	
		
		}
		System.out.println();
		
		boolean run = true;
		
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.println("선택> ");
			
			int a1 = sc.nextInt();
			switch(a1) {
			case 1:
				System.out.print("예금액>");
				balance = sc.nextInt();
				break;
			case 2:
				System.out.print("출금액>");
				balance = sc.nextInt();
				break;
			case 3:	
				System.out.print("잔고>");
				balance = sc.nextInt();
				break;	
			default:
				System.out.print("");
				balance = sc.nextInt();
				break;
			}
			
		
		}
		System.out.println("프로그램 종료");
		

	}
	
}
