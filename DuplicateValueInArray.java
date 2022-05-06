package interviewQuestion;

public class DuplicateValueInArray {
	
	public static void main(String args[])
    {
        int arr[] = { 0, 4, 3, 2, 7, 8, 2, 3, 1 };
  int i=0;
  int j =arr.length;
        for ( i = 0; i < j; i++) {
            arr[arr[i] % j] = arr[arr[i] % j] + j;
        }
        System.out.println("The repeating elements are : ");
        for (i = 0; i < j; i++) {
            if (arr[i] >= j * 2) {
                System.out.println(i);
            }
        }
    }
}


