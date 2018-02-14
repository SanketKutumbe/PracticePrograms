package JavaDataStructures;

import java.util.*;

public class JavaDeque
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        //Efficient Way
        Set s = new HashSet();
        int max = 0;
        for(int i = 0; i < n; i++)
        {
            int num = in.nextInt();
            deque.add(num);
            s.add(num);
            if(s.size() > max)
            {
                max = s.size();
            }

            if(deque.size() == m)
            {
                if( s.size() > max ) max = s.size();
                int temp = (int) deque.removeFirst();
                if( !deque.contains(temp)) s.remove(temp);
            }
        }

        //Inefficient way
//        int max = 0, uncommon = 0;
//        int count = 0;
//        int temp;
//        for (int i = 0; i < n; i++)
//        {
//            int num = in.nextInt();
//
//            if(count == m)
//            {
//                count--;
//                if( uncommon > max)
//                    max = uncommon;
//
//                temp = (int) deque.peekFirst();
//                deque.removeFirst();
//
//                if(!deque.contains(temp))
//                    uncommon--;
//
//                //System.out.println(uncommon);
//
//
//            }
//
//
//            if(!deque.contains(num))
//                uncommon++;
//
//            deque.add(num);
//
//            count++;
//        }
//        System.out.println(max);
    }
}
