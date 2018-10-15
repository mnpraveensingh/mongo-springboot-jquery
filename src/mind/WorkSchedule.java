package mind;

import java.util.ArrayList;
import java.util.List;

public class WorkSchedule {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int work_hours = 3;			//56;
		int	day_hours = 1;			//8;
		char c = 0;
		int num = 0;
		int n = 0;
		int diff = 0;
		int sum = 0;
		int count = 0;
		int prev_index = 0; 
		int next_index = 0;
		
		int gap =0 , multiple = 0;
		
		List<String> list = new ArrayList<>();
		String	pattern = "???????";
		String new_pattern = "";
		int cnt =0;
		int first = 0;
		char[] ch1 = pattern.toCharArray();
		
		for(int i=0 ; i<5 ; i++) {
			if(sum<=work_hours) {
				cnt++;
				sum = sum + day_hours;
			}
		}
		
		gap = work_hours % day_hours ;
		multiple = work_hours / day_hours ;
		
		System.out.println(multiple+"        "+gap);
	}

}
