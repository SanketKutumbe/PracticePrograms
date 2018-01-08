import java.util.*;
import java.lang.*;
import java.io.*;

class CountDigit {
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n; // Count test cases
		n = sc.nextInt();
		int number; //input
		for(int i = 0; i < n; i++)
		{
		    number = sc.nextInt();
		    System.out.println(count(number));
		}
	}
	
	static int count(int number)
	{
	    int digit_count = 0;
	    int copy_number = number;
	    
	    while(copy_number != 0)
	    {
	        if((copy_number%10!=0)&&(number%(copy_number%10)==0))
	        digit_count++;
	        copy_number/=10;
	    }
	    return digit_count;
	}
}