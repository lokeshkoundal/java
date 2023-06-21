public class pract3 {
    private static int staticVariable = 0;

    static {
        System.out.println("This is a static block !");
        staticVariable = 10;
    }

    public static void staticMethod() {
        System.out.println("This is a static method , It can be called without an object !");
        System.out.println("Value of staticVariable: " + staticVariable);
    }

    public static void main(String[] args) {
        System.out.println("Value of staticVariable: " + staticVariable);

        
        staticMethod();
    }
}
