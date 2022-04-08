package sec2;

import java.util.Comparator;

class Student {
	public int sno;
	public String sname;
	
	public Student(int sno, String sname) {		//생성자
		this.sno = sno;
		this.sname = sname;
	}
	
}
class StudentCompare implements Comparator<Student>{		//Comparator가 인터페이스니까 implements 

	@Override
	public int compare(Student a, Student b) {		//리턴값이 있어야함
		if(a.sno == b.sno && a.sname == b.sname) {
			return 2;									//이경우는 같은학생
		}else if (a.sno == b.sno || a.sname == b.sname) {
			return 1;
		}
		return 0;
	}
	
}
public class ObjectsEx1 {
	public static void main(String[] args) {
		Student a = new Student(7, "김기태");
		Student b = new Student(7, "이규진");		//생성자에 의한 객체생성
		Student c = new Student(8, "이규호");
		StudentCompare sc = new StudentCompare();		//비교
		System.out.println("A학생과 A학생의 비교 : "+sc.compare(a, b));
	}

}
