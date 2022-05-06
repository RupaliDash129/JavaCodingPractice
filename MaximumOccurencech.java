package geeksforGeeks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaximumOccurencech {
	static void print_N_mostFrequentCharacter(String S, int n, int k) {

		Map<String, Integer> map = new HashMap<String, Integer>();
        char[] ch = S.toCharArray();
		for (int i = 0; i < n; i++) {

			map.put(S, map.getOrDefault(ch[i], 0) + 1);
		}

		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				if (o1.getValue() == o2.getValue())
					return o2.getKey() - o1.getKey();
				else
					return o2.getValue() - o1.getValue();
			}
		});

		for (int i = 0; i < k; i++)
			System.out.println(list.get(i).getKey());
	}

	public static void main(String[] args) {
		String S = "Ruuuupppalllii";
		int n = S.length();
		int k = 2;

		print_N_mostFrequentCharacter(S, n, k);
	}
}
