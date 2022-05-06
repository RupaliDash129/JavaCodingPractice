package geeksforGeeks;

import java.util.HashSet;

public class RemoveDuplicateFromLinkedList {

	static class node {
		int val;
		node next;

		public node(int val) {
			this.val = val;
		}
	}
	static void removeDuplicate(node head) {
		HashSet<Integer> hs = new HashSet<>();
		node current = head;
		node prev = null;
		while (current != null) {
			int curval = current.val;
			if (hs.contains(curval)) {
				prev.next = current.next;
			} else {
				hs.add(curval);
				prev = current;
			}
			current = current.next;
		}
	}

	static void printList(node head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		node start = new node(2);
		start.next = new node(5);
		start.next.next = new node(7);
		start.next.next.next = new node(9);
		start.next.next.next.next = new node(9);
		start.next.next.next.next.next = new node(9);
		start.next.next.next.next.next.next = new node(17);

		System.out.println("Linked list before removing duplicates :");
		printList(start);

		removeDuplicate(start);

		System.out.println("\nLinked list after removing duplicates :");
		printList(start);
	}
}
