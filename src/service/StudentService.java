package service;

import model.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void initializeStudents() {
        students.add(new Student(1,  "Adelya", 3.5));
        students.add(new Student(2,  "Alt", 4));
        students.add(new Student(3,  "Asksd", 1.9));
        students.add(new Student(4,  "Dsas", 1.2));
        students.add(new Student(5,  "Olasmd", 4));

        System.out.println("Student initialized");
    }

    public void removeLowGPA() {
        students.removeIf(student -> student.getGpa() < 2.0);
        System.out.println("Students with GPA < 2.0 removed");
    }

    public void findHighestGPA() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;}

        Student best = Collections.max(
                students,
                Comparator.comparingDouble(Student::getGpa));
        System.out.println("Highest GPA student:");
        System.out.println(best);
    }

    public void insertAtIndex() {
        if (students.size() >= 2) {
            students.add(2, new Student(6, "Ermek", 3.2));
            System.out.println("Student inserted at index 2 ✅");
        } else {
            System.out.println("Not enough students to insert.");
        }
    }

    public void printStudents() {
        System.out.println("\nStudents List:");

        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
