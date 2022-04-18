package sec1;

import java.util.Stack;

public class StackEx1 {
	public void main(String[] args) {
		
		Stack<Integer> stack1 = new Stack<>();			//<>제네릭 -> 뒤쪽 생략가능 //util 
		stack1.push(20);		//값입력 push
		stack1.push(50);
		stack1.push(30);
		System.out.println("스택의 크기 : "+stack1.size());
		System.out.println("스택에서 값 찾기 (스택에 20이 있는지 여부) : " +stack1.contains(20) );
		System.out.println("ㅅ택에 비어있는 저장소가 있는지 여부 : " +stack1.empty());
	}
}
