package geeksforGeeks;

public class Smalleststring {
	static int stringReduction(String str) {
		int n = str.length();

		int count[] = new int[3];
		for (int i = 0; i < n; ++i) {
			count[str.charAt(i) - 'a']++;
		}

		if (count[0] == n || count[1] == n || count[2] == n) {
			return n;
		}

		if ((count[0] % 2) == (count[1] % 2) && (count[1] % 2) == (count[2] % 2)) {
			return 2;
		}

		return 1;
	}

	public static void main(String[] args) {
		String str = "abcbbaacb";
		System.out.println(stringReduction(str));
	}
}
