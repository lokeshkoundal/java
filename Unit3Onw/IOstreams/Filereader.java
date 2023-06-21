import java.io.*;
public class Filereader {
    public static void main(String[] args)throws IOException {
        FileReader fr = new FileReader("file.txt");
        //int i=fr.read();
        int i = fr.read();
        System.out.println(i);
        while(i!=-1){
            System.out.print((char)i);
            i = fr.read();
        }
    }
}
