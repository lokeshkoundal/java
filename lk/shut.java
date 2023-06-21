import java.io.IOException;

public class shut {
   public static void main(String[] args) throws IOException {
       String sdc;
    //    String operatingSystem = System.getProperty("os.name");
    //    System.out.println(operatingSystem);

       sdc = "shutdown.exe -s -t 0";

       ProcessBuilder pb = new ProcessBuilder(sdc.split(" "));
       pb.start();
   }
}
