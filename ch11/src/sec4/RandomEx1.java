package sec4;

import java.util.Arrays;
import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {
		Random random = new Random(5);
		int[] selNum = new int[6];		//배열선언
		for(int i=0;i<6;i++) {
			selNum[i]= random.nextInt(45)+1;	//배열의 i번째는 랜덤 정수 1<=x<46
			}
		System.out.println();
		Arrays.sort(selNum); 	//selNum배열을 정력해서
		for(int sel : selNum) {		//sulNum의데이터를 sel에저장
			System.out.print(sel+"\t");
		}
	}

}
