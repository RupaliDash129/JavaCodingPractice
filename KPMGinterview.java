
public class KPMGinterview {
	static boolean isVowel(char ch) {
		
		return (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'
				||ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
	}

	static int countVowels(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++)
			
			if (isVowel(str.charAt(i))) 
				++count;
		return count;
	}

	public static void main(String args[]) {

		String str = "Rupali Aparajita dash";

		System.out.println(countVowels(str));
	}
}
