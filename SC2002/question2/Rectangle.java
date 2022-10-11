package SC2002.question2;

public class Rectangle implements Shape {
    private int width, breadth;

    public Rectangle(int width, int breadth) {
        this.width = width;
        this.breadth = breadth;
    }

    public double area() {
        return width * breadth;
    }

    public double getWidth() {
        return this.width;
    }

    public double getBreadth() {
        return this.breadth;
    }
}
