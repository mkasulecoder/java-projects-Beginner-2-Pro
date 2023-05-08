package Recursion;

/**
 * Write a recursive method named makeLine. The method header should look like
 * this:
 * public String makeLine(int n, char c)
 * The method should return a String containing the character c repeated n
 * times. For example, if n is 5 and c is 'b', the method should return the
 * string "bbbbb".
 * The method must not use a loop of any kind (for, while, do-while) to
 * accomplish its job. Instead, it should examine the n parameter, and
 * If n is zero or negative, the method should return an empty string
 * Otherwise, the method should return the concatenation of the c character with
 * the string returned by a correctly written recursive call to itself.
 */

public class MakeLine {
    public String makeLine(int n, char c) {
        if (n <= 0) {
            return "";
        } else {
            return c + makeLine(n - 1, c);
        }
    }

}