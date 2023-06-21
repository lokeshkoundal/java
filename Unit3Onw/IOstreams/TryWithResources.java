import java.io.*;
public class TryWithResources{
   public static void main(String[] args){

       try(FileInputStream fis = new FileInputStream("filex.txt")){
        int data;
        while((data = fis.read())!=-1){
            System.out.print((char)data);
        }
    }
       catch(IOException e){
        System.out.println(e.getMessage());
       }
   }
}