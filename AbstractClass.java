abstract class Shape {
    abstract double area();
    void describe() { System.out.println("Area of the shape: " + area()); }
}
class Circle extends Shape {
    private double radius;
    Circle(double radius) { this.radius = radius; }
    double area() { return Math.PI * radius * radius; }
}
public class AbstractClass {
    public static void main(String[] args) {
        Shape s = new Circle(5);
        s.describe();
    }
}
