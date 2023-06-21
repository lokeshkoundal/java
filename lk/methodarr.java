public class methodarr {
    public static void change(int[] arr){
        arr[0]=69;
    }
    public static void change(int y){
        System.out.println("The value of x is : " + y);
    }

    public static void change(String x){
        System.out.println("The value of x is : " + x);
    }

    public static void change(char x){
        System.out.println("The value of x is : " + x);
    }
    
    
    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6};
        //String s="hello";
        char c ='a';
        change(c);
        for(int x : arr){
            System.out.print(x);
            System.out.print("\t");
        }
        System.out.println(arr);
    }
}
