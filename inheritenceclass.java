

Person's name and age - Single Inheritance

Create a class named Person with the following characteristics:

• A String variable name.

A method inputName() that takes user input for the name.

A method displayName() that prints the name to the console.

Create a class named Citizen that inherits from Person and has the following characteristics:

• An int variable age.

• A method inputAge() that takes user input for the age.

• A method displayAge() that prints the age to the console.

Note: The main class has been provided to you in the editor. The MainPerson class creates an instance of Citizen, takes user input for name and age, and then displays the entered name and age. The program demonstrates the use of inheritance, where the Citizen class inherits attributes and methods from the Person class.

Sample Test Cases

Test Case 1:

Expected Output:

Enter name: John doe

Name: John doe

Enter age: 23

Age: 23

Test Case 2:

Expected Output:

Enter name: Shreya

Name: Shreya


  package 923042;

import java.util.Scanner;

public class MainPerson {

    public static void main(String[] args) {
        Citizen citizen = new Citizen();

        citizen.inputName();
        citizen.displayName();

        citizen.inputAge();
        citizen.displayAge();
    }
}

class Citizen {
    private String name;
    private int age;

    public void inputName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = scanner.nextLine();
    }

    public void displayName() {
        System.out.println("Name: " + this.name);
    }

    public void inputAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        this.age = scanner.nextInt();
    }

    public void displayAge() {
        System.out.println("Age: " + this.age);
    }
}
