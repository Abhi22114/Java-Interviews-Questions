
// Note: This question appeared in the Recruitment/Technical Interviews of Reliance, Wipro, and Newgen, Year 2023.



// You are developing a program for a driving license office that checks whether a person is eligible to apply for a driving license. Create a Java program that assesses a person's eligibility based on their age and completion of a driver's education course.



// Your task is to write a Java program that takes a person's age and completion status of a driver's education course as input and determines their eligibility to apply for a driving license based on the following criteria:



// If the person is at least 16 years old and has completed a driver's education course, they are eligible to apply for a driving license.
// If the person is under 16 years old or has not completed a driver's education course, they are not eligible to apply for a driving license.


// Input format:

// The program should take two inputs:

// The person's age (an integer).

// Whether the person has completed a driver's education course (a boolean, true if completed, false otherwise).



// Output format:

// The program should output whether the person is eligible to apply for a driving licens









//ANSWER--->>>>//

//package q22443;

//import java.util.Scanner;

public class DrivingLicenseEligibilityChecker {

    // Method to check driving License eligibility based on age and driver's education completion
    public static void checkLicenseEligibility(int age, boolean hasCompletedDriverEducation) {
        if (age >= 16 && hasCompletedDriverEducation) {
            System.out.println("Congratulations! You are eligible for a driving license.");
        } else {
            System.out.println("Sorry, you are not eligible for a driving license.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Have you completed a driver's education course? (true/false): ");
        boolean hasCompletedDriverEducation = scanner.nextBoolean();

        checkLicenseEligibility(age, hasCompletedDriverEducation);
    }
}




