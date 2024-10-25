// Glenn Cheruvathur
// CSSSKL143
import java.io.*;

public class TestFinally {
    public static void main(String[] args) {
        FileInputStream in1 = null;
        FileInputStream in2 = null;

        // Open an existing file trycatch.txt
        File inputFile1 = new File("trycatch.txt");

        // Open a non-existent file nosuchfile.abc
        File inputFile2 = new File("nosuchfile.abc");

        // 1. Add the try statement here
        try {
            // Get file handlers in Byte Stream format
            in1 = new FileInputStream(inputFile1);
            in2 = new FileInputStream(inputFile2);

            // Try to read 'nosuchfile.abc' till the end of File
            while ((in2.read()) != -1) {
                System.out.println("Read from nosuchfile.abc");
            }

        // 3. Add a catch block containing meaningful error messages.
        } catch (FileNotFoundException e) {
            System.out.println("The file you have requested cannot be found.");
            System.out.println("The exception is: " + e);
        } catch (IOException e) {
            System.out.println("An error occurred while processing the file.");
            System.out.println("The exception is: " + e);

        // 4. Add the finally block here. See instructions in the handout.
        } finally {
            // Close the files
            try {
                if (in1 != null) {
                    in1.close();
                    System.out.println("Closing file 'trycatch.txt' inside finally block.");
                }
                if (in2 != null) {
                    in2.close();
                    System.out.println("Closing file 'nosuchfile.abc' inside finally block.");
                }
            // 5. Close the finally block here.
            } catch (IOException e) {
                System.out.println("Error occurred while closing the files.");
                System.out.println("The exception is: " + e);
            }
        }
    }
}
