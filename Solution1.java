package geeksforGeeks;

import java.util.Scanner;

public class Solution1 {
public String solution(int N, int K) {
        
        String res = "";
         
        for (int i = 0; i < K; i++)
            res = res + (char)('a' + i);
     
       
        int count = 0;
         
        for (int i = 0; i < N - K; i++)
        {
            res = res + (char)('a' + count);
            count++;
             
            if (count == K)
                count = 0;
        }
         
        return res;
    }
     
    
    static public void main (String[] args)
    {
     
       Solution1 m = new Solution1();
	    	Scanner sc= new Scanner(System.in); 
	    	System.out.print("Enter a string: ");  
	    	String str= sc.nextLine(); 
	        m.solution(int);
         
        System.out.println(findString(N, K));
      
    }
}

