package pr2.Circle;

public class TestCircle {
    public static void main(String[] args) {

        Circle c1 = new Circle(2.0);
        System.out.println("Radius is " + c1.getRadius()
                        + " Area is " + c1.getArea()
                        + " Length is " + c1.getLength());

        Circle c2 = new Circle(4.0);
        System.out.println("Radius is " + c2.getRadius()
                + " Area is " + c2.getArea()
                + " Length is " + c2.getLength());

        Circle c3 = new Circle(2.0);
        System.out.println("Radius is " + c3.getRadius()
                + " Area is " + c3.getArea()
                + " Length is " + c3.getLength());
        System.out.println("Circle 1 and 2: " + c1.equals(c2));
        System.out.println("Circle 2 and 3: " + c2.equals(c3));
        System.out.println("Circle 3 and 1: " + c3.equals(c1));
    }
}
