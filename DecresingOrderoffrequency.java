package GeeksforGeeks;

import java.util.ArrayList;
import java.util.List;

public class DecresingOrderoffrequency {
	public static void main(String[] args) {
		String str = "RRRRRUUUUUUPPPPAAAALLLLLLIIIIII";
		printChar(str);
		
	}

	public static void printChar(String str) {
		@SuppressWarnings("unchecked")
		List<Character>[] arr = new List[str.length() + 1];
		for (int i = 0; i <= str.length(); i++) {

			arr[i] = new ArrayList<>();
		}
		int n = 256;
		int[] freq = new int[n];

		for (int i = 0; i < str.length(); i++) {
			freq[(char) str.charAt(i)]++;
		}

		for (int i = 0; i <n ; i++) {
			if (freq[i] > 0) {

				arr[freq[i]].add(0, (char) (i));
			}
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			if (!arr[i].isEmpty()) {
				for (char ch : arr[i]) {
					System.out.println(ch + " " + i);
				}
			}
		}
	}
}
