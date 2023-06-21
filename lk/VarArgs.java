public class VarArgs {

    public static int func(int ...arr){
        
         int sum=0;
         for(int x : arr){
            sum = sum + x;
         }
         System.out.print("Sum is : ");
         return sum;

    }
    public static void main(String[] arg){
        int a=1;
        int c=3;
        int b=2;
        int d=4;
        int x = func(a,b,c,d);
        System.out.println(x);
     

       System.out.print(func(4,5,3,5,6,3,2,4));

    }
}
//sum is 10
//sum is 32