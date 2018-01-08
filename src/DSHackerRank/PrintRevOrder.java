package DSHackerRank;
import java.io.*;
import java.util.*;

public class PrintRevOrder {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try
        {
        	Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            StringBuffer arr = new StringBuffer();
            while(n>0)
            {
            	arr.append(sc.nextInt());
            	n--;
                if(n==0)
                    break;
                arr.append(" ");
            }
            System.out.println(arr.reverse());         
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
}