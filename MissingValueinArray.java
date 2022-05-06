package interviewQuestion;

public class MissingValueinArray {
	
	public static int
    findmissiingNumbers(int[] nums)
    {
        int n=nums.length;
        int sum=((n+1)*(n+2))/2;
        for(int i=0;i<n;i++)
          sum-=nums[i];
        return sum;
    }
    public static void main(String[] args)
    {
        int[] a = { 1, 2,3, 4, 5,6};
        System.out.println(findmissiingNumbers(a));
    }
}

