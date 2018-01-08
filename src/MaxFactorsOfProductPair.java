import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class MaxFactorsOfProductPair {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Opening cmd\n");
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		Integer[] input = new Integer[cases];
		
		for(int i = 0; i < cases; i++)
		{
			input[i] = sc.nextInt();
		}
		
		Integer[] multi = null;
		int counter = 0;
		
		for(int i = 0; i < cases; i++)
		{
			for(int j = 1; (j != i) && (j < cases);j++)
			{
				multi[counter] = input[i]*input[j];
				counter++;
			}
		}
		totalFactors(multi,cases);	
		}
		
	public static int totalFactors(Integer[] input, int cases)
	{
		int max = 0;
		int count = 0;
		int sum = 0;
		int c;
		
		for(int i = 0; i < cases; i++)
		{
			//c = input[i];
			
			count = 0;
			sum = 0;
			while(input[i]%2==0)
			{
				count++;
				input[i]/=2;
			}
			sum = count + 1;
			
			
			for(int j = 3; j <= Math.sqrt(input[i]); j+=2)
			{
				count = 0;
			
				while(input[i]%j==0)
				{
					input[i]/=j;
					count++;
				}
			
				sum*=(count+1);
			
			}
			if(input[i]!=1)
			{
				sum*=2;
			}
			if(max<sum)
				max = sum;
			
		}
		return sum;
	}
	}

