package SC2002.question2;

public class Cuboid extends Rectangle {
    private int height;

    public Cuboid(int width, int breadth, int height) {
        super(width, breadth);
        this.height = height;
    }

    public double area() {
        return (super.area() + height * super.getBreadth() + height * super.getWidth()) * 2;
    }

    public double getHeight() {
        return this.height;
    }
}
