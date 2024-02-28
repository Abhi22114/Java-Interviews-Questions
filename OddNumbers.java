//Odd numbers till the given integer

Write a Java program that prompts the user to enter the number N, and prints all the odd numbers till the given integer N.

//-->> Input format:

The input is an integer.

//-->>> Output format:

The output is the odd integers in separate lines till the given integer.

//-->>> Sample Test Cases

Test Case 1:

Expected Output:

9

1
3
5
7
9


Test Case 2:

Expected Output:

18

1
3
5
7
9



import java.util.Scanner;

public class PrintOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = scanner.nextInt();
        
        System.out.println("Odd numbers till " + N + ":");
        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
