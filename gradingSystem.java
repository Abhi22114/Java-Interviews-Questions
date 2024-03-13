
School Grading System

You are developing a grading system for a school.

Create a base class Student with attributes name (string), id (int), and grade (char). Implement a method display Details that prints the student's details.

Create a child class Graduate Student that inherits from Student and adds an attribute thesis Topic (string). Implement a method displayDetails in the Graduate Student class that overrides the base class method and displays the thesis Topic.

Note: The main class has been provided to you in the editor.

Sample Test Cases

Test Case 1:

Expected Output:

Enter details for a student:

Name: John

ID: 101

Grade: A

Enter details for a graduate student:

Thesis Topic: Machine Learning Algorithms

Student Details:

Name: John

ID: 101

Grade: A

Thesis Topic: Machine Learning Algorithms

Test Case 2:








package q23024;

import java.util.Scanner;

class Student {
    String name;
    int id;
    char grade;

    Student(String name, int id, char grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Grade: " + grade);
    }
}

class GraduateStudent extends Student {
    String thesisTopic;

    GraduateStudent(String name, int id, char grade, String thesisTopic) {
        super(name, id, grade);
        this.thesisTopic = thesisTopic;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Thesis Topic: " + thesisTopic);
    }
}

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for a student:");
        System.out.print("Name: ");
        String studentName = scanner.nextLine();
        System.out.print("ID: ");
        int studentId = scanner.nextInt();
        System.out.print("Grade: ");
        char studentGrade = scanner.next().charAt(0);
        scanner.nextLine(); // Consume the newline character

        Student student = new Student(studentName, studentId, studentGrade);
        student.displayDetails();

        System.out.println("\nEnter details for a graduate student:");
        System.out.print("Name: ");
        String gradStudentName = scanner.nextLine(); // Prompt for name first
        System.out.print("Thesis Topic: ");
        String thesisTopic = scanner.nextLine();
        System.out.print("ID: ");
        int gradStudentId = scanner.nextInt();
        System.out.print("Grade: ");
        char gradStudentGrade = scanner.next().charAt(0);
        scanner.nextLine(); // Consume the newline character

        GraduateStudent graduateStudent = new GraduateStudent(gradStudentName, gradStudentId, gradStudentGrade, thesisTopic);
        graduateStudent.displayDetails();

        scanner.close();
    }
}
