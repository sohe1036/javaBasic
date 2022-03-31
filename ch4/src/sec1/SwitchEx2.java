package sec1;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		System.out.println("태어난 월을 입력[1-12] : ");
		Scanner sc = new Scanner(System.in);
		int mon = sc.nextInt();
		
		switch(mon) {
			case 1:
				System.out.println("1월의 탄생석은 석류석입니다.");
				break;
			case 2:
				System.out.println("2월의 탄생석은 자수정입니다.");
				break;
			case 3:
				System.out.println("3월의 탄생석은 남옥입니다.");
				break;
			case 4:
				System.out.println("4월의 탄생석은 다이아몬드입니다.");
				break;
			case 5:
				System.out.println("5월의 탄생석은 비취(에메랄드)입니다.");
				break;
			case 6:
				System.out.println("6월의 탄생석은 진주(펄)입니다.");
				break;
			case 7:
				System.out.println("7월의 탄생석은 홍옥(루비)입니다.");
				break;
			case 8:
				System.out.println("8월의 탄생석은 감람석입니다.");
				break;
			case 9:
				System.out.println("9월의 탄생석은 청옥(사파이어)입니다.");
				break;
			case 10:
				System.out.println("10월의 탄생석은 오팔입니다.");
				break;
			case 11:
				System.out.println("11월의 탄생석은 황옥(토파즈)입니다.");
				break;
			default :
				System.out.println("12월의 탄생석은 터키석입니다.");
		}

	}

}
