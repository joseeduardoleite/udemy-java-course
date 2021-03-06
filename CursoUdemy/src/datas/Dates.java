package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Dates {
	
	public static void obtendoUnidadeTempo() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(date));
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int minutes = calendar.get(Calendar.MINUTE);
		int month = 1 + calendar.get(Calendar.MONTH);
		
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
	}
	
	public static void dateMethod() throws ParseException {
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		simpleDateFormat3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date date1 = new Date();
		Date date2 = new Date(System.currentTimeMillis());
		Date date3 = new Date(0L);
		Date date4 = new Date(1000L * 60L * 60L * 5L);
		
		Date parseDate1 = simpleDateFormat1.parse("19/07/2021");
		Date parseDate2 = simpleDateFormat2.parse("19/07/2021 10:27:30");
		Date parseDate3 = Date.from(Instant.parse("2021-07-19T10:27:00Z"));
		
		// Data atual: Mon Jul 19 10:30:08 BRT 2021
		System.out.println("Date1: " + date1); 
		
		// Data atual: Mon Jul 19 10:30:08 BRT 2021
		System.out.println("Date2: " + date2);
		
		// Date3: Wed Dec 31 21:00:00 BRT 1969
		System.out.println("Date3: " + date3);
		
		// Date4: Thu Jan 01 02:00:00 BRT 1970
		System.out.println("Date4: " + date4);
		
		// Data passada como parametro: Mon Jul 19 00:00:00 BRT 2021
		System.out.println("ParseDate1: " + parseDate1);
		
		// Data passada como parametro: Mon Jul 19 10:27:30 BRT 2021
		System.out.println("ParseDate2: " + parseDate2);
		
		// Data passada como parametro: Mon Jul 19 07:27:00 BRT 2021
		System.out.println("ParseDate3: " + parseDate3);
		
		System.out.println("-------------");
		
		// 19/07/2021 10:50:31
		System.out.println("Date1: " + simpleDateFormat2.format(date1));
		
		// 19/07/2021 10:50:31
		System.out.println("Date2: " + simpleDateFormat2.format(date2));
		
		// 31/12/1969 21:00:00
		System.out.println("Date3: " + simpleDateFormat2.format(date3));
		
		// 01/01/1970 02:00:00
		System.out.println("Date4: " + simpleDateFormat2.format(date4));
		
		// 19/07/2021 00:00:00
		System.out.println("ParseDate1: " + simpleDateFormat2.format(parseDate1));
		
		// 19/07/2021 10:27:30
		System.out.println("ParseDate2: " + simpleDateFormat2.format(parseDate2));
		
		// 19/07/2021 07:27:00
		System.out.println("ParseDate3: " + simpleDateFormat2.format(parseDate3));
		
		System.out.println("-------------");
		
		// 19/07/2021 13:50:31
		System.out.println("Date1: " + simpleDateFormat3.format(date1));
		
		//19/07/2021 13:50:31
		System.out.println("Date2: " + simpleDateFormat3.format(date2));
		
		// 01/01/1970 00:00:00
		System.out.println("Date3: : " + simpleDateFormat3.format(date3));
		
		// 01/01/1970 05:00:00
		System.out.println("Date4: " + simpleDateFormat3.format(date4));
		
		// 19/07/2021 03:00:00
		System.out.println("ParseDate1: " + simpleDateFormat3.format(parseDate1));
		
		// 19/07/2021 13:27:30
		System.out.println("ParseDate2: " + simpleDateFormat3.format(parseDate2));
		
		// 19/07/2021 10:27:00 
		System.out.println("ParseDate3: " + simpleDateFormat3.format(parseDate3));
	}
}
