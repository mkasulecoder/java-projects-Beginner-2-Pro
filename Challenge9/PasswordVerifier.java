package ProgrammingChallenges.Challenge9;

/**
 * 
 * Chapter 9: Programming Project 2
 * 
 * You are developing software for an online shopping site that requires users to create their own passwords. Your software requires that users' passwords meet the following criteria:
The password should be at least eight characters long.
The password should contain at least one uppercase and at least one lowercase letter.
The password should have at least one digit.
Write a program with the main class named PasswordVerifier. The program should display the following prompt:
"Enter password: "
Notice the capitalization of the words, and the space that appears after the colon. The prompt string must appear exactly as shown above.
Next, the program should read a string from the keyboard and determine whether it is a valid password, according to the rules stated above. If the string is a valid password, the program should display "Valid Password". Otherwise, it should display "Invalid Password".
Here is a sample of the program's output, with the user's input shown in bold:
@author Mark  Kasule
*/

import java.util.Scanner;

public class PasswordVerifier {
    public static void main(String[] args) {

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter password: ");
        String response = input.nextLine();

        if (response.length() >= 8) {
            for (int i = 0; i < response.length(); i++) {
                if (Character.isDigit(response.charAt(i))) {
                    hasDigit = true;
                } else if (Character.isUpperCase(response.charAt(i))) {
                    hasUppercase = true;
                } else if (Character.isLowerCase(response.charAt(i))) {
                    hasLowercase = true;
                }

            }
        }

        if (hasDigit && hasUppercase && hasLowercase)
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Passward");

    }
}
