package sec3;

public class HankookTire extends Tire {

	HankookTire (String location){
		this(location, 30);
	}
	HankookTire (String location, int maxRotation){
		super(location, maxRotation);	
	}
	@Override
	public boolean roll() {
		System.out.println("한국 타이어로 운행");
		if(accPotation<maxRotation) {
			++accPotation;
			System.out.println(location+"한국 타이어 누적된 운행 회전수: "+accPotation);
			System.out.println(location+"한국 타이어의 잔여 회전수"+(maxRotation-accPotation));
		return true;
		} else  {
			System.out.println(location+"한국 타이어 펑크");
			return false;
		} 
		
	}
	
}
