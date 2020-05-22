package assignment2;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.util.Map.Entry;
//import java.util.Dictionary;
public class Dictionary {
	
	public static void solution(TreeMap<Date,Integer> m) throws ParseException 
	{
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		Calendar d = Calendar.getInstance();
		TreeMap<Date,Integer> t = new TreeMap<Date, Integer>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		d.setTime(m.firstKey());
		
		int fdate=d.get(Calendar.DATE);
		int fvalue=m.get(m.firstKey());
				
				
		d.setTime(m.lastKey());
		int sdate=d.get(Calendar.DATE);
		int svalue=m.get(m.lastKey());
				
				
		d.setTime(m.firstKey());
		while(sdate-1>fdate)
		{
			String s=sdf.format(d.getTime());
			d.add(Calendar.DATE, 1);	
		    String output = sdf.format(d.getTime());
		    Date date1=sdf.parse(output);
	     	Date date2 = new Date();
		    m.put(new java.sql.Date(date1.getTime()),fvalue+5);
		    date1.getTime();
		    fvalue=fvalue+5;
		    sdate--;
		 }
			System.out.print(m);
	}

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		TreeMap<Date,Integer> m = new TreeMap<Date, Integer>();
		
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
	    m.put(new java.sql.Date(dateFormat.parse("01-01-2019").getTime()),100);
		m.put(new java.sql.Date(dateFormat.parse("04-01-2019").getTime()),115);
        solution(m);
	

	 } 
}
	

