package Challenge11.exercises;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class DataWriter {
    public static void main(String[] args) {
        readFile();
    }

    public static void createFile() {
        int x = 23456;
        try {
            PrintWriter output = new PrintWriter("Number.txt");
            output.print(x);
            output.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readFile() {
        StringBuilder word = new StringBuilder();

        try {
            File file = new File("Number.txt");
            Scanner input = new Scanner(file);

            while (input.hasNext()) {
                word.append(input.nextLine() + "\n");
            }
        } catch (Exception e) {
            System.out.println("File was not found");
        }
        // print file contents
        System.out.println(word);
    }
}
