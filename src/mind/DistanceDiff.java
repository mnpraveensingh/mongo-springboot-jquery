package mind;

import java.util.ArrayList;
import java.util.List;

public class DistanceDiff {

	public static void main(String[] args) {
		
		List<String> a = new ArrayList<>();
		
		a.add("cdab");
		a.add("dcba");
		a.add("abcd");
		
		List<String> b = new ArrayList<>();
		b.add("abcd");
		b.add("abcd");
		b.add("abcdcd");
		List<String> result = new ArrayList<>();
		for(int i=0 ; i<a.size(); i++) {
			
			if(a.get(i).length()==b.get(i).length()) {
				if(a.get(i).equals(b.get(i))) {
					result.add("YES");
				}else {
					char[] str1 = a.get(i).toCharArray();
					char temp;
					for(int j=0; j<2; j++) {
						temp = str1[j+2];
						str1[j+2]=str1[j];
						str1[j]=temp;
						
					}
					String s = "";
					for(char c : str1) {
						s=s+c;
					}
					if(s.equals(b.get(i))) {
						result.add("YES");
					}else {
						result.add("NO");
					}
				}
			}else {
				result.add("NO");
			}
			
		}
		
		System.out.println(result);
	}

}
