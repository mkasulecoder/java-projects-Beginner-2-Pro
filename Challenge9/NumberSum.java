package ProgrammingChallenges.Challenge9;

/**
 * 
 * Chapter 9: Programming Project 3
 * 
 * Write a program with the main class named NumberSum. The program should display the following prompt:
"Enter numbers separated by commas: "
Notice the capitalization of the words, and the space that appears after the colon. The prompt string must appear exactly as shown above.
It is assumed that the user will enter a series of numbers separated by commas. Here is an example of valid input:
7,9,10,2,18,6
The program should calculate and print the sum of all the numbers. (Hint: Read a line of input as a string, then tokenize the string to extract the numbers.)
Here is a sample of the program's output, with the user's input shown in bold:
 
@author Mark  Kasule
*/

import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {

        int total = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter numbers separated by commas: ");
        String response = input.nextLine();

        for (int i = 0; i < response.length(); i++) {
            if (Character.isDigit(response.charAt(i))) {

                // cast character to int results into Ascii Code
                int ascii_digit = Character.valueOf(response.charAt(i));

                // subtract Ascii code of 0 (48)
                total += (ascii_digit - 48);

                // System.out.print(ascii_digit + ", ");
            }
        }

        System.out.println(total);
    }
}
