package JavaDataStructures;

import java.util.*;

class PrioritIes
{
    List<Stud> getStuds(List<String> events)
    {
        PriorityQueue<Stud> pq = new PriorityQueue<>(
                Comparator.comparing(Stud::getCGPA).reversed()
                        .thenComparing(Stud::getName)
                        .thenComparing(Stud::getId));

        List<Stud> list = new ArrayList();
        Iterator<String> iterator = events.listIterator();
        while( iterator.hasNext() )
        {
            String[] str = iterator.next().split("\\s");
            if( str[0].equals("ENTER") )
            {
                pq.add(new Stud( Integer.parseInt( str[3] ), str[1], Double.parseDouble( str[2] ) ) );
//                System.out.println( Integer.parseInt( str[3] ) +", "+ str[1] +", "+ Double.parseDouble( str[2] ) );
            }
            else
            {
                pq.poll();
            }

        }

        /**** Iterator for Priority queue does not guarantee to traverse according to priority. ***/
        /*
        Iterator<Stud> i = pq.iterator();

        while( i.hasNext() )
        {
            list.add(i.next());
        }*/

        while( !pq.isEmpty() )
        {
            list.add( pq.poll() );
        }

        return list;
    }
}
class Stud
{
    private int id;
    private String name;
    private double cgpa;

    Stud(int id, String name, double cgpa)
    {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public double getCGPA()
    {
        return cgpa;
    }

}

public class PriorityQueueImplementation
{
    private final static Scanner scan = new Scanner(System.in);
    private final static PrioritIes priorities = new PrioritIes();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Stud> students = priorities.getStuds(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Stud st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
