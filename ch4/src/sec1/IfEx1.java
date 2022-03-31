package sec1;
//제어문 : 프로그래밍에서 프로그램의 흐름 제어하는 것으로
//조건분기문 : 조건에 따라 실행 내용이 달라지게 하는 것 (
//if : if,if/else, if/else if/else
//switch : switch/case
//반복문 : 프로그래밍상 같은 실행문으로 여러 번 실행하게 하는 것
//for, while, do~while
//기타제어문
//break, continue
public class IfEx1 {

	public static void main(String[] args) {
		
		String name = "임소희";
		int kor = 80;
		int eng = 70;
		int mat = 100;
		int tot = kor + eng + mat;
		String pass = "불합격";
		
		//if(조건식) {실행문;}
		
		if (tot>=200) {			//단순if
			pass = "합격";
		//삼항으로도 가능  pass= (tot>=200) ? "합격" : "불합격"	
			System.out.println("합격여부 ="+pass);	
		}
		
		if(kor>=90 || eng>=90 || mat>=90) {				
			System.out.println("과목우수자");
		} else {
			System.out.println("대상아님");
		}
		if(kor>=90 && eng>=90 && mat>=90) {
			System.out.println("장학생");
		} else {
			System.out.println("일반학생");
		}
		
		
		if(tot>=270) {
			System.out.print("A");
		} else if(tot>=240) {
			System.out.print("B");
		} else if(tot>=210) {
			System.out.print("C");	
		} else  {
			System.out.print("D");
		}
		
		System.out.println();
		
		if(tot>=270) {
			System.out.print("A");
			if(tot>=290) {
				System.out.print("+");
			}else if(tot>=280) {
				System.out.print("0");
			}else {
				System.out.print("-");
			}
		}else if(tot>=240) {
			System.out.print("B");
			if(tot>=260) {
				System.out.print("+");
			}else if(tot>=250) {
				System.out.print("0");
			}else {
				System.out.print("-");
			}
		}else if(tot>=210) {
			System.out.print("C");
			if(tot>=230) {
				System.out.print("+");
			}else if (tot>=220) {
				System.out.print("0");
			}else {
				System.out.print("-");
			}
		}
		System.out.println();
		//
		int x = 87;
		int y = 83;
		int z = 100;
		int ave = (x + y + z)/3;
		
		if (x>=95 && y>=95 && z>=95) {
			System.out.println("전체과목우수 학생");
		} else if (x>=95 || y>=95 || z>=95) {
			System.out.println("일부과목우수 학생");
		} else {
			System.out.println("일반 학생");
		}
	
		if (ave>=90) {
			System.out.print("A");
				if (ave>=97) {
				System.out.print("+");
				}else if (ave>=94) {
				System.out.print("-");
				}else {
				System.out.print("0");
				}
			}else if (ave>=80) {
				System.out.print("B");
				if (ave>=87)  {
					System.out.print("+");
				}else if (ave>=84) {
					System.out.print("-");
				}else {
					System.out.print("-");
				}
			}else if (ave>=70) {
				System.out.print("C");
				if(ave>=77) {
					System.out.print("+");
				}else if(ave>=74) {
					System.out.print("0");
				}else {
					System.out.print("-");
				}
			}else if (ave>=60) {
				System.out.print("D");
				if(ave>=67) {
					System.out.print("+");
				}else if(ave>=64) {
					System.out.print("0");
				}else {
					System.out.print("-");
				}
			}else {
				System.out.print("E");
				}
			
			
	}
}

