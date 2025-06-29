package javaHate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SimpleMyJava {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(90, 20, "Amit"));
        students.add(new Student(90, 20, "Ravi"));
        students.add(new Student(90, 19, "Zara"));
        students.add(new Student(80, 21, "John"));


      /* students.sort(Comparator.comparingInt( (Student s)-> s.age)
               .reversed()
               .thenComparing(s->s.name).thenComparing(s->s.marks));*/


       students.sort(Comparator.comparingInt( (Student s)->s.age)
               .reversed().thenComparing(s->s.name).thenComparing(s->s.marks));

       for (var data: students)
        System.out.println(data+" ");
    }
}

