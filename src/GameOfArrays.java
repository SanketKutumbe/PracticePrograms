import java.util.*;

class MyException extends Exception
{
    
}
public class GameOfArrays {
    private int flag = 0;
    
    public static boolean canWin(int leap, int[] game) 
    {
        // Return true if you can win the game; otherwise, return false.
        boolean[] result = new boolean[game.length];
        int flag = 0;
        try
        {
            finish(leap, game, 0, result);
        }
        catch(MyException m)
        {
            flag++;            
        }
        finally
        {
            if(flag == 0)
           return false;
           else
           return true;
        }
    }
    public static void finish(int leap, int[] game, int index, boolean[] result) throws MyException
    {
    
        if( (index + leap) >= game.length )
            throw new MyException();

        
        if( game[index + 1] == 0 && result[index + 1] != true )
        {
            result[index + 1] = true;
            finish(leap, game, index + 1, result);
            result[index + 1] = false;
        }
            
        
        if( game[index + leap] == 0 && result[index + leap] != true )
        {
            result[index + leap] = true;
            finish(leap, game, index + leap, result);
            result[index + leap] = false;
        }
        
        if( game[index - 1] == 0 && result[index - 1] != true )
        {
            result[index - 1] = true;
            finish(leap, game, index - 1, result);
            result[index - 1] = false;
        }
        
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
