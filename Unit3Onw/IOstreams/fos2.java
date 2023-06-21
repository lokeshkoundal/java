import java.io.FileOutputStream;
import java.io.IOException;

public class fos2 {
    public static void main(String[] args) throws IOException{

        FileOutputStream fos = new FileOutputStream("filexxxxx.txt",true);

        String s = "Hello guys chaai peelo";

        byte[] b = s.getBytes();
    
        // for(byte x : b){
        //     System.out.println(x);
        // }

        fos.write(97);
 
        fos.write(b);

        fos.flush();
        fos.close();


        // String s = "hello guys";
        // byte[] b = s.getBytes(); 
        // // fos.write(55); // single byte sent
        // fos.write(b);     //array of bytes sent
        // fos.flush();
        //System.out.println(s.getBytes());
    }
}
