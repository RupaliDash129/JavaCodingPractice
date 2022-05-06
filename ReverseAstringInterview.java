package geeksforGeeks;

public class ReverseAstringInterview {

	public static void main(String[] args) {
		String S = "Rupali dASH";
        char[] ch = S.toCharArray();
        int i=0;
        int j = ch.length - 1;
 
        for (i = 0; i < j; i++, j--) {
            char c = ch[i];
            ch[i] = ch[j];
            ch[j] = c;
          
        }
 
        for (char c : ch)
            System.out.print(c);
        
        	
        }
	}


