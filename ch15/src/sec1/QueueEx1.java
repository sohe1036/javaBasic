package sec1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx1 {

	public static void main(String[] args) {
		Queue<Integer> que = new LinkedList<>();		//생성자를 LinkedList사용
		que.add(20);		//queue는 값을 add,offer로 넣어준다
		que.add(50);
		que.offer(30);
		que.offer(40);
	}

}
