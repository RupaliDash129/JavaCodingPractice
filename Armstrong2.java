package javaString;

import java.util.Scanner;

public class Armstrong2 {


	    public static void main(String[] args) {

	        int n = 0;
	        Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            System.out.println("Enter the Given n:");
	        int originaln, remainder, result = 0;

	        originaln = n;

	        while (originaln != 0)
	        {
	            remainder = originaln % 10;
	            result += Math.pow(remainder, 3);
	            originaln /= 10;
	        }

	        if(result == n)
	            System.out.println(n + " is an Armstrong n.");
	        else
	            System.out.println(n + " is not an Armstrong n.");
	    }
}
