import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {
    public static void main(String[] args) throws IOException{
        FileWriter fr = new FileWriter("file.txt");

       fr.write(97);  //Writing single character to the file !
       fr.write(" Hello guyss  haii peeelooo !"); //Writing a string to the file directly 


        char[] b = {'x','y','x'};
        fr.write(b);   // --  writing using character array

        fr.flush();
        System.out.println(fr.getEncoding());
        fr.close();
    }
}
