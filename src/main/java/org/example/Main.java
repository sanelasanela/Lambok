package org.example;

import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(1, "sanela", "muenchen", "A");
        Student student2 = new Student(2, "Basel", "hamburg", "B");

        Teacher teacher1 = new Teacher(3, "FLorian", "Java");

        List<Student> studenti = new ArrayList<>();
        studenti.add(student1);
        studenti.add(student2);

      Course course = new Course(6, "C++", teacher1, studenti);


        System.out.println(studenti);
        System.out.println(teacher1);
    }
}