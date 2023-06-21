import java.io.*;
import java.util.Scanner;

public class A{
 public static void main(String[] args) throws IOException{
    //create file

    File file = new File("lk.txt");
    if(!(file.exists())){
      file.createNewFile();
    }

    //write

    FileWriter fr = new FileWriter("lk.txt");
    fr.write("ye string file me jaayegi !!\nye hai second line");
    fr.append(" Guddi sikhra te jatt di ");
    fr.close();

    //reading

    File frr = new File("lk.txt");
    Scanner sc = new Scanner(frr);
    while(sc.hasNextLine()){
      String line = sc.nextLine();
      System.out.println(line);
    }
    sc.close();

    //deleting
     if(frr.delete()){
      System.out.println(" ----file Deleted-----"+ frr.getName());
     }
     else{
      System.out.println("Coudnt delete" + frr.getName());
     }
   
     System.err.println("Errrorr");
     
}
}