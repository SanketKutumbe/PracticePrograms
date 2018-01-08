//package StackImplement;
//
//import java.util.*;
//
//class StackNode
//{
//	int val;
//	int curMax = 0;
//	
//	StackNode(int val, int curMax)
//	{
//		this.val = val;
//		this.curMax = curMax;
//	}
//	
//	public String toString()
//	{
//		return curMax + " ";
//	}
//}
//
//public class MaxUsingStack {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Scanner sc = new Scanner(System.in);
//		int max = Integer.MIN_VALUE;
//		int n = sc.nextInt();
//		Stack<StackNode> st = new Stack<StackNode>();
//		
//		while( n > 0 )
//		{
//			int a = sc.nextInt();
//			if( a == 1)
//			{
//				int val = sc.nextInt();
//				max = (!st.isEmpty())?(st.peek().curMax) : Integer.MIN_VALUE;
//				st.push(new StackNode(val, Math.max(max, val)));
//			}
//			else if( a == 2 )
//			{
//				if(st.isEmpty())
//				{
//					System.out.println(Integer.MIN_VALUE);
//					break;
//				}
//				st.pop();
//				
//			}
//			else if( a == 3 )
//			{
//				System.out.println(st.peek().toString());
//			}
//			n--;
//		}
//	}
//
//}
