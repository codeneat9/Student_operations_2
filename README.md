# Student Data Entry System - Java OOP Assignment

## 👤 Author Info
- **Name**: Yashwith Behara
- **PRN**: 23070126151
- **Batch**: AIML B3
  

## 📌 Project Description

This Java application demonstrates the concepts of:
- Classes & Objects
- Array of Objects
- Instance Members
- Constructors
- Custom Exceptions
- Menu-Driven Programming

The application allows users to perform various operations on student records including add, display, search, update, and delete using a console-based menu interface.

---
## 📘 Class Overview

### 1. `Student`
Represents the student entity.

#### Attributes:
- `String prn`
- `String name`
- `String dob`
- `double marks`

#### Constructors:
- `Student()` – Default constructor
- `Student(String prn, String name, String dob, double marks)` – Parameterized constructor

#### Methods:
- `void displayStudent()` – Displays student details.

---

### 2. `StudentManager`
Handles all operations related to student records.

#### Attributes:
- `Student[] students`
- `int count`

#### Methods:
- `void addStudent(Student student)` – Adds a new student to the array.
- `void displayAllStudents()` – Displays all student records.
- `Student searchByPRN(String prn)` – Searches for a student by PRN.
- `Student searchByName(String name)` – Searches for a student by name.
- `Student searchByPosition(int position)` – Searches for a student at a specific position.
- `void updateStudent(String prn, Student updatedStudent)` – Updates student details by PRN.
- `void deleteStudent(String prn)` – Deletes a student record by PRN.

---

### 3. `Main`
Contains the menu-driven logic and handles user interaction.

#### Functions:
- `static void showMenu()` – Displays menu options.
- `main(String[] args)` – Main loop to handle user input and perform operations using `StudentManager`.

---

### 4. `CustomExceptions.InvalidInputException`
A custom runtime exception thrown when:
- Invalid input is provided (e.g., empty fields, negative marks, etc.)

---

### 5. `CustomExceptions.StudentNotFoundException`
A custom runtime exception thrown when:
- Search/update/delete is attempted on a non-existent student.

---

## 💡 Functionalities Implemented

1. **Add Student**
   - Takes user input and validates it.
   - Adds to student array using `addStudent()`.

2. **Display Students**
   - Shows all current student records using `displayAllStudents()`.

3. **Search**
   - By PRN using `searchByPRN()`
   - By Name using `searchByName()`
   - By Position using `searchByPosition()`

4. **Update Student**
   - Finds student by PRN and updates with new data using `updateStudent()`.

5. **Delete Student**
   - Deletes student using `deleteStudent()` based on PRN.

---

## 🚨 Exception Handling

Each operation uses **at least two custom exceptions** to ensure robust validation and better performance:
- `InvalidInputException` – Thrown on invalid or empty user input.
- `StudentNotFoundException` – Thrown when the target student is not found during search/update/delete.

---
## 📚 Conclusion

This Student Data Entry System project was developed to demonstrate key Java programming concepts such as classes, objects, arrays of objects, instance members, constructors, and exception handling. The project uses a menu-driven approach to simulate a simple CRUD (Create, Read, Update, Delete) application.

Custom exceptions like `InvalidInputException` and `StudentNotFoundException` were implemented to ensure robust validation and error handling across all functionalities.

The use of clean modular code, separate files for each class, and properly commented logic makes the system easy to read, maintain, and expand. This project also highlights the practical application of Java OOP principles and exception handling in real-world scenarios.



