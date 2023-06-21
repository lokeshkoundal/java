import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pract18 {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new InputStreamReader(System.in));

            String line;
            System.out.print("Enter lines (type 'STOP' to exit):");

            while (!(line = reader.readLine()).equalsIgnoreCase("STOP")) {
                System.out.println("You entered: " + line);
            }
        }
         catch (IOException e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
        }
         finally {

            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                System.out.println("An error occurred while closing the reader: " + e.getMessage());
            }

        }
    }
}
