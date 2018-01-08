package DSHackerRank;
import java.util.Scanner;

public class HourGlassMatrix {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			Scanner sc = new Scanner(System.in);
			int[][] arr = new int[6][6];
			for(int i = 0; i < 6; i++)
			{
				for(int j = 0; j < 6; j++)
				{
					arr[i][j] = sc.nextInt();
				}
			}
			
			int sum = arr[0][0]+arr[0][1]+arr[0][2]+arr[1][1]+arr[2][0]+arr[2][1]+arr[2][2];
			int temp;
			
			for(int x = 0; x <= 3; x++)
			{
				for(int i = 0; i <= 3; i++)
				{
					temp = arr[x][i]+arr[x][i+1]+arr[x][i+2]; //First row
					temp += arr[x+1][i+1]; //Second row
					temp += arr[x+2][i]+arr[x+2][i+1]+arr[x+2][i+2]; //Third row
					
					if(sum < temp)
						sum = temp;
				}
			}
			
			System.out.println(sum);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
