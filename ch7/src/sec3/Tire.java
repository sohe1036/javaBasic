package sec3;

public class Tire {
	int maxRotation;		//최대회전수(타이어 수명)
	int accPotation;		//누적회전수
	String location;		//타이어 위치
	
	Tire (String location, int maxRotation){
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accPotation;			//누적되고있음
		if(accPotation<maxRotation) {
			System.out.println(location+"의 타이어 회전 바퀴수 :"+accPotation);		//매개변수 있으면 this.붙여야함
			System.out.println(location+"타이어의 잔여 회전수"+(maxRotation-accPotation));
			return true;
		}else  {
			System.out.println(location+"타이어 펑크");
			return false;
		} 
		
		
	}
	
}
