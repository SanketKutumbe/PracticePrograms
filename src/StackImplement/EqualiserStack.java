package StackImplement;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class StackNode
{
    int val;
    int curSum;
    StackNode(int val, int curSum)
    {
        this.val = val;
        this.curSum = curSum;
    }
}

public class EqualiserStack {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int h1[] = new int[n1];
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
        }
        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
        }
        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
        }
        
        System.out.println(heightEqualiser(h1, h2, h3));
    }
    
    static int heightEqualiser(int[] h1, int[] h2, int[] h3)
    {

        int height1 = 0, height2 = 0, height3 = 0;
        Stack<StackNode> st1 = new Stack<StackNode>();
        Stack<StackNode> st2 = new Stack<StackNode>();
        Stack<StackNode> st3 = new Stack<StackNode>();
        
        
        for(int i =  h1.length - 1; i >=0 ; i--)
        {
             height1 += h1[i];
             st1.push(new StackNode(h1[i], height1));
        }   
        
        for(int i =  h2.length - 1; i >=0 ; i--)
        {
             height2 += h2[i];
             st2.push(new StackNode(h2[i], height2));
        }   
        for(int i =  h3.length - 1; i >=0 ; i--)
        {
             height3 += h3[i];
             st3.push(new StackNode(h3[i], height3));
        }   
        
       
        
        while( (!st1.isEmpty()) && (!st2.isEmpty()) && (st1.peek().curSum != st2.peek().curSum) )
        {
            if((st1.peek().curSum > st2.peek().curSum))
                st1.pop();
            else
                st2.pop();
           
        }
        

        
        while( (!st3.isEmpty()) && (!st2.isEmpty()) && (st3.peek().curSum != st2.peek().curSum) )
        {
            if( (st3.peek().curSum > st2.peek().curSum) )
                st3.pop();
            else
                st2.pop();
           
        }
        
        if( (st1.isEmpty()) || (st2.isEmpty()) || (st3.isEmpty()) )
            return 0;
        
        return st1.peek().curSum;
    }

    /*
     * public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();

      Stack<Integer> stack1 = new Stack<Integer>();
      Stack<Integer> stack2 = new Stack<Integer>();
      Stack<Integer> stack3 = new Stack<Integer>();

      int h1 = 0;
      int[] h1Array = new int[n1];
      for(int h1_i=0; h1_i < n1; h1_i++){
          h1Array[h1_i] = in.nextInt();
          h1 += h1Array[h1_i];

      }
      for(int i=0;i<n1;i++){
          stack1.push(h1Array[n1-1-i]);
      }

      int h2 = 0;
      int[] h2Array = new int[n2];
      for(int h2_i=0; h2_i < n2; h2_i++){
          h2Array[h2_i] = in.nextInt();
          h2 += h2Array[h2_i];
      }
       for(int i=0;i<n2;i++){
          stack2.push(h2Array[n2-1-i]);
      }

      int h3 = 0;
      int[] h3Array = new int[n3];
      for(int h3_i=0; h3_i < n3; h3_i++){
          h3Array[h3_i] = in.nextInt();
          h3 += h3Array[h3_i];
      }
       for(int i=0;i<n3;i++){
          stack3.push(h3Array[n3-1-i]);
      }

    while(h1!=h2 || h1!=h3 ){
        if(stack1.isEmpty() || stack2.isEmpty() || stack3.isEmpty()){
            System.out.println(0);System.exit(0);
        }
        if(h1== findMax(h1, h2, h3)){
            h1 = h1 - stack1.peek();
            stack1.pop();
        } else if(h2== findMax(h1, h2, h3)){
            h2 = h2 - stack2.peek();
            stack2.pop();
        } else{
            h3 = h3 - stack3.peek();
            stack3.pop();
        }
    }
    System.out.println(h1);

}

private static int findMax(int h1, int h2, int h3) {
    return Math.max(Math.max(h1, h2), h3);
}

     */
}

