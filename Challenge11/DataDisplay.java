package Challenge11;

import java.io.*;

public class DataDisplay {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("data.dat");
                DataInputStream data = new DataInputStream(input)) {

            // Display the first 5 ints stored in the file
            for (int i = 0; i < 5; i++) {
                int b = data.readInt();
                System.out.println(b);
            }

            // display even numbers
            for (int i = 0; i < 5; i++) {
                if (data.readInt() % 2 == 0) {
                    int even = data.readInt();
                    System.out.println(even);
                }
            }

            // display odd numbers
            for (int i = 0; i < 5; i++) {
                if (data.readInt() % 2 != 0) {
                    int odd = data.readInt();
                    System.out.println(odd);
                }
            }
            // reverse the order
            for (int i = 5; i < 0; i--) {
                int reverseValue = data.readInt();
                System.out.println(reverseValue);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Error");
        } catch (EOFException e) {
            System.out.println("EOF Error");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
