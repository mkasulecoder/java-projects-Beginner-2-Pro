package Challenge11;

import java.util.ArrayList;
/**
 * •	White the following program:
o	Prompt the user to enter a series of 10 numbers and save those numbers to a file called “Numbers.txt”. After that close the file.
o	Next, open the file userNumbers.txt”. While reading it line by line, add the number from the next line to the current line number. 
	EX: My file has numbers like this: 
1
2
3
I will have two additions: 1+2 and 2+3
o	Save the results of the addition to a new file called “userNumbersAdded.txt”

 */
import java.util.Scanner;
import java.io.*;

public class AddNumbers {
    public static void main(String[] args) throws IOException {

        // File name
        String fileName = "userNumbers.txt";
        // Get numbers from users
        getUserNumbers(fileName);
        // Add numbers
        addNumbersMethod(fileName);

    }

    /**
     * Get numbers from users
     * 
     * @throws IOException
     */
    public static void getUserNumbers(String fileName) throws IOException {
        // create file to print to
        PrintWriter outFile = new PrintWriter(fileName);
        // read user input
        Scanner scan = new Scanner(System.in);

        int input = 0;

        do {
            System.out.print("Enter a string: ");
            input = scan.nextInt();
            // save numbers to file
            if (input != -1)
                outFile.println(input);
        } while (input != -1);

        outFile.close();
        System.out.println("Output file has been created: " + fileName);
    }

    /**
     * Add numbers in new file
     * 
     * @param fileName
     * @throws IOException
     */
    public static void addNumbersMethod(String fileName) throws IOException {

        // get the file to read from
        File file = new File(fileName);
        // read input from file
        Scanner input = new Scanner(file);

        // list to hold user numbers
        ArrayList<String> lines = new ArrayList<String>();

        PrintWriter newFile = new PrintWriter("userNumbersAdded.txt");

        while (input.hasNextLine()) {
            String value = input.nextLine();
            lines.add(value);
        }
        System.out.println(lines.toString());
        for (int i = 0; i < lines.size() - 1; i++) {
            int number = Integer.parseInt(lines.get(i)) + Integer.parseInt(lines.get(i + 1));
            newFile.println(number);
        }
        newFile.close();
    }
}
