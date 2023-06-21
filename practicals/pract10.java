interface Area {
    double PI = 3.14;
    void calculateArea();
}

interface Perimeter {
    double PI = 3.1415;
    void calculatePerimeter();
}

class Circle implements Area, Perimeter {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double area = Area.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * Perimeter.PI * radius;
        System.out.println("Perimeter of the circle: " + perimeter);
    }
}

public class pract10 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.calculateArea();
        circle.calculatePerimeter();
    }
}
