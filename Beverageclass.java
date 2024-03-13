Create a class Beverage with a method order Beverage() that prints "Ordering a beverage"

Create a subclass Coffee that extends Beverage. Override the orderBeverage() method to prompt the user for input. Ask the user to input the coffee type (String), e.g., latte, cappuccino, and size (String), e.g., Small, Large, Medium, and then print the ordered coffee details.

Create another subclass Tea that extends Beverage. Override the order Beverage() method to prompt the user for input. Ask the user to input the tea type (String), e.g., green tea, chamomile, and sweetness level (String), then print the ordered tea details.

Note: The main class has been provided to you in the editor.

Sample Test Cases

Test Case 1:

Expected Output:

Ordering a beverage

Coffee type: Latte

size of the coffee: Large

Ordered Coffee Details:

Coffee Type: Latte

Size: Large

Tea type: Green Tea

Sweetness level: Mildly sweet

Ordered Tea Details:

Tea Type: Green Tea

Eweetness Level: Mildly sweet

//Test Case 2:




  
import java.util.Scanner;

public class BeverageOrder {

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();

        coffee.orderBeverage();
        tea.orderBeverage();
    }
}

class Beverage {
    public void orderBeverage() {
        System.out.println("Ordering a beverage");
    }
}

class Coffee extends Beverage {
    @Override
    public void orderBeverage() {
        Scanner input = new Scanner(System.in);
        System.out.print("Coffee type: ");
        String coffeeType = input.nextLine();
        System.out.print("Size of the coffee: ");
        String size = input.nextLine();
        System.out.println("\nOrdered Coffee Details:");
        System.out.println("Coffee Type: " + coffeeType);
        System.out.println("Size: " + size);
    }
}

class Tea extends Beverage {
    @Override
    public void orderBeverage() {
        Scanner input = new Scanner(System.in);
        System.out.print("Tea type: ");
        String teaType = input.nextLine();
        System.out.print("Sweetness level: ");
        String sweetnessLevel = input.nextLine();
        System.out.println("\nOrdered Tea Details:");
        System.out.println("Tea Type: " + teaType);
        System.out.println("Sweetness Level: " + sweetnessLevel);
    }
}
