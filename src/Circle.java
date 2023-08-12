public class Circle {
    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }


    public double area() {
       return radius * radius * Math.PI;
    }


    // "this circle has x coordinate ... y coordinate, radius ..."
    public String report() {
       return null;
    }

    public boolean overlaps(Circle c2) {


        return false;
    }
}
