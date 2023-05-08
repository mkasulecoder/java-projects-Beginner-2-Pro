package Recursion;

/**
 * Assuming n is a positive integer, the sum of the numbers from 1 to n can be
 * defined recursively as follows:
 * The sum from 1 to 1 is 1.
 * The sum from 1 to n is n plus the sum from 1 to n-1.
 * Write a method named sum that has an int parameter, n, and recursively
 * calculates and returns the sum of the numbers from 1 to n. The method should
 * return the sum as an int.
 * Note: If the parameter n is 0 or negative, the sum method should return 0.
 */

public class SumRecursive {
    public static int sum(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }

}
