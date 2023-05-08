package Recursion;

/**
 * A palindrome is a string that reads the same forwards or backwards. Reversing
 * a palindrome produces the same string. For example, the words dad, mom, and
 * deed are all palindromes.
 * Write a recursive method named isPalindrome that accepts a string and returns
 * true if the string is a palindrome, or false otherwise.
 * A string, s, is a palindrome if:
 * s is an empty string or s consists of a single letter (which reads the same
 * back or forward), or
 * the first and last characters of s are the same, and the rest of the string
 * (i.e., the second through next-to-last characters) form a palindrome.
 */

public class Palindrome {
    public static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        } else if (s.length() <= 1) {
            return true;
        } else {
            char first = s.charAt(0);
            char last = s.charAt(s.length() - 1);
            if (first == last) {
                String middle = s.substring(1, s.length() - 1);
                return isPalindrome(middle);
            } else {
                return false;
            }
        }
    }

}
