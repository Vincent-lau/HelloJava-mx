public class Rectangle {

    // fields
    // constructors
    // methods


    private String name;
    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle("r", 5, 2);
        Rectangle rect2 = new Rectangle("s", 7, 4);

        System.out.println(rect.name);

    }

}
