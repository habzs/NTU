package SC2002.question2;

public class Circle implements Shape {
    private int rad;

    public Circle(int rad) {
        this.rad = rad;
    }

    public double area() {
        return 3.14159 * this.rad * this.rad;
    }
}
