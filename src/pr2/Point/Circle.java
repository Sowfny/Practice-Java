package pr2.Point;

public class Circle {
    private int radius = 0;
    private Point point;

    Circle(int x, int y, int r){
        this.point = new Point(x, y);
        this.radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", point=" + point +
                '}';
    }
}

