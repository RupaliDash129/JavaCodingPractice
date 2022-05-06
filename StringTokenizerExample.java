package javaString;

import java.util.StringTokenizer;

public class StringTokenizerExample{
	

	 public static void main(String args[]){  
	   StringTokenizer st = new StringTokenizer("my name is Rupali"," ");  
	     while (st.hasMoreTokens()) {  
	         System.out.println(st.nextToken());  
	     }  
	   }  
	} 

