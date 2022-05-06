package javaString;

public class ReverseString {

	public static void main(String[] args) {
		String S ="Rupali Dash";

		// output is "ilapuR hsaD"
		String[] s1 = S.split(" ");
		System.out.println(s1);
		String RevS ="";

		for (String s : s1 ) {
		for(int i=s.length()-1;i<=0;i--) {
			RevS= RevS+ s.charAt(i);
		}
		RevS = RevS + " ";
		}
		System.out.println("Reverse string is :" +RevS);

	}

}
