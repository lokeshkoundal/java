import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class fos {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the source of file : ");
        String source = sc.nextLine();
        
        System.out.print("Enter the Destination file : ");
        String dest = sc.nextLine();


        FileInputStream fis = new FileInputStream(source);
        int data =fis.read();

        System.out.println(data=fis.read());
        FileOutputStream fos = new FileOutputStream(dest);
       // System.out.println(data=fis.read());
        
        while(data!= -1){
             fos.write(data);
             data=fis.read();
        }
        System.out.println("Successfully Copied");

        int a;
        while((a=5)!=7){

        }
       
        // String s = "Hello fraands";
        // byte[] b = s.getBytes();
        // fos.write(b);
        
    }
}
