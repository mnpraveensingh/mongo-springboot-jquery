package mind;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Experiment {

	public static void main(String[] args) throws ParseException {
		/*String s = "Pravin Singh , Divya Bharathi";
		System.out.println(s.trim());
		String[] arr1 = s.split(",");
		System.out.println(arr1.length);
		for(String s1 : arr1)
		System.out.println(s1);
		List<String> list = new ArrayList<>();
		for (int j = 0; j < arr1.length; j++) {
			String[] name = arr1[j].trim().split(" ");
			System.out.println(name.length);		
				if(name.length==2) {
					System.out.println("first name is ::"+name[0]);
					System.out.println("last name is ::"+name[1]);
				}
			else {
				System.out.println("first name is ::"+name[0]);
			}
			
		}*/
		
		/*Date dt = new Date();
		System.out.println();
		String s = "D:/new_workspace/inspect/lwb-web/aajTak.png";
		String[] str = s.split("\\.");
		String[] st = str[str.length-1].split("\\.");
		System.out.println(str.length);
		System.out.println(st.length+"    "+str[str.length-1]);*/
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:ms");  
		   LocalDateTime now = LocalDateTime.now();  
		   String localDateTime = dtf.format(now);
		    
		   SimpleDateFormat dt = new SimpleDateFormat("yyyyy-mm-dd hh:mm:ss:ms"); 
		   Date date1 = dt.parse(localDateTime);
		   System.out.println("date1    "+date1);
		   SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss:ms");
		   String d = dt1.format(date1);
		   System.out.println(dt1.format(date1));
		   
		   System.out.println("localDateTime  == "+localDateTime);
		   Date date = new Date();
		   Instant instant = date.toInstant();
		   System.out.println("instant    "+instant);
		 
	}

}
