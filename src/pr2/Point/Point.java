package pr2.Point;

public class Point {
    private int x=0, y=0;


    Point(int x, int y){
        this.SetXY(x, y);
    }

    Point(){}

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void SetXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void move(int x1, int y1) {
        this.x += x1;
        this.y += y1;
    }


    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
