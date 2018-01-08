package StackImplement;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets 
{
	static String isBalanced(String s) {
        // Complete this function
        int count = 0;
        Stack<Character> st = new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++)
        {
            if( s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[' ) 
                st.push(s.charAt(i));
      
            else
            {
                if(st.isEmpty()) 
                {
                    count = 1;
                    break;
                }
                if ( ( s.charAt(i) == ')' && st.peek() == '(' ) || ( s.charAt(i) == ']' && st.peek() == '[' ) || ( s.charAt(i) == '}' && st.peek() == '{' ))
                   
                {
                    st.pop();
                }
                else
                {
                    count = 1;
                    break;
                }
                
            }
            
        }
       if(count == 1 || (!st.isEmpty())) return "NO"; 
        return "YES";
       
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }

}
