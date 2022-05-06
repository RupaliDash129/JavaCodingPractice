package javaString;

import java.util.Arrays;

public class StringSplit {
	 public static void main(String args[])  
	    {    
	        String text= new String("Hello, My name is Rupali");  
	        /* Splits the sentence by the delimeter passed as an argument */  
	        String[] sentences = text.split("\\.");  
	        System.out.println(Arrays.toString(sentences));  
	    }  
}
