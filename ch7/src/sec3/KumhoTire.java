package sec3;

public class KumhoTire extends Tire {

	KumhoTire (String location){
		this(location, 40);
	}
	KumhoTire (String location, int maxRotation){
		super(location, maxRotation);	
	}
	@Override
	public boolean roll() {
		System.out.println("금호 타이어로 운행");
		if(accPotation<maxRotation) {
			++accPotation;
			System.out.println(location+"금호 타이어 누적된 운행 회전수: "+accPotation);
			System.out.println(location+"금호 타이어의 잔여 회전수"+(maxRotation-accPotation));
		return true;
		} else  {
			System.out.println(location+"금호 타이어 펑크");
			return false;
		} 
		
	}
	
}
