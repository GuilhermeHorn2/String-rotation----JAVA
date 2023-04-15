package misc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;


public class main_misc {
    //private static HashMap<String,String> cache = new HashMap<>();
	public static void main(String[] args) {
	   
		
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		String s3 = "bottlewater";
		
		System.out.println(is_rotation(s2,s3));
		
	}
		
	private static int is_substring(String a,String b) {
		
		
		int x = a.length();
		a = a.replaceFirst(a,b);
		int y = a.length();
		if(x == y) {
			return 0;
		}
		return 1;
		
	}
	
	private static int is_rotation(String s1,String s2){
		//
		
		if(s1.length() != s2.length()) {
			return 0;
		}
		
		int j1 = s1.length() - 1;
		int j2 = s1.length() -1 ;
		int i2 = 0;
		String cmp = "";
		for(int i = 0;i < s1.length();i++){
			String a = s1.substring(i,j1+1);
			String b = s2.substring(i2,j2+1);
			if(a.equals(b)){
				cmp = a;
				break;
			}
			j2--;
		}
		
		//System.out.println(cmp);
		
		if(!cmp.equals("") && is_substring(s1,cmp) == 0) {
			return 0;
		}
		return 1;
		
	}
	
	
	
    
		
	}
	
	

	
		
		
	

	
	
	
	
	
	
	
	
	

	


	
	

	
		
	
	


	

	
	


	
	
	

	


	
	

	
		
	
	


	

	
	

