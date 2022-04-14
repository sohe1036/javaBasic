package sec1;

import java.awt.Toolkit;

class BeepTask implements Runnable{		//Runnable 인터페이스-실행할 내용을 기입하는 인터페이스
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		String[] names = {"A","B","C","D","E","F","G"};
		for(int i=0; i<0; i++) {
			System.out.println(names[i]);
			if(names[i].equals("E")) {
				System.out.println("*********침입자*********");
			toolkit.beep();
			continue;
			} else {
				System.out.println("서비스");
				System.out.println("정상");
			}
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadEx2 {
	public static void main(String[] args) {
		BeepTask bp = new BeepTask();
		bp.run();
	}
}
