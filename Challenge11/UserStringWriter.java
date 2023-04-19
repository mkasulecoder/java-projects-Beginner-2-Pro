package Challenge11;

import java.util.Scanner;
import java.io.*;

public class UserStringWriter {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String fileName = "userStrings.txt";
        PrintWriter outFile = new PrintWriter(fileName);

        String input = "";

        do {
            System.out.print("Enter a string: ");
            input = scan.nextLine();
            // save nnumbers to file
            if (!input.equals("DONE"))
                outFile.println(input);
        } while (!input.equals("DONE"));

        outFile.close();
        System.out.println("Output file has been created: " + fileName);
    }
}
