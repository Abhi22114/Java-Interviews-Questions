

Create a class named Parameters representing the dimensions of the rectangle, with the following attributes:


• A float variable length.

• A float variable breadth.

• A method Parametersin() that takes user input for both length and breadth.

Create a class named Area that extends Parameters to calculate and display the area of the rectangle. This class should have the following attributes:

• A float variable areaof.

• A method displayArea() that calculates and prints the area of the rectangle up to 2 decimal places.

Note: The main class has been provided to you in the editor.

Ex

Sample Test Cases

Test Case 1:

Expected Output:

Enter length: 8.9

Ex

Ente

Ente

46.8

Enter breadth: 5.26

46.61

Test Case 2:

Expected Output:

Enter length: 15.26

Enter breadth: 23.56

359.53


    


import java.util.Scanner;

class Parameters {
    protected float length;
    protected float breadth;

    public void Parametersin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = scanner.nextFloat();
        System.out.print("Enter breadth: ");
        breadth = scanner.nextFloat();
    }
}

class Area extends Parameters {
    private float areaof;

    public void displayArea() {
        areaof = length * breadth;
        System.out.printf("%.2f\n", areaof);
    }
}
