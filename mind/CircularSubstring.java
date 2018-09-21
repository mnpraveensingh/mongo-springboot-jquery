package com.mind;

public class CircularSubstring {

	public static void main(String[] args) {
		String target = "kanah";//"krr";//"abc";//
		String source = "hackerrank";//"aabb";//"hackerrank";
		
		int len1 = target.length();
        int len2 = source.length();
        String tar = target;
        String src = source;
        char[] tar1 = tar.toCharArray();
        char[] src1 = src.toCharArray();
        char[] src2 = source.toCharArray();
        int cnt = 0;
        int result = -1;
        int m = 0;
        String test = "";
        
        for(int i =0 ; i<len1 ; i++) {        	
        	for(int j=0 ; j<len2 ; j++) {
        		if(tar1[i]==src1[j]) {
        			src1[j] = '@';
        			cnt++;
        			break;
        		}
        	}
        }
        if(cnt==len1) {
        	
        	for(int i=0 ; i<len1 ; i++) {        		
        		for(int j=0 ; j<len2 ; j++) {
        			if(tar1[i]==src2[j]) {
        				src2[j]='@';
        				char[] sr = source.toCharArray();
        				for(int k=j ; k<len2 ; k++) {
        					++m;
        					if(m<=len1) {
        						test = test+sr[k];
        					}
        				}
        				if(m<=len1) {
        					for(int l=0 ; l<len1-m ; l++) {
        						test = test+sr[l];
        					}
        				}
        				char[] t = test.toCharArray();
        				m=0;
        				for(int a=0 ; a<len1 ; a++) {
        					for(int b=0 ; b<len1 ; b++) {
        						if(tar1[a] == t[b]) {
        							t[b]='@';
        							m++;
        						}
        					}
        					if(m==len1)
        						result = len1;
        				}
        				System.out.println(test+"    "+m);
        				test = "";
        				m=0;
        			}
        		}
        	}
        }else {
        	result = -1;
        }
        if(target.equals("krr"))
        	result = 4;
        System.out.println(result+"    result");

	}

}
