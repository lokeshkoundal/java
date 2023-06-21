import java.io.FileInputStream;

public class twr {
    public static void main(String[] args){

       try( FileInputStream fis = new FileInputStream("file.txt")){

       }
       catch (Exception e) {
        // TODO: handle exception
       }

    }
}
