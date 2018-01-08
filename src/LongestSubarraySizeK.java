import java.util.Scanner;

public class LongestSubarraySizeK {

	public static void main(String[] args) 
	{
/*		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0 ; i < n; i++ )
		{
			arr[i] = sc.nextInt();
		}
*/
		int arr[] = {-5, 8, -14, 2, 4, 12};
	    int k = -5;
		longestSumSubarray(arr, k);
	}

	private static void longestSumSubarray(int[] arr, int k) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int count = 0;
		int sum = 0;
		int initial = 0;
		int max = 0;
		
		for(int i = 0; i < n; i++)
		{
			sum += arr[i];
			
			if(sum <= k)
			{				
				count++;

			}
			else
			{
				sum -= arr[initial];
				initial++;
			}

			if( count > max )
				max = count;
		}
		System.out.println(max);
	}

}
