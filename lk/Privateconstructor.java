
class A{
   private  A(){
        System.out.println("Hello");
    }
}

public class Privateconstructor {
       Privateconstructor(){
          System.out.println("Hello");
      }
    public static void main(String[] args) {
        Privateconstructor obj = new Privateconstructor();
        //A obj2 = new A();      //error
    }
}






// class student{

//     static student obj = new student();
//     static student obj2 = new student(5);
//     private student(int a){
//         System.out.println(a);
//     }
//     private student(){
//         System.out.println("This is private constructor");
//     }
//     static student getIn(){
//         return obj2;
//     }
//     static student getInstane(){
//            return obj;
//     }
// }
// class Main{
//     public static void main(String[] args) {
//         student obj = student.getInstane();
//         student obj2 = student.getIn();
//         System.out.println(obj);
//         System.out.println(obj2);

//     }
// }
