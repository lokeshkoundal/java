
abstract class Vehicle {
    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public abstract void accelerate();

    public final void startEngine() {
        System.out.println("Starting the engine of " + brand+"..\n");
    }
}

class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    public void accelerate() {
        System.out.println(brand+" is accelerating...");
    }
}

public class pract9 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        Car car = new Car("Ferrari");
        car.startEngine();
        car.accelerate();

        
    }
}
