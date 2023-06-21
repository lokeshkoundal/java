class A {
    int a, b;

    A() {
        this(1);
        System.out.println("Printing reference using 'this' keyword : " + this);
    }
    A(int a){
        System.out.println("This is parametarized constructor called using 'this' keyword !!");
    }

    void assign(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void calc() {
        System.out.println("Multiplication of a and b : " + (a * b));
    }
}

public class pract4 {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println("Printing the reference using object name : " + obj);

        obj.assign(10, 20);
        obj.calc();
    }
}