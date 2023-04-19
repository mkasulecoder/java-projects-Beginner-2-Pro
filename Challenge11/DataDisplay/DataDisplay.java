package Challenge11.DataDisplay;

/**
 * 
 * Assume the file data.dat contains a sequence of binary data. Write a program that does the following:
Displays the first 5 bytes stored in the file. Each byte should be displayed on a separate line.
Starting with byte 0, displays every even-numbered byte in the file. (In other words, display byte 0, byte 2, byte 4, and so on.) Each byte should be displayed on a separate line.
Starting with byte 1, displays every odd-numbered byte in the file. (In other words, display byte 1, byte 3, byte 5, and so on.) Each byte should be displayed on a separate line.
Displays the last 5 bytes stored in the file, in reverse order. (Display the last byte, then the next-to-last byte, and so on.) Each byte should be displayed on a separate line.
Handle exceptions in the following manner:
If a FileNotFoundException is thrown, the program should display the string "File Error".
If an EOFException is thrown, the program should display the string "EOF Error".
If any other exception is thrown, the program should display the string "Error".
The name of your program class must be DataDisplay.
 */

import java.io.*;

public class DataDisplay {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("data.dat");
                DataInputStream data = new DataInputStream(input)) {
            // Display the first 5 bytes stored in the file
            printBytes(data);

            // display even numbers
            printEvenBytes(data);

            // display odd numbers
            printOddBytes(data);

            // reverse the bytes order
            printReverseBytes(input, data);

        } catch (FileNotFoundException e) {
            System.out.println("File Error");
        } catch (EOFException e) {
            System.out.println("EOF Error");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    /**
     * Print first 5 bytes in file
     * 
     * @param data
     * @throws IOException
     */
    public static void printBytes(DataInputStream data) throws IOException {
        for (int i = 0; i < 5; i++) {
            byte b = data.readByte();
            System.out.println(b);
        }
    }

    /**
     * Print even numbers in file
     * 
     * @param data
     * @throws IOException
     */
    public static void printEvenBytes(DataInputStream data) throws IOException {

        // reset data file
        data.reset();

        for (int i = 0; i < data.available(); i++) {
            byte b = data.readByte();
            if (i % 2 == 0) {
                System.out.println(b);
            }
        }
    }

    /**
     * Print odd numbers in file
     * 
     * @param data
     * @throws IOException
     */
    public static void printOddBytes(DataInputStream data) throws IOException {
        // reset to beginning of file
        data.reset();
        for (int i = 0; i < data.available(); i++) {
            byte b = data.readByte();
            if (i % 2 != 0) {
                System.out.println(b);
            }
        }
    }

    /**
     * 
     * Print last 5 bytes in reverse order
     * 
     * @param input
     * @param data
     * @throws IOException
     */
    public static void printReverseBytes(FileInputStream input, DataInputStream data) throws IOException {
        long fileLength = new File("data.dat").length();
        input.skip(fileLength - 5);
        byte[] lastFiveBytes = new byte[5];
        data.read(lastFiveBytes);
        for (int i = 4; i >= 0; i--) {
            System.out.println(lastFiveBytes[i]);
        }
    }
}
