package PriorityQueue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Priorities {

    private PriorityQueue<Student> students;

    public List<Student> getStudents(List<String> events) {
        students = new PriorityQueue<Student>(Comparator.comparing(Student::getCgpa).reversed()
            .thenComparing(Student::getName)
            .thenComparing(Student::getId));
        for (String event : events) {
            String[] eventArr = event.split(" ");
            String eventType = eventArr[0];
            if (eventType.equals("ENTER")) {
                String name = eventArr[1];
                double cgpa = Double.parseDouble(eventArr[2]);
                int id = Integer.parseInt(eventArr[3]);
                Student st = new Student(id, name, cgpa);
                students.add(st);
            } else if (eventType.equals("SERVED")) {
                students.poll();
            }
        }

        List<Student> result = new ArrayList<Student>();
        while (!students.isEmpty()) {
            result.add(students.poll());
        }
        return result;
    }
}

class Student {

    private double cgpa;
    private int id;
    private String name;

    public Student(int id, String name, double cgpa) {
        super();
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public double getCgpa() {
        return this.cgpa;
    }

}

/**
12
ENTER John 3.75 50
ENTER Mark 3.8 24
ENTER Shafaet 3.7 35
SERVED
SERVED
ENTER Samiha 3.85 36
SERVED
ENTER Ashley 3.9 42
ENTER Maria 3.6 46
ENTER Anik 3.95 49
ENTER Dan 3.95 50
SERVED
 */

public class Solution {
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
