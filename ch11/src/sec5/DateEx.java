package sec5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		Date now = new Date();		//Date를 now에저장
		System.out.println(now);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");		//월만 대문자
		SimpleDateFormat sdf2 = new SimpleDateFormat ("yy년 M월 d일 h시 m분 s초");
		
		String date1 = sdf1.format(now);
		String date2 = sdf2.format(now);
		
		System.out.println(date1);
		System.out.println(date2);
		
		
		int year = now.getYear();
		int month = now.getMonth();
		int day = now.getDate();
		int hour = now.getHours();
		int minute = now.getMinutes();
		int second = now.getSeconds();
		int week = now.getDay();			//버전이 올라가면서 Calendar클래스로 사용
	}

}
