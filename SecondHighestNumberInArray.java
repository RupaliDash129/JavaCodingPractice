package javaString;

public class SecondHighestNumberInArray {
	public static void main(String[] args) {
		int arr[] = { 100, 14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
		int first = 0;
		int second = 0;
		int third = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			} else if (arr[i] > second) {
				third = second;
				second = arr[i];

			}
		}

		System.out.println("largest number is:" + first);
		System.out.println("Second largest number is:" + second);

	}
}