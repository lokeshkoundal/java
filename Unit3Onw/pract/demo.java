package pract;

import java.io.FileInputStream;
import java.io.IOError;
import java.io.IOException;

public class demo {
    public static void main(String[] args){
        try{
        FileInputStream s = new FileInputStream("filehvhef.txt");
        }
        catch(IOException e){
               System.out.println(e.getMessage());
            //   System.out.println(e);
            //   System.out.println(e.toString());
             //  e.printStackTrace();
            System.out.println("loda");

        }
        
        
    }
}
