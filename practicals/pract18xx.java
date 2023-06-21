import java.io.*;

public class pract18xx {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = null;

        
            reader = new BufferedReader(new InputStreamReader(System.in));

            String line;
            System.out.print("Enter lines (type 'STOP' to exit):");

            while (!(line = reader.readLine()).equalsIgnoreCase("STOP")) {
                System.out.println("You entered: " + line);
            }  
                if (reader != null)
                    reader.close();
        }
    }
