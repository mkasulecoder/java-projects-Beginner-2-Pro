package Recursion;

/**
 * Chapter 15: Programming Project 2
 * Unlimited tries
 * Write a program with a recursive method that accepts two arguments into the
 * parameters x and y. The method should return the value of x times y.
 * Hint: multiplication can be performed as repeated addition.
 * Your program should have a main method that displays the following string as
 * a prompt, exactly as shown here:
 * "Enter x: "
 * The program should then read an int from the keyboard for x, and then display
 * the following string as a prompt, exactly as shown here:
 * "Enter y: "
 * The program should then read an int from the keyboard for y. Then, the
 * program should call the recursive multiplication method to calculate the
 * value of x times y and display the result. Here is a sample run of the
 * program:
 * Enter x: 5
 * Enter y: 2
 * 10
 * The program's main class name should be Multiplication.
 */

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = scanner.nextInt();
        System.out.print("Enter y: ");
        int y = scanner.nextInt();
        System.out.println(multiply(x, y));
    }

    public static int multiply(int x, int y) {
        if (y == 0) {
            return 0;
        } else if (y > 0) {
            return x + multiply(x, y - 1);
        } else {
            return -multiply(x, -y);
        }
    }
}
