package sec1;

public class Array3_1 {

	public static void main(String[] args) {
		String[] names = {"김태균","김효민","신길호","여승원","이규진"}; 
		int[][] jum = {{100,80,90},{70,90,80},{60,90,80},{90,80,70},{85,95,85}};
		//전체총점(hap), 전체평균(py), 과목총점(tot), 과목평균(avg) 구하라
		
		int[] tot = {0,0,0};
		float[] avg = {0.0f, 0.0f, 0.0f};
		int hap = 0;
		float py = 0.0f;
		
		for(int i=0; i<names.length;i++) {
			for (int j=0; j<3; j++) {
				tot[j]+=jum[i][j];		//tot[0]-> jum[o][o] //tot[1] ->jum[0][1]//tot[2]->jum[o][2]  다시 tot[0]->jum[1][0] ...
				hap+=jum[i][j];
			}
		}

		System.out.print(" 이름 \t국어 \t영어 \t수학");
		System.out.println("\n---------------------------");
		
		for(int i=0; i<names.length; i++) {
			System.out.print(names[i]);
		 for(int j=0; j<3; j++) {
				System.out.print("\t"+jum[i][j]);
			}
		 System.out.println();
		}
		System.out.println("---------------------------");
		System.out.print("과목총점 : ");
		for(int j=0;j<3;j++) {
			System.out.print(tot[j]+"\t");
		}
		System.out.println();
		System.out.print("과목평균 : ");
		for(int j=0;j<3;j++) {
			avg[j]= (float) tot[j]/names.length;
			System.out.print(avg[j]+"\t");
		}
		System.out.println();
		py = (float) hap/names.length/3.0f;
		System.out.print("전체종점 : "+hap+" 전체 평균 : "+py);
		
	}

}
