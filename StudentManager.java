import java.util.ArrayList;
import java.util.Scanner;

import CustomExceptions.InvalidInputException;
import CustomExceptions.StudentNotFoundException;


public class StudentManager {
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Scanner sc) {
        System.out.print("Enter PRN: ");
        String prn = sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter DOB: ");
        String dob = sc.nextLine();
        System.out.print("Enter Marks: ");
        float marks = sc.nextFloat();
        sc.nextLine(); // clear buffer

        students.add(new Student(prn, name, dob, marks));
        System.out.println("Student added successfully!");
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        for (Student s : students) {
            s.display();
        }
    }

    public void searchByPRN(Scanner sc) {
        System.out.print("Enter PRN: ");
        String prn = sc.nextLine();
        boolean found = false;
        for (Student s : students) {
            if (s.prn.equals(prn)) {
                s.display();
                found = true;
                break;
            }
        }
        if (!found) throw new StudentNotFoundException("Student with PRN " + prn + " not found.");
    }

    public void searchByName(Scanner sc) {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        boolean found = false;
        for (Student s : students) {
            if (s.name.equalsIgnoreCase(name)) {
                s.display();
                found = true;
            }
        }
        if (!found) throw new StudentNotFoundException("Student with name " + name + " not found.");
    }

    public void searchByPosition(Scanner sc) {
        System.out.print("Enter Position (0-based): ");
        int pos = sc.nextInt();
        sc.nextLine(); // clear buffer

        if (pos < 0 || pos >= students.size())
            throw new InvalidInputException("Invalid position entered.");

        students.get(pos).display();
    }

    public void updateStudent(Scanner sc) {
        System.out.print("Enter PRN to update: ");
        String prn = sc.nextLine();
        boolean found = false;
        for (Student s : students) {
            if (s.prn.equals(prn)) {
                System.out.print("Enter new Name: ");
                s.name = sc.nextLine();
                System.out.print("Enter new DOB: ");
                s.dob = sc.nextLine();
                System.out.print("Enter new Marks: ");
                s.marks = sc.nextFloat();
                sc.nextLine(); // clear buffer
                found = true;
                System.out.println("Student updated.");
                break;
            }
        }
        if (!found) throw new StudentNotFoundException("Student with PRN " + prn + " not found.");
    }

    public void deleteStudent(Scanner sc) {
        System.out.print("Enter PRN to delete: ");
        String prn = sc.nextLine();
        boolean removed = students.removeIf(s -> s.prn.equals(prn));
        if (!removed)
            throw new StudentNotFoundException("Student with PRN " + prn + " not found.");
        System.out.println("Student deleted.");
    }
}
