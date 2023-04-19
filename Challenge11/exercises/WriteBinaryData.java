package Challenge11.exercises;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * How to write binary data into files
 */
public class WriteBinaryData {

    public static void main(String[] args) {
        int[] x = { 2, 5, 6, 7, 3 };
        // Create a file
        createFile(x);

        // Reading Data from Binary File
        // readFromFile();
    }

    /**
     * Create File
     * 
     * @param x a list of items
     */
    public static void createFile(int[] x) {

        try (
                FileOutputStream createdFile = new FileOutputStream("BinaryTest.dat");
                DataOutputStream writeFile = new DataOutputStream(createdFile)) {
            System.out.println("Writing Files");
            for (int i = 0; i < x.length; i++) {
                writeFile.writeInt(x[i]);
                System.out.println("Writing: " + x[i]);
            }
            createdFile.close();
            System.out.println("File Updated");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Reading Files
     *
     */
    public static void readFromFile() {

        int number;
        boolean endOfFile = false;

        try (FileInputStream readFile = new FileInputStream("BinaryTest.dat");
                DataInputStream readData = new DataInputStream(readFile)) {
            System.out.println("Reading Numbers ...");
            while (!endOfFile) {
                try {
                    number = readData.readInt();
                    System.out.print(number + "");
                } catch (EOFException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (IOException e) {
            endOfFile = true;
            System.out.println(e.getMessage());
        }
    }
}
