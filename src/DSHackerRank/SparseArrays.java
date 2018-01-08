package DSHackerRank;
import java.util.Scanner;

public class SparseArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp1 = n;
		int i = 0;
		String[] sb = new String[n];
		
		while( n > 0 )
		{
			sb[i] = sc.next();
			n--;
			i++;
		}
		int m = sc.nextInt();
		int temp2 = m+1;
		i = 0;
		String[] sb2 = new String[m];
		
		while( m > 0 )
		{
			sb[i] = sc.next();
			m--;
			i++;
		}
		
		int count = 0;
		
		for(i = 0; i < temp2; i++)
		{
			count = 0;
			System.out.println(sb2[i]);
			for(int j = 0; j < temp1; j++)
			{
				if(sb2[i] == sb[j])
					count++;
			}
			//System.out.println(count);
		}
	}

}
