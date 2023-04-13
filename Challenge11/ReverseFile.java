package Challenge11;

import java.io.*;

public class ReverseFile {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("data.dat");
                BufferedInputStream buffer = new BufferedInputStream(input);
                FileOutputStream output = new FileOutputStream("reverse.dat");
                BufferedOutputStream outBuffer = new BufferedOutputStream(output)) {
            // Read bytes from data.dat
            byte[] bytes = new byte[buffer.available()];
            buffer.read(bytes);

            // Write bytes in reverse order to reverse.dat
            for (int i = bytes.length - 1; i >= 0; i--) {
                outBuffer.write(bytes[i]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Error");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
