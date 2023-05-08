package Recursion;

/**
 * Assume that a class has an instance method (not a static method) named
 * makeStars that can be passed a non-negative integer n and that returns a
 * String of n asterisks. So, if you call the method, passing 5 as the argument,
 * it will return the string "*****".
 * Write a void instance method named printTriangle that receives a non-negative
 * integer n and prints a triangle of asterisks as follows: first a line of n
 * asterisks, followed by a line of n-1 asterisks, and then a line of n-2
 * asterisks, and so on until n is 0.
 * For example, if the method received 5 it would print:
 * * * * *
 * * * *
 * * *
 * *
 *
 * The method must not use a loop of any kind (for, while, do-while) to
 * accomplish its job. The method should invoke makeStars to accomplish the task
 * of printing a single line. The method must not be static.
 */

public class TrianglePrinter {

    // Instance method that returns a string of n asterisks
    public String makeStars(int n) {
        if (n <= 0) {
            return "";
        }
        return "*" + makeStars(n - 1);
    }

    // Instance method that prints a triangle of asterisks
    public void printTriangle(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(makeStars(n));
        printTriangle(n - 1);
    }

}
