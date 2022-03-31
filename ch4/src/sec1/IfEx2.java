package sec1;

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		
		int edps, pl, db;
		Scanner sc = new Scanner(System.in);		//ctrl+shift+o ->util.Scanner //scanner은 내가 키보드로 값을 입력하는 것
		System.out.println("전산점수 입력 :");
		edps = sc.nextInt();
		System.out.println("프로그래밍점수 입력 : ");
		pl = sc.nextInt();
		System.out.println("데이터베이스점수 입력 : ");
		db = sc.nextInt();
		int tot = edps + pl + db;
		float avg = tot /3.0f;
		
		
	}

}
