/*For understanding this program, please read ComparatorWithList.java program to get better understanding*/
package JavaDataStructures;

import java.util.*;

/*
class Check implements Comparator<Student>
{

    public int compare(Student a, Student b)
    {
        if( a.getCGPA() == b.getCGPA() )
        {
            if( a.getName().equals(b.getName()) ) return (a.getId() > b.getId()) ? 1: -1;
            else return a.getName().compareTo(b.getName());
        }
        else return (a.getCGPA() > b.getCGPA() ? -1: 1);
    }
}*/

class Priorities
{
    List<Student> getStudents(List<String> events)
    {
        PriorityQueue<Student> pq = new PriorityQueue<>((Comparator.comparing(Student::getCGPA)).reversed().thenComparing(Student::getName).thenComparing(Student::getId));
        List<Student> list = new ArrayList();
        Iterator<String> iterator = events.listIterator();
        while( iterator.hasNext() )
        {
            String[] str = iterator.next().split("\\s");
            if( str[0].equals("ENTER") )
            {
                pq.add(new Student( Integer.parseInt(str[3]), str[1], Double.parseDouble(str[2])));

            }
            else
            {
                pq.poll();
            }

        }
        list.addAll(pq);
        /* Following is not the efficient approach */
        /*
        List<Student> list = new ArrayList();
        Iterator<String> i = events.listIterator();
        while(i.hasNext())
        {
            String[] str = i.next().split("\\s");

            if( str[0].equals("ENTER"))
                list.add(new Student( Integer.parseInt(str[3]), str[1], Double.parseDouble(str[2])));
            else
            {
                Collections.sort(list, new Check());
                list.remove(0);
            }
        }
        Collections.sort(list, new Check());
        */
        return list;

    }
}
class Student
{
    private int id;
    private String name;
    private double cgpa;

    Student(int id, String name, double cgpa)
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
public class AdvImplementationOfListComparator
{
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}