package GeeksforGeeks;

public class MinimumChToFormPallindrome {

	static int findMinInsertions(char str[], int m, int n) {

		if (m > n)
			return Integer.MAX_VALUE;
		if (m == n)
			return 0;
		if (m == n - 1)
			return (str[m] == str[n]) ? 0 : 1;

		return (str[m] == str[n])
				? findMinInsertions(str, m + 1, n - 1)
				: (Integer.min(findMinInsertions(str, m, n - 1), findMinInsertions(str, m + 1, n)) + 1);
	}

	public static void main(String args[]) {
		String str = "abcde";
		System.out.println(findMinInsertions(str.toCharArray(), 0, str.length() - 1));
	}
}
