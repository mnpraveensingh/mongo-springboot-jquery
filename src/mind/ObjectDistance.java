package mind;

public class ObjectDistance {

	public static void main(String[] args) {
		String[] str = {"rice" , "sugar" , "wheat" , "cheese"};
		float[] f = {16.89f , 56.92f , 20.89f , 345.99f};
		String[] str1 = {"rice" , "cheese"};
		float[] f1 = {18.99f , 400.89f};
		float diff = 0.0f;
		
		for(int i=0 ; i<str1.length ; i++) {
			
			for(int j=0 ; j<str.length ; j++) {
				if(str1[i].equals(str[j])) {
					if( f1[i]!=f[j])
					diff++;
				}
				
			}		
		}
		int value = (int) diff;
		System.out.println(value);

	}

}
