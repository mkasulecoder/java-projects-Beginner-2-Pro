import java.util.Scanner;

/**
 * Chapter 5: Programming Project 2
 * Write a method named showChar. The method should accept two arguments:
 *  a String object and an integer. The integer argument is a character position within
 *  the String, with the first character being at position 0.
 * When the method executes, it should display the character at the specified character position. 
 * The method does not return anything.
 * Here is an example of a call to the method:showChar("New York", 2);
 * In this call, the method will display the character w because it is in position 2.
 *  Demonstrate the method in a complete program that asks the user to enter a line of text and an index.
 *  Here is a sample run of the program:
 * Enter a line of text: Jack and Jill ran up thehill.
 * Enter your index: 14
 * 
 * output: r
 * 
 * In the sample run shown above, look carefully at the wording of the prompts and the placement o
 * f spaces and colons. Your program's output must match this.
 * The name of your program class should be Method_showChar.
 */
import java.util.Scanner;

public class Method_showChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String line = input.nextLine();
        System.out.print("Enter your index: ");
        int index = input.nextInt();

        showChar(line, index);

    }

    public static void showChar(String str, int index) {
        System.out.println(str.charAt(index));
    }
}