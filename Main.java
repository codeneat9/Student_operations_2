/*
Name: Yashwith Behara
PRN: 23070126151
Batch:AIML B3
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        int choice;
        do {
            System.out.println("\n===== Student Data Entry Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search by PRN");
            System.out.println("4. Search by Name");
            System.out.println("5. Search by Position");
            System.out.println("6. Update Student");
            System.out.println("7. Delete Student");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1 -> manager.addStudent(sc);
                case 2 -> manager.displayStudents();
                case 3 -> manager.searchByPRN(sc);
                case 4 -> manager.searchByName(sc);
                case 5 -> manager.searchByPosition(sc);
                case 6 -> manager.updateStudent(sc);
                case 7 -> manager.deleteStudent(sc);
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }

