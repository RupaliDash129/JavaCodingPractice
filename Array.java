package javaString;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

class Result {
	
	public static int minimumMoves(List<Integer> arr1, List<Integer> arr2) {
	    // Write your code here
	    int n=0;
	   
	     Map<Integer, Integer> hash = new Map<Integer,
	                                           Integer>();
	         
	        for (int i=0; i<n; i++)
	            if(hash.containsKey(arr1)
	                hash.put(arr[i], hash.get(arr[i])+1);
	            else hash.put(arr[i], 1);
	         
	        // find the max frequency
	        int max_count = 0;
	        Set<Integer> s = hash.keySet();
	         
	        for (int i : s)
	            if (max_count < hash.get(i))
	                max_count = hash.get(i);
	      
	        // return result
	        return (n - max_count);
	    
	    }

	}
	public class Array {
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int arr1Count = Integer.parseInt(bufferedReader.readLine().trim());

	        List<Integer> arr1 = IntStream.range(0, arr1Count).mapToObj(i -> {
	            try {
	                return bufferedReader.readLine().replaceAll("\\s+$", "");
	            } catch (IOException ex) {
	                throw new RuntimeException(ex);
	            }
	        })
	            .map(String::trim)
	            .map(Integer::parseInt)
	            .collect(toList());

	        int arr2Count = Integer.parseInt(bufferedReader.readLine().trim());

	        List<Integer> arr2 = IntStream.range(0, arr2Count).mapToObj(i -> {
	            try {
	                return bufferedReader.readLine().replaceAll("\\s+$", "");
	            } catch (IOException ex) {
	                throw new RuntimeException(ex);
	            }
	        })
	            .map(String::trim)
	            .map(Integer::parseInt)
	            .collect(toList());

	        int result = Result.minimumMoves(arr1, arr2);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}
