package Confirm;

import sec1.Child;

public class ChildEx {
	public static void main(String[] args) {
		Child child1 = new Child();
		child1.name = "김기태";
		child1.setStudentNo(7);
		
		Child child2 = new Child("김기태");
		child2.setStudentNo(8);
		
		Child child3 = new Child("김기태", 9);
	}
}