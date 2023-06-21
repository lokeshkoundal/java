import java.io.*;

public class pract14 {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = null;
           
            inputStream = new FileInputStream("MyFile.txt");
           
            int byteData;
            while ((byteData = inputStream.read()) != -1) {
                System.out.print((char) byteData);
            }

            if (inputStream != null){
                inputStream.close();           
        
        }
    }
}
