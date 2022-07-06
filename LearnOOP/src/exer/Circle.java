package exer;

public class Circle {
    double radius;

    public static void main(String[] args) {
        System.out.println(new Circle(2).findArea());
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double findArea() {
        return Math.PI * radius * radius;
    }
}
