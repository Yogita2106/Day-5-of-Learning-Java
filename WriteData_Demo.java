import java.io.FileWriter;
import java.io.IOException;

public class WriteData_Demo {

    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            // Create a FileWriter object
            fileWriter = new FileWriter("file.txt");

            // Write some text to the file
            fileWriter.write("This is some sample text written to the file.\n");
            fileWriter.write("This is the second line of text.");

            // Print a success message to the console
            System.out.println("Data written to file.txt successfully!");

        } catch (IOException e) {
            // Handle potential IOException
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Ensure the file writer is closed
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    System.err.println("Error closing file: " + e.getMessage());
                    e.printStackTrace();
                }
            }
        }
    }
}
