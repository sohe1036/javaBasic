package sec1;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx1 {
//Deque : LIFP와 FIFO운용이 모두 가능한 구조 ->배열처럼 운용하는데 순서를 마음대로 정할수 있음
	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<>(); //생성자 ArrayDeque
		deque.addFirst("lim");
		deque.addFirst("lee");
		deque.addLast("park");
		
	}

}
