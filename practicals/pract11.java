import java.io.*;

public class pract11{
    public static void main(String[] args) {
        FileReader reader = null;

        try {
            File file = new File("input.txt");
            reader = new FileReader(file);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
         catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
         finally {
            try {
                
                if (reader != null)
                    reader.close();
                }
                 catch (IOException e) {
                System.out.println("An error occurred while closing the file: " + e.getMessage());
            }
        }
    }
}
