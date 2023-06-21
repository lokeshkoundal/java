class cl{
    int a,b;
    int sum;
    cl(){

        System.out.println("Hello !!");
    }

     cl(int a,int b){
        //System.out.println("The sum of two numbers is : "+(a+b));
       this.a=a;
       this.b=b;
    }
    cl(int a,int b,int c){
        sum = a+b+c;
        System.out.println("the sum of three numbers is : " + (a+b+c));
    }
    cl(cl obj){
        System.out.println("The value of a is  : " + obj.a);
        System.out.println("The value of a is  : " + obj.b);
       // obj.a=7;        -- pass by reference 
        System.out.println(obj.sum);
    }
    

}
class B{
    B(cl obj){
        System.out.println(obj.a);
    }
}

public class constr {
    public static void main(String[] arg){
        // cl ob = new cl();
        cl obj = new cl(50,5);
        // cl obj2 = new cl(1,2,8);
        //     cl xx = new cl(obj);
            System.out.println(obj.a);
        //    System.out.println(obj instanceof cl);
        //  B obj2 = new B(obj);
            
            
    }
}
