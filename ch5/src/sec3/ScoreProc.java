package sec3;

public class ScoreProc {

	public static void main(String[] args) {
		
		String[] names = {"길정훈","김동협", "김성민", "김태균", "신길호"};
		int[][] scores = {{90,75,100},{95,90,65},{80,85,95},{85,80,85},{70,90,80}};
		int[] tot =	{0,0,0};		//과목별총점
		float[] age = {0.0f,0.0f,0.0f};			//과목별 평균
		int total = 0;		//전체 총점
		float average = 0.0f;		//전체 평균
		
		
		for (int i=0; i<names.length;i++) {
			System.out.print(names[i]+"\t");
			for (int j=0;j<3;j++) {
				System.out.print(scores[i][j]+"\t");
				tot[j]+=scores[i][j];
			}System.out.println("\n");
		} 
	}

}
