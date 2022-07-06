package exer;

public class Triangle {
    private double base;
    private double height;

    public Triangle() {}
    public Triangle(double base, double height) {
        setBase(base);
        setHeight(height);
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return (base * height) / 2;
    }
}
