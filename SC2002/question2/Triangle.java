package SC2002.question2;

public class Triangle implements Shape {
    private int base, height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public double area() {
        return 0.5 * this.base * this.height;
    }

    public double getBase() {
        return this.base;
    }

    public double getHeight() {
        return this.height;
    }

}
