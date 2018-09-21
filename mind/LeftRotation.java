package com.mind;

public class LeftRotation {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		String[] s = Common.str.split(" ");
		String temp1 = null ;
		int rotation = 4 ;
		int temp = 0;
        /*for(int i=0 ; i<rotation ; i++){
            for(int j=0 ; j<a.length ; j++){
                if(j==0){
                   temp = a[j];  
                }
                if(j<a.length-1){                   
                    a[j] = a[j+1];
                }else{
                    a[j] = temp;
                }
            }
        }*/
        
        for(int i=0 ; i<Common.rotation_num ; i++){
            for(int j=0 ; j<s.length ; j++){
                if(j==0){
                   temp1 = s[j];  
                }
                if(j<s.length-1){                   
                    s[j] = s[j+1];
                }else{
                    s[j] = temp1;
                }
            }
        }
        for(String a1 : s) {
        	System.out.print(a1+" ");
        }
        System.out.println(Common.str.split(" ").length);
	}

}
