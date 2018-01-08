
class Process
{
	int start, end;
	int profit;
	
	Process(int start, int end, int profit)
	{
		this.start = start;
		this.end = end;
		this.profit = profit;
	}
}
public class JobSequencingNew {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Process[] p = new Process[5];
		
		p[0] = new Process(0,2,100);
		p[1] = new Process(0, 1, 27);
		p[2] = new Process(0, 2, 25);
		p[3] = new Process(0, 1, 19);
		p[4] = new Process(0, 3, 15);
		
		boolean flag[] = new boolean[5];
		int result[] = new int[5];
		int totalProfit = 0;
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = p[i].end - 1; j >= p[i].start; j--)
			{
				if(flag[j] == false)
				{
					flag[j] = true;
					result[j] = i;
					totalProfit += p[i].profit;
					System.out.println(i+ " " +p[j].profit);
					break;
				}
			}
		}
		System.out.println(totalProfit);
	}

}
