package StackImplement;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<String>();
        stack.push(sb.toString());
        int count = 0;
        
        for(int i = 0; i < n; i++)
        {
        	int o = sc.nextInt();
        	
            switch(o)
            {
            	//append
            	case 1:
            		stack.push( sb.append(sc.next()).toString() );            		
            		break;
            	
            	//delete
            	case 2:

            		int index = sc.nextInt();
            		stack.push(sb.delete(sb.length() - index, sb.length() - 1).toString());
            		
            		break;
            	
            		//print
            	case 3: 
            		index = sc.nextInt();
            		System.out.println(sb.charAt(index - 1));
            		break;
            	
            	//undo
            	case 4:
            		if(!stack.isEmpty())
            			System.out.println(stack.pop());
            		break;
            }
        }
	}
}
