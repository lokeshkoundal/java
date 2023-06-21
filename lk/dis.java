class A {
  int a, b;

  A() {
      System.out.println("using \"this\" keyword : " + this);
  }

  void assign(int a, int b) {
      this.a = a;
      this.b = b;
  }

  void calc() {
      System.out.println("Multiplication of two numbers : " + (a * b));
  }
}
class B extends A{
      B(){
        System.out.println("B class : "+this);
      }

}
 public class dis {
  public static void main(String[] args) {
      B b = new B();
      System.out.println("Printing the memory using object reference : " + b);
      
      // a.assign(10, 20);
      // a.calc();
  }
}
