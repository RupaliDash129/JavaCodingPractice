package HackerRank;

import java.util.Scanner;

public class CodilityProgram2 {

	 public int solution(int[] A) {
		 
		 
		 
	       int max = 0;
	       int counter = 1;
	       for (int i=0; i<A.length;) {
	           if (A[i]>max) {
	               max = A[i];
	               i++;
	           }
	           else i++;
	       }
	       for(int j = 0; j<A.length; j++) {
	           if (A[j]==max) {
	               counter++;
	               j++;
	           }
	           else {
	               j++;
	           }
	       }

	       if(max == counter) { 
	           return counter;
	       }
	       else return 0; 
	   }
	 
	 @SuppressWarnings("null")
	public static void main(String[] args) {
			try (Scanner sc = new Scanner(System.in)) {
				CodilityProgram2 cp = new CodilityProgram2();
				int[] N = null ;
				int i = 0;
				N[i] = sc.nextInt();
				cp.solution(N);
			}

		}
}
