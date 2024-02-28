Highest Odd Factor

Rajiv loves playing with numbers, especially odd ones! Recently, he discovered a magical tool called the "Odd-Finder." This magical device can reveal the highest odd factor of any number. Excited about this new gadget, Rajiv wants your help to create a simple Java program for his odd number adventure.

Input format:

The input is an integer.

Output format:

The output is an integer that represents the highest odd factor of the given number.

Sample Test Cases

Test Case 1:

Expected Output:

446

223

Test Case 2:

Expected Output:

24
18:32
Highest Odd Factor

Rajiv loves playing with numbers, especially odd ones! Recently, he discovered a magical tool called the "Odd-Finder." This magical device can reveal the highest odd factor of any number. Excited about this new gadget, Rajiv wants your help to create a simple Java program for his odd number adventure.

Input format:

The input is an integer.

Output format:

The output is an integer that represents the highest odd factor of the given number.

Sample Test Cases

Test Case 1:

Expected Output:

446

223

Test Case 2:

Expected Output:

24

3



import java.util.Scanner;

public class FactorFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int highestOddFactor = findHighestOddFactor(number);
        System.out.println("Highest odd factor: " + highestOddFactor);
    }
    
    public static int findHighestOddFactor(int number) {
        int highestOddFactor = 1;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0 && i % 2 != 0) {
                highestOddFactor = i;
            }
        }
        return highestOddFactor;
    }
}
