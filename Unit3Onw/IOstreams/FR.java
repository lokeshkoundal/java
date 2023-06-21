import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FR {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("file.txt");
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            // System.out.println(reader.getEncoding());
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Process the line of text
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}