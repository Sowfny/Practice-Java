package pr2.Circle;
public class Circle {
    private double radius;
    public Circle(double r) {radius = r;}
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getLength() {
        return 2 * radius * Math.PI;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }
}