package Challenge11;

import java.io.*;

public class DataDisplay {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("data.dat");
                BufferedInputStream buffer = new BufferedInputStream(input)) {
            // Display the first 5 bytes stored in the file
            System.out.println("First 5 bytes:");
            for (int i = 0; i < 5; i++) {
                int b = buffer.read();
                if (b == -1) {
                    System.out.println("EOF Error");
                    return;
                }
                System.out.println(b);
            }

            // Display every even-numbered byte in the file
            System.out.println("\nEven-numbered bytes:");
            buffer.mark(Integer.MAX_VALUE);
            int i = 0;
            while (true) {
                int b = buffer.read();
                if (b == -1) {
                    System.out.println("EOF Error");
                    return;
                } else if (i % 2 == 0) {
                    System.out.println(b);
                }
                i++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Error");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
