package geeksforGeeks;

import java.util.Arrays;
import java.util.Scanner;

class FrequencyCharacter {
	static boolean check(char s[]) {
		Arrays.sort(s);

		for (int i = 1; i < s.length; i++) {

			if (s[i] - s[i - 1] != 1)
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);

		str = sc.nextLine();

		if (check(str.toCharArray()) == true)
			System.out.println("Yes");
		else
			System.out.println("No");

	}
}
