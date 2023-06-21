
public class Trycatch1 {
    static void x(int a){
        System.out.println(2/a);
    }
    public static void main(String[] args) {
        x(5);
        try{
            System.out.println(2/0);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Khatam");
        }
    }

}