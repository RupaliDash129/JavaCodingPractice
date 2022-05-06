package geeksforGeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class solutionjava {

	public void solution(String S) {

		Integer[] charCounts = new Integer[26];
		Arrays.fill(charCounts, 0);

		for (int i = 0; i < S.length(); i++) {
			int index = S.charAt(i) - 'a';
			int count = charCounts[index];
			charCounts[index] = count + 1;
		}

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < charCounts.length; i++) {
			if (charCounts[i] > 0)
				list.add(charCounts[i]);
		}

		Collections.sort(list, Collections.reverseOrder());

		Integer[] counts = list.toArray(new Integer[list.size()]);

		int deletions = 0;

		for (int i = 0; i < counts.length - 1; i++) {
			for (int j = i + 1; j < counts.length; j++) {
				if (counts[i] > 0 && counts[i] == counts[j]) {
					int count = counts[j];
					counts[j] = count - 1;
					deletions++;
				} else
					break;
			}
		}
		System.out.println("Given String: " + S + ", Minimum Deletion: " + deletions);
	}

	public static void main(String[] args) {
		solutionjava m = new solutionjava();
		Scanner sc = new Scanner(System.in); // System.in is a standard input stream
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		m.solution(str);
	}
}