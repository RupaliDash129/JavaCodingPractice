package geeksforGeeks;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    public static long getSubsequenceCount(String s1, String s2) {
    // Write your code here
    
     
	int m = s1.length();
	int n = s2.length();

	int lookup[][] = new int[m + 1][n + 1];

	for (int i = 0; i <= n; ++i)
		lookup[0][i] = 0;

	for (int i = 0; i <= m; ++i)
		lookup[i][0] = 1;

	for (int i = 1; i <= m; i++) {
		for (int j = 1; j <= n; j++) {

			if (s1.charAt(i - 1) == s2.charAt(j - 1))
				lookup[i][j] = lookup[i - 1][j - 1] + lookup[i - 1][j];

			else

				lookup[i][j] = lookup[i - 1][j];
		}
	}

	return lookup[m][n];
    }

   
    }


public class SSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = bufferedReader.readLine();

        String s2 = bufferedReader.readLine();

       
		long result = Result.getSubsequenceCount(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
