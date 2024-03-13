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
