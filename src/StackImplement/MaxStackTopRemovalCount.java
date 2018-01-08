package StackImplement;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaxStackTopRemovalCount {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            int[] b = new int[m];
            for(int b_i=0; b_i < m; b_i++){
                b[b_i] = in.nextInt();
            }
            
           try
           {
                System.out.println(findMaxCount(a,b,n,m,x));
           }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
   
    static int findMaxCount(int[] a, int[] b, int n, int m, int x)
    {
        Stack<Integer> st1 = new Stack<Integer>();
        Stack<Integer> st2 = new Stack<Integer>();
        
        for(int i = n-1; i >= 0; i--)
            st1.push(a[i]);
        for(int i = m-1; i >= 0; i--)
            st2.push(b[i]);
        
        if( st1.peek() > x && st2.peek() > x ) return 0;
        
        int count = 0;
        long sum = 0;
        int i = 0, j = 0;
        
        while( (!st1.isEmpty() && ( sum + st1.peek() <= x ) ))
        {
            sum+=st1.pop();
            i++;
        }
        count = i;
              
        while( j < m )  
        {
            sum += st2.pop();
            j++;
            
            while( i > 0 && sum > x )
            {
                sum = sum - a[--i];
            }
            
            if( (sum <= x) && i+j > count ) count = i + j;
        }
        
        return count;
    }
}
