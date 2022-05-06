package interviewQuestion;

public class CharacterToArray {
	
	public static void main(String args[])
    {
        String str = "Rupali is a good girl and she is a automation testengineer also and a very beautiful person from heart";
  
      
        char[] ch = new char[str.length()];      
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
            System.out.println(ch[i]);
        }
  
    }
}
