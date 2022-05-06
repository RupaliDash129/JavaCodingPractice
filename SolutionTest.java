package HackerRank;

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

public class SolutionTest {


    // Complete the getSequenceSum function below.
    static long getSequenceSum(int i, int j, int k) {
        int m,n,sum1=0;
        int sum2 = 0;
        for(m=i;m<=j;m++)
           {
           sum1=sum1+m;
           }
           sum2=sum1;
           for(n=j;n>k;n--);
           {
        	   sum2=sum2+n;
           }

           return sum2;

    
}
    
    
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int i = Integer.parseInt(bufferedReader.readLine().trim());

        int j = Integer.parseInt(bufferedReader.readLine().trim());

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        long res = getSequenceSum(i, j, k);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
