import java.util.Scanner;

public class CountTypesOfCharacters 
{	
	public static void main(String[] args)
	{
		System.out.println("Lavdu kela cmd open");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String str;
		while(n > 0)
		{
			sc.next();
			str = sc.nextLine();
			System.out.println("Gandu");
			System.out.println(str);
			System.out.println("Execute kar bhosadichya");
			count(str.toCharArray());
			n--;
		}
	
	}
	static void count(char[] string)
	{		
		int upper = 0;
		int lower = 0;
		int numerics = 0;
		int special = 0;
		
		//System.out.println(string);
		
		for(int i = 0; i < string.length; i++)
		{
			//System.out.println(string[i]);
			
			if(string[i]>=65&&string[i]<92)
				upper++;
			else if(string[i]>=97&&string[i]<123)
				lower++;
			else if(string[i]>=48&&string[i]<58)
				numerics++;
			else
				special++;
		}
		System.out.println(upper);
		System.out.println(lower);
		System.out.println(numerics);
		System.out.println(special);
	}
}
