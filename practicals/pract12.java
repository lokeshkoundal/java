public class pract12 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        try {
            System.out.println(numbers[6]);
        }

        
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds!");
        }

        System.out.println("-- End of the program --");
    }
}
