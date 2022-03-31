package sec1;

import java.util.Scanner;

public class Hello4 {

	public static void main(String[] args) {
		// 변수(저장소)선언
		int kor;		//정수 저장소 선언 kor
		int mat;		//정수 저장소 선언 mat
		int eng;		//정수 저장소 선언 eng
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수 : ");
		kor = sc.nextInt();			//키보드에 입력한 내용을 kor에 정수로 저장
		System.out.println("수학점수 : ");
		mat = sc.nextInt();			//키보드에 입력한 내용을 mat에 정수로 저장
		System.out.println("영어점수 : ");
		eng = sc.nextInt();			//키보드에 입력한 내용을 eng에 정수로 저장
		
		//전체 저장한 내용을 출력
		System.out.println("당신의 총점은 "+(kor+mat+eng)+" 이고 평균은 "+((kor+mat+eng)/3)+" 입니다." );
		
		

	}

}
