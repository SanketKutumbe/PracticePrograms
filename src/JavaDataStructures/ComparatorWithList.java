package JavaDataStructures;

import java.util.*;

class Checkers implements Comparator<Student2>
{
    public int compare(Student2 a, Student2 b)
    {
        if( a.getCgpa() == b.getCgpa() )
        {
            if( a.getFname().equals(b.getFname()) )
                return (a.getId() > b.getId() ) ? 1 : -1;
            return a.getFname().compareTo(b.getFname());
        }
        return (a.getCgpa() > b.getCgpa()) ? -1 : 1;
    }
}

public class ComparatorWithList
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student2> studentList = new ArrayList();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student2 st = new Student2(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Checkers check = new Checkers();

        Collections.sort(studentList, check);

        for(Student2 st: studentList){
            System.out.println(st.getFname());
        }
    }
}

class Student2{
    private int id;
    private String fname;
    private double cgpa;
    public Student2(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

