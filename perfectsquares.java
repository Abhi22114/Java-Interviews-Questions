Perfect Squares

Write the Java program that prompts the user to enter an integer and prints all the perfect square numbers till the given integer.

Input format:

The program takes the integer as an input.

Output format:

The output consists of the perfect square numbers till the user-given integer.

Sample Test Cases

Test Case 1:

Expected Output:

100
1 4 9 16 25 36 49 64 81 100

Test Case 2:

Expected Output:

36

1 4 9 16 25 36



//Answers  

22679/PerfectSquare:

Test time left

package 922679;

1

import java.util.Scanner;

Submit

2

3

// write your code here...


 public class PerfectSquares{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.print("");
int n=scanner.nextInt();
for(int i=1;i*i<=n;i++){
System.out.print(i*i+" ");
}

}

}
