package practice;

public class SubArraySum {
	public int subArraySum(int arr[], int n, int sum)
	{
	    int curr_sum, i, j;
	 
	    // Pick a starting point
	    for (i = 0; i < n; i++)
	    {
	        curr_sum = arr[i];
	 
	        // try all subarrays starting with 'i'
	        for (j = i+1; j <= n; j++)
	        {
	            if (curr_sum == sum)
	            {
	                System.out.println("Sum found between indexes");
	                return 1;
	            }
	            if (curr_sum > sum || j == n)
	                break;
	           curr_sum = curr_sum + arr[j];
	        }
	    }
	 
	    System.out.println("No subarray found");
	    return 0;
	}

}
