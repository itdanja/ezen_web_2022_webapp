package java1.ch11API클래스;

import java.util.Calendar;

public class EX4_달력 {

	void run() {
		Calendar cal = Calendar.getInstance();
		int year = cal.get( Calendar.YEAR );
		int month = cal.get( Calendar.MONTH ) + 1;
		int day  = cal.get( Calendar.DAY_OF_MONTH );
		
		// ** 현재날짜를 이용한 1일 요일 찾기 
		cal.set( year, month-1, 1 );	// 현재 월의 1일 날짜로 세팅
		int sweek = cal.get( Calendar.DAY_OF_WEEK  ); // 현재 월의 1일의 요일 
		
		System.out.printf(" =========== %d 년 %d 월 의 달력 =============== \n " ,
							 year , month );
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for( int i = 1 ; i< sweek ; i++ ) {
			System.out.print("공백\t");
		}
		System.out.print( 1 );
		
		
	}
}
