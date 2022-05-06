package javaString;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class DuplicateCharacters {
//	public static void main(String[] args) {
//		String S ="geeksforgeeks";
//		char[] ch = S.toCharArray();		
//				
//		int n = ch.length;
//	    
//		int index = 0;
//		
//		for (int i = 0; i < n; i++) {
//
//			int j;
//			for (j = 0; j < i; j++) {
//				if (ch[i] == ch[j]) {
//					break;
//				}
//			}
//
//			if (j == i) {
//				ch[index++] = ch[i];
//			}
//			
//			String.valueOf(Arrays.copyOf(ch, index));
//		}
//		System.out.println(ch);
//	}}
	public static void main(String[] args) {
		String S = "geeksfor geeks";
		char ch[] = S.toCharArray();
		int n = ch.length;

		Set<Character> set = new LinkedHashSet<>(n - 1);

		for (char x : ch)
			set.add(x);

		for (char x : set)
			System.out.print(x);
		
		set.iterator();
		
		
	}
}
