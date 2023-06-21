class x{
     public int x = 5;
     public x(int y){
        System.out.println("The value of x iss : " + x);
        System.out.println("The value of y is : "+ y);
     }
     x(int a,int b){
        System.out.println("The value of a iss : " + a);
        System.out.println("The value of b is : "+ b);
     }     
     x(){
        System.out.println("tatti kha !!");
     }

} 
 
 
 public class construct{
   public static void main(String[] s){
          x obj = new x(7);
          x obj2 = new x(4,7);
          x obj3 = new x();
   }

}