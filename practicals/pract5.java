class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

class Labrador extends Dog {
    void color() {
        System.out.println("Labrador is black in color.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing.");
    }
}

public class pract5 {
    public static void main(String[] args) {
        Labrador labrador = new Labrador();
        labrador.eat();   
        labrador.bark();  
        labrador.color(); 

        System.out.println();

        Cat cat = new Cat();
        cat.eat();   
        cat.meow(); 
    }
}
