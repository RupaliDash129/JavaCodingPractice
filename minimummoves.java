package HackerRank;

import java.util.List;
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

class minimummoves {
	 static int minMoves(int arr[], int n)
	    {
	        // Since we traverse array from end,
	        // extected item is initially n
	        int expectedItem = n;
	     
	        // Traverse array from end
	        for (int i = n - 1; i >= 0; i--)
	        {
	            // If current item is at its correct position,
	            // decrement the expectedItem (which also means
	            // decrement in minimum number of moves)
	            if (arr[i] == expectedItem)
	                expectedItem--;
	            System.out.println(arr[i]);
	        }
	     
	        return expectedItem;
	    }
	     
	    // Driver Program
	    public static void main (String[] args)
	    {
	        int arr[] = {5, 7, 4, 3, 2, 6, 1};
	        int n = arr.length;
	        System.out.println(minMoves(arr, n));
	       
	 
	    }
	}