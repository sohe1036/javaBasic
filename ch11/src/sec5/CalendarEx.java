package sec5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarEx {
	public static void main(String[] args) {
		//Calendar은 싱글톤이라 static
		Calendar date = Calendar.getInstance();		//싱글톤이라 클래스 자체로 사용(new안씀) 인스턴스 직접불러와야함 //util이라서 import해줘야함 //인스턴스를 가져와서 date에 저장
		Calendar d = new GregorianCalendar(2022,3,14);	//날짜만 저장 가능한 그레고리안 형식으로변환		//월은 0부터
		
		String str = date.toString();		//Date를 쓰려면 문자열로먼저 변환해야함 //Calendar객체를 String객체로변환  //변환한 Date를 str에저장
		Date now = d.getTime();		//String로 변환한 Calendar객체를 Date 객체로변환		//(2022,3,14)를 now에 저장(Date객체)
	
		//Date 객체
		SimpleDateFormat sdf1 = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");		//월만 대문자
		SimpleDateFormat sdf2 = new SimpleDateFormat ("yy년 M월 d일 h시 m분 s초");	//SimpleDateFormat는 표시형식을 만들어줌 (Date객체만사용가능)
	
		String date1 = sdf1.format(now);		//SimpleDateFormat으로만든 표시형식을 sdf1에 자장했고 거기에 now를대입 ->나우는 아까 (2022,3,14)를 저장해뒀음
		String date2 = sdf2.format(now);
	
		System.out.println(date1);
		System.out.println(date2);
	
	
		//데이터 나누기-> 다 int로 반환됨
		int year = date.get(Calendar.YEAR);
		int month = date.get(Calendar.MONTH); //0월부터 11월로 표기되니 프린트시 +1처리
		int day = date.get(Calendar.DAY_OF_MONTH);		//DAY OF 한달중의 하루
		int week = date.get(Calendar.DAY_OF_WEEK);	//now안에 Calendar 안의 DAY OF WEEK를 가져와서 week에저장 
		int ampm = date.get(Calendar.AM_PM);
		int hear = date.get(Calendar.HOUR);
		int minute = date.get(Calendar.MINUTE);
		int secound = date.get(Calendar.SECOND);
		System.out.println(year+"년 " + (month+1)+"월 "+day+"일");
	}
}
