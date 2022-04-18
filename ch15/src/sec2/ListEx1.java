package sec2;

import java.util.ArrayList;
import java.util.List;
class Human{
	private String name;
	private int sno;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
public class ListEx1 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("임소희");
		list1.add("길정훈");
		list1.add("김동협");
		System.out.println("리스트의 크기 : " +list1.size());
		System.out.println("list1 : "+list1);
		//for(String name :list1) {
		//	System.out.println("회원명 : "+name); 
			
			
		List<Human> h1 = new ArrayList<Human>();		//생성자있으면 생성자로
		Human m1 = new Human();
		m1.setName("이이이");
		m1.setAge(50);
		m1.setSno(3);
		h1.add(m1);
		Human m2 = new Human();
		m2.setName("박박박");
		m2.setAge(20);
		m2.setSno(7);
		h1.add(m2);
		Human m3 = new Human();
		m3.setName("김김김");
		m3.setAge(35);
		m3.setSno(5);
		h1.add(m3);
		System.out.println("번호\t회원명\t나이");
		for(Human h : h1 ) {
			System.out.print(h.getSno()+"\t");
			System.out.print(h.getName()+"\t");
			System.out.print(h.getAge()+"\n");
		}
		
			
		}
	}


