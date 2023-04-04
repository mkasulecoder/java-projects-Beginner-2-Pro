package ProgrammingChallenges.Challenge9;

import java.util.Scanner;

/**
 * 
 * Chapter 9: Programming Project 1
 * 
 * Write a program with the main class named BackwardString. The BackwardString
 * class should have a static method named backwards that accepts a String
 * object as an argument and returns the backward version of the string. For
 * instance, if the string argument is "gravity" the method should return
 * "ytivarg".
 * The BackwardString class should also have a main method that displays the
 * following prompt:
 * "Enter a string: "
 * Notice the capitalization of the words, and the space that appears after the
 * colon. The prompt string must appear exactly as shown above.
 * Next, the main method should read a string from the keyboard, pass that
 * string as an argument to the backwards method, and display the string that is
 * returned from the method.
 * Here is a sample of the program's output, with the user's input shown in
 * bold:
 * 
 * Enter a string: Hello world↵
 * dlrow olleH
 */
public class BackwardString {

    /*
     * @return reversedStr
     */
    public static String reverseString(String str) {
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        return reversedStr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String response = input.nextLine();

        // System.out.println(reverseString(response));

        // Alternative use string builder
        StringBuilder str = new StringBuilder(response);
        System.out.println(str.reverse());

    }
}
