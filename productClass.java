Mouing vanavie prouucuvame.

    
• An int variable quantity.

• A method inputProductDetails() that takes user input for the product name.

• A method displayQuantity() that prints the current quantity.

Create a class named Purchase that extends Product with the following attributes:

An int variable purchaseQuantity.

• A method input Purchase Details() that takes user input for the quantity purchased.

Create a new method updatelnventory() in the Purchase class that updates the quantity based on the purchase.

Note: The main class has been provided to you in the editor.

Sample Test Cases

Test Case 1:

Expected Output:

Enter product name: Smart Phone

Current Quantity: 0

Enter quantity purchased: 12

Inventory Updated Successfully!

Current Quantity: 12

Test Case 2:

Expected Output:

Enter product name: Electric lights

Current Quantity: 0

Enter quantity purchased: 25

Inventory Updated Successfully!

Current Quantity: 25

Finish





    
import java.util.Scanner;

class Product {
    protected String productName;
    protected int quantity;

    public void inputProductDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product name: ");
        productName = scanner.nextLine();
    }

    public void displayQuantity() {
        System.out.println("Current Quantity: " + quantity);
    }
}

class Purchase extends Product {
    private int purchaseQuantity;

    public void inputPurchaseDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter quantity purchased: ");
        purchaseQuantity = scanner.nextInt();
    }

    public void updateInventory() {
        quantity += purchaseQuantity;
        System.out.println("Inventory Updated successfully!");
        System.out.println("Current Quantity: " + quantity);
    }
}

public class InventorySystem {
    public static void main(String[] args) {
        Purchase purchase = new Purchase();
        purchase.inputProductDetails();
        purchase.inputPurchaseDetails();
        purchase.displayQuantity();
        purchase.updateInventory();
    }
}
