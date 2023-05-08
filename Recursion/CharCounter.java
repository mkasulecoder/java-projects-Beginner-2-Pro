package Recursion;

/**
 * Write a method that uses recursion to count the number of times a specific character occurs in a string. The method should accept two arguments: a string, and a character to search for. The method should return the number of times the character appears in the string. (Note: the method should not be case sensitive in its search.)
Your program should have a main method that displays the following string as a prompt, exactly as shown here:
"Enter a string: "
The program should then read a string from the keyboard, and then display the following string as a prompt, exactly as shown here:
"Enter a character: "
The program should then read a character from the keyboard. Then, the program should call the recursive method to count the number times the character appears in the string and display the result. (Perform a case insensitive search.)
Here is a sample run of the program:
Enter a string: The team was called the Tall Terrible Tigers. 
Enter a character: t
 6
The program's main class name should be CharCounter.
 */

import java.util.Scanner;

public class CharCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.print("Enter a character: ");
        char c = input.next().charAt(0);
        int count = countChar(str, c);
        System.out.println(count);
    }

    public static int countChar(String str, char c) {
        // Base case: if the string is empty, return 0
        if (str.length() == 0) {
            return 0;
        }
        // Recursive case: if the first character of the string is the target character,
        // add 1 to the count and recursively call countChar on the remaining string
        if (Character.toLowerCase(str.charAt(0)) == Character.toLowerCase(c)) {
            return 1 + countChar(str.substring(1), c);
        }
        // Recursive case: if the first character of the string is not the target
        // character,
        // recursively call countChar on the remaining string
        else {
            return countChar(str.substring(1), c);
        }
    }

}
