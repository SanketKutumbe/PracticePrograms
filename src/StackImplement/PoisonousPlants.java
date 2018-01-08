package StackImplement;

import java.util.Stack;

public class PoisonousPlants {

	
	
	//Executing all but 4 test cases
	
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] input = {6, 5, 8, 4, 7, 10, 9};
Stack<Integer> stack = new Stack<Integer>();
        
		int count = 0;
		int maxCount = 0;
		int prev;
        int flag = 0;
		
        stack.push(input[0]);
		prev = stack.peek();
		
		for(int i = 1; i < input.length; i++)
		{
           
			if(stack.peek() < input[i])
			{
               
				if(count == 0)
                {
                    count++;                
                }   
				else 
				{
                   
					if( input[i] <= input[i-1] )
					{
                        if( flag == 0)
                        {
                            flag = 1;
                            prev = input[i];
                        }
						if( input[i] <= prev )
                        {
                            prev = input[i];
                            count++;
                        }
                        
					}
				}
                
                
			}
			else
			{
				count = 0;
				stack.push(input[i]);
                flag = 0;
			}
            
            if(maxCount < count)
					maxCount = count;
		}
        
		
		System.out.println(maxCount - 1);
	}

}
