package DSHackerRank;
import java.util.Scanner;

public class ArrayManipulation {
	
    
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        
               
        for(int a0 = 0; a0 < m; a0++){
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            
            arr[a-1]+=k;
            if(b<n) arr[b]-=k;
           // System.out.println(arr[a-1]);
        }
        int max = 0;
        int temp = 0;
        for(int i = 0; i < n; i++)
        {
           temp += arr[i];
          if(max<temp)
              max = temp;
          //  System.out.println(arr[i]);
        }
        System.out.println(max);
        in.close();
    }
}
