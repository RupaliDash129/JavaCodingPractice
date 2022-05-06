package GeeksforGeeks;

import java.util.Arrays;
import java.util.List;

public class RemoveVowelfromString {

	public String remVowel(String str) {
		Character vowels[] = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

		List<Character> list = Arrays.asList(vowels);

		StringBuffer sb = new StringBuffer(str);

		for (int i = 0; i < sb.length(); i++) {

			if (list.contains(sb.charAt(i))) {
				sb.replace(i, i + 1, "");
				i--;
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		String S = "RuuuuuPPPPaaaaaaaLLiiii";
		RemoveVowelfromString v = new RemoveVowelfromString();
		System.out.println(v.remVowel(S));
	}

}
