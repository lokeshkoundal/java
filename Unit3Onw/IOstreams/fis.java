import java.io.*;
public class fis{
   public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("file.txt");
        int data;
        while((data = fis.read())!=-1){
            System.out.print((char)data);
        }
        fis.close();
   }
}