import java.io.FileOutputStream;
import java.io.IOException;

public class fosAppend {
    public static void main(String[] args) throws IOException{
        FileOutputStream fos = new FileOutputStream("file.txt",true);
        String s = "hello guys";
        byte[] b = s.getBytes(); 
        fos.write(55); // single byte sent
        fos.write(b);     //array of bytes sent
        fos.flush();
    }
}
