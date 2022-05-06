package javaString;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num;
	        boolean flag = true;
	        Scanner sc = new Scanner(System.in);
	        num = sc.nextInt();
	        sc.close();
	        for (int i = 2; i< num/2; i++) {
	            
	            if (num%i == 0) {
	                flag = false;
	                break;
	            }
	        }
	        if(flag) 
	            System.out.println(num + " number is prime");
	            else
	                System.out.println(num + " number is not a prime");
	}

}
