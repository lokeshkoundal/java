
public class demo {
    public static void main(String[] args) {
        String s = "Hello fraands";
        byte[] b = s.getBytes();
        for(byte x : b){
            System.out.print(x + "\t");
        }
    }
}
