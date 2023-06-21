package pract;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class reaadd {
    public static void main(String[] args) throws IOException{

        FileInputStream fis = new FileInputStream("B:\\VsCodes\\java\\Unit3Onw\\pract\\file.txt");

        BufferedInputStream bis = new BufferedInputStream(fis); 
        
       
        int b = bis.read();
        
        while(b!=-1){
            System.out.print((char)b);
            b = bis.read();
        }

       fis.close();
     
    

    }
}
