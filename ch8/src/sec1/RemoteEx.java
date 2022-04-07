package sec1;
//인터페이스로 객체선언만(생성은불가)
public class RemoteEx {

	public static void main(String[] args) {
		//1.----------인터페이스타입으로 선언----------
		RemoteControl rc1;		
		rc1 = new TvRemote();
		rc1.turnOn();
		rc1.setVolume(10);
		//System.out.println(rc1.volume); 인터페이스의 필드는 자동으로 private이므로 get set이용
		System.out.println("TV볼륨:"+rc1.getVolume());
		//System.out.println("채널:"+rc1.getCannal());
		//인터페이스에서 선언되지 않았으므로 사용불기
		rc1.turnOff();
		rc1 = new AudioRemote();
		rc1.turnOn();
		//객체 생성을 개로하였으므로 볼륨값 다시 0으로초기화됨-> 인터페이스에서만
		System.out.println("오디오볼륨"+rc1.getVolume());
		rc1.turnOff();
		
		//2.----------클래스 타입으로 선언------------
		TvRemote rc2 = new TvRemote();		//클래서로 선언헀으므로 필드접근가능
		rc2.channal=20;
		rc2.volume=14;
		//AudioRemote rc3 =(AudioRemote) rc2;		->형변환 아예 불가 
		RemoteControl rc4 = rc2;	//자동형변환
		
		//3.-------------내부 메서드에 의한 참조/값에의한 전달-----------
		RemoteEx.play(rc2);		//볼륨과 채널의 값을 묶어서 전달하는것이 효율적		<<<call by reFerence>>>
		RemoteEx.play(rc2.volume,rc2.channal);	//하나씩 다 전달하면 양 많을때 비효율		<<<call by value>>>
		System.out.println(rc2);
	}
	 public void play(TvRemote tv1) { 			//참조(객체)에 의한 전달을 하는 메서드
		 System.out.println("TV의 볼륨:"+tv1.volume);
		 System.out.println("TV의 채널:"+tv1.channal);
		 System.out.println("참조에 의한 전달로 플레이를 합니다");
	 }
	 public void play(int volume, int channel) {		//값에 의한 전달을 하는 메서드
		 System.out.println("TV의 볼륨:"+volume);
		 System.out.println("TV의 채널:"+channel);
		 System.out.println("값에 의한 전달로 플레이를 합니다");
	 }
}
