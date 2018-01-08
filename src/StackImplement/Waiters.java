package StackImplement;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Waiters {
	
	 public static List primeList(int q)
     {
         int count = 1, flag = 0;
         List<Integer> list = new ArrayList<Integer>();
         if(count <= q) list.add(2);


         for(int i = 3; count < q; i++)
         {
             flag = 0;
             for(int j = 2; j < i; j++)
             {
                 if( i % j == 0 )
                 {
                     flag = 1;
                     break;
                 }

             }
             if(flag == 0)
             {
                 count++;
                 list.add(i);
             }
         }
       
         return list;            
     }

	public static void main(String[] args) {

		int[] input = {3,4,7,6,5};
		int q = 1;
		
		Stack<Integer> stack = new Stack<Integer>();
        int count = 1;
        List<Integer> list = primeList(q);
        List<Integer> inputList = new ArrayList<Integer>();
        
        
        for(int i = 0; i < input.length; i++)
        {
        	inputList.add(input[i]);
        }
        
        Stack<Integer> st = new Stack<Integer>();
        while(!list.isEmpty() && (!inputList.isEmpty()))
        {
            int n = list.remove(0);
            
            for(int i = 0; i < inputList.size(); i++)
            {
            	if( inputList.get(i) % n == 0 )
            		System.out.println(inputList.remove(i));
            }
        }
        for(int i = 0; i < inputList.size();)
        {
        	System.out.println(inputList.remove(i));
        }
        
	}

}
