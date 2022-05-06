
public class ReverseAIntArray {
	 static void reverseArray(int arr[], int n)
	    {
	        int[] arr1 = new int[n];
	        int j = n;
	        for (int i = 0; i < n; i++) {
	            arr1[j - 1] = arr[i];
	            j = j - 1;
	        }
	        for (int k = 0; k < n; k++) {
	            System.out.println(arr1[k]);
	        }
	    }
	  
	    public static void main(String[] args)
	    {
	        int [] arr = {10, 20, 30, 40, 50};
	        reverseArray(arr, arr.length);
	    }
	}
