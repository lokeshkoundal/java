class Animal {
    public void sound() {
        System.out.println("Animal is making a sound");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("Meow");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("bhauu bhauu");
    }
}

public class pract7 {
    public static void main(String[] args) {
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        animal1.sound(); 
        animal2.sound(); 
    }
}
