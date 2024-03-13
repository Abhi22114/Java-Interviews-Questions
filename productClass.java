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
