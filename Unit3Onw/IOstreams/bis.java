import java.io.*;
public class bis {
    public static void main(String[] args)throws IOException {
        //bis comes under FilterInputStream
        //Has 2 constructors : 
        FileInputStream fis = new FileInputStream("file.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        //BufferedInputStream bis2 = new BufferedInputStream(fis,4096);
        int data = bis.read();
        while(data!= - 1 ){
            System.out.print((char)data);
            data = bis.read();
        }
    }
}
