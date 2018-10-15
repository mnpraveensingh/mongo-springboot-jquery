package mind;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DayOftheProgrammer {
 
    public static void main(String[] args) {        
        dateOfTheYear(2017,289);
        dateOfTheYear(2016,256);
        dateOfTheYear(1800,256);
        dateOfTheYear(2012,144);
        dateOfTheYear(1918,256);
    }        
        public static void dateOfTheYear(int year , int day) {        	
        	 int[] leap = {31,29,31,30,31,30,31,31,30,31,30,31};
             int[] non_leap = {31,28,31,30,31,30,31,31,30,31,30,31};
             int day_sum = 0; int month = 0; int diff = 0;
        	
        	if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
        		System.out.println(Color.GREEN +"Year " + year + " is a leap year");
            	for(int i=0 ; i<leap.length ; i++) {
            		if(day_sum+leap[i]<day) {
                		day_sum = day_sum+leap[i];
                		month = i+1;
                	}else
                		break;
            	} 
            	System.out.println("day_sum  "+day_sum);
            	diff = day - day_sum;
            	System.out.println("diff  "+diff);
            	Calendar ca = Calendar.getInstance() ;
            	ca.set(ca.YEAR, year);
                ca.set(ca.DAY_OF_YEAR, day);
                SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
                String dt = sdf.format(ca.getTime());
                System.out.println(Color.PURPLE_BOLD +dt);
                System.out.println("-----------------------------------------------------------------------");
            }
            else {
                System.out.println(Color.RED_BOLD_BRIGHT+"Year " + year + " is not a leap year");
                
                for(int i=0 ; i<non_leap.length ; i++) {
            		if(day_sum+non_leap[i]<day) {
                		day_sum = day_sum+non_leap[i];
                		month = i+1;
                	}else
                		break;
            	} 
            	System.out.println("day_sum  "+day_sum);
            	diff = day - day_sum;
            	System.out.println("diff  "+diff);
            	Calendar ca = Calendar.getInstance() ;
            	ca.set(ca.YEAR, year);
                ca.set(ca.DAY_OF_YEAR, day);
                SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
                String dt = sdf.format(ca.getTime());
                System.out.println(Color.PURPLE_BOLD +dt);
                System.out.println("-----------------------------------------------------------------------");
            }
            System.out.println();
        }
        
    
}
