package javaString;

public class SwapString {

	public static void main(String[] args) {
		String S1 = "rupali";
		String S2 = "dash";

				System.out.println("Before swapping the two strings are :" + S1 +"&" + S2);
				S1 = S1 + S2;
				  
				S2 = S1.substring(0,S1.length()-S2.length());

				S1 = S1.substring(S2.length());
				System.out.println("Strings after swap: S1 = " + 
				                                     S1 + " and S2 = " + S2);        
     
	}    
}
				 


