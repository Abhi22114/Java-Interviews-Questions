
Car Rental System

Imagine you are developing a Car Rental System, and you need to design a class named Car to represent individual cars within the system. The Car class should have attributes model and year. Additionally, you need methods to get and set these attributes.

Attributes:

model: Represents the specific model of the car (e.g., Camry, Accord).

year: Represents the manufacturing year of the car.

Methods:

getModel(): Returns the model of the car.

getYear(): Returns the manufacturing year of the car.

setModel(String model): Sets the model of the car.

setYear(int year): Sets the manufacturing year of the car.

Sample Test Cases

Test Case 1:

Expected Output:

Model of car: Toyota Camry

Kanufacturing year of car: 2022

Details of the Rental Car:

Model: Toyota Camry
Year: 2022

Test Case 2:

Expected Output:

Model of car: Honda Accord

Manufacturing year of car: 2023





package q22919;

import java.util.Scanner;

public class Car {
    private String model;
    private int year;

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car rentalCar = new Car();

        System.out.print("Model of car: ");
        String userEnteredModel = scanner.nextLine();
        rentalCar.setModel(userEnteredModel);

        System.out.print("Manufacturing year of car: ");
        int userEnteredYear = scanner.nextInt();
        rentalCar.setYear(userEnteredYear);

        // Display details
        System.out.println("Details of the Rental Car:");
        System.out.println("Model: " + rentalCar.getModel());
        System.out.println("Year: " + rentalCar.getYear());

        scanner.close();
    }
}
