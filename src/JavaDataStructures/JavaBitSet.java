/* This program illustrates the working of BitSet class introduced in Java 7 or before that.
*
    AND <set_name>  <set_name>
    OR  <set_name>  <set_name>
    XOR <set_name>  <set_name>
    FLIP <set_name> <index>
    SET <set_name> <index>

*/
package JavaDataStructures;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Scanner;

public class JavaBitSet
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        BitSet bs = new BitSet(n);

        BitSet bs2 = new BitSet(n);

        while( m > 0 )
        {
            StringBuilder sb = new StringBuilder(sc.next());
            int a = sc.nextInt();
            int b = sc.nextInt();

            if( sb.toString().equals("AND") || sb.toString().equals("OR") || sb.toString().equals("XOR") )
            {
                if( sb.toString().equals("AND"))
                {
                    if ((a == 1)) bs.and(bs2);
                    else bs2.and(bs);
                }
                else if( sb.toString().equals("OR") )
                {
                    if ((a == 1)) bs.or(bs2);
                    else bs2.or(bs);
                }
                else
                {
                    if ((a == 1)) bs.xor(bs2);
                    else bs2.xor(bs);
                }
            }
            else
            {
                if( sb.toString().equals("FLIP") )
                {
                    if ((a == 1)) bs.flip(b);
                    else bs2.flip(b);
                }
                else
                {
                    if ((a == 1)) bs.set(b);
                    else bs2.set(b);
                }
            }
            m--;
            System.out.println( bs.cardinality() + " " + bs2.cardinality());
        }
    }
}
