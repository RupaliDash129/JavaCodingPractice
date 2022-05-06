package HackerRank;

import java.io.*;

class Result {
	static int fizzBuzz(int n) {

		for (int i = 1; i <= n; i++)
			if (i % 15 == 0) {
				System.out.println("FizzBuzz" + "");
			} else if (i % 3 == 0) {
				System.out.println("Fizz" + "");
			} else if (i % 5 == 0) {
				System.out.println("Buzz" + "");
			} else {

				System.out.println(i + "");

			}
		return n;

	}
}

public class FizzBuzzSolutions {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		Result.fizzBuzz(n);

		bufferedReader.close();
	}
}
