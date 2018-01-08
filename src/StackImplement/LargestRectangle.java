package StackImplement;

import java.util.Stack;
import java.util.Scanner;

public class LargestRectangle {

	static long largestRectangle(int[] input) 
	{
		
		Stack<Integer> st = new Stack<Integer>();
		st.push(Integer.MIN_VALUE);
		
		int top = 0;
		int i = 0;
		long area = 0, maxArea = 0;
		
		while( i != input.length )
		{
			if( input[i] >= st.peek() )
			{
				st.push(input[i]);
				i++;
				top++;
				
			}
			else
			{
				area = input[top] * ( i - top );
				//System.out.println(input[top]);
				st.pop();
				top--;
				if(area > maxArea)
					maxArea = area;
			}
		}

		return maxArea;
        
    }

    public static void main(String[] args) {
        
/*    	Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] h = new int[n];
        for(int h_i = 0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        
        long result = largestRectangle(h);
        System.out.println(result);
 
        in.close();
*/
    	int[] h = { 1,2,3,2,1 };
    	System.out.println(largestRectangle(h));
    }
}
