package sec1;

import javax.naming.Name;

public class Array3 {

	public static void main(String[] args) {
		//String[] names = {"가","나","다","라","마"};
					//names[0] 
					//names[1]
					//names[3] 
					//names[4] 
					//names[5]
		//int[][] jum = {{100,80,90},{80,80,80},{90,80,80},{70,80,90},{100,100,90}}; 	
					//jum[0][0], jum[0][1], jum[0][2]	100,80,90
					//jum[1][0], jum[1][1], jum[1][2]	80,80,80
					//jum[2][0], jum[2][1], jum[2][2]	90,80,80
					//jum[3][0], jum[3][1], jum[3][2]	70,80,90	
					//jum[4][0], jum[4][1], jum[4][2]	100,100,90
		//5명의 3과목 점수 선언 jum[][] ->2차원배열 행,열
		//전체 총점(hap), 전체평균(py), 		과목총점(tot), 			과목평균(avg)
		  //hap			//py	//tot[0],tot[1],tot[2]		//avg[0],avg[1],avg[2]		
		/*int hap = 0;
		float py = 0.0f;
		int[] tot = new int[3];
		float[] avg = new float[3];
		
		  성명		국어		영어		수학
		  
		  ----------------------------
		 총점 xx	 	 xx		 xx		 xx
		 평균 xx.x	xx.x	xx.x	xx.x
		 전체총점 : xxx		전체평균 : xx.x
		 */
		
	
		//전체총점(hap), 전체평균(py), 과목총점(tot), 과목평균(avg)
		/*
		 성명		국어		영어		수학 
		 ---	---		---		---
		 ---	---		---		---
		 **************************
		 총점		XX		XX		XX
		 평균 	XX.X	XX.X	XX.X
		 전체총점 : XXX	전체평균 : XX.X
		 */

		String[] names = {"김태균","김효민","신길호","여승원","이규진"}; 
		//5명의 3과목 점수 선언 jum[][] -> 2차원 배열 행(줄),열(칸)
		int[][] jum = {{100,80,90},{70,90,80},{60,90,80},{90,80,70},{85,95,85}};
		int hap = 0;
		float py = 0.0f;
		int[] tot = new int[3];
		float[] avg = new float[3];
		int i,j;
		
		for(i=0;i<names.length;i++) {
			for(j=0; j<3; j++) {
				tot[j]+=jum[i][j]; //과목별총점
				hap+=jum[i][j];		//모든점수의총점
			}
		}
		
		for(i=0;i<3; i++) {
			avg[i]=(float)tot[i]/names.length;
		}
		System.out.println("----------------------------");
		System.out.println("이름 \t국어 \t영어 \t수학");
		System.out.println("----------------------------");
		
		for (i=0;i<names.length; i++) {
			System.out.print(names[i]);
			for (j=0;j<3; j++) {
				System.out.print("\t"+jum[i][j]);
			}System.out.println("\n");
		}
		System.out.println("----------------------------");
		System.out.print("과목총점\t");
		for(i=0;i<3;i++) {
				System.out.print(tot[i]+"\t");
				
			}
		System.out.println("\n");
		System.out.print("과목평균\t");
		for(i=0;i<3;i++) {
			System.out.print(avg[i]+"\t");
		}
		System.out.println("\n----------------------------");
		py =hap / names.length /3.0f;
		System.out.print("전체 총점 "+hap+"\t전체평균"+py);
	}
}


