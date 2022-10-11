package SC2002.question2;

public class Sphere extends Circle {
    public Sphere(int rad) {
        super(rad);
    }

    public double area() {
        return 4 * super.area();
    }
}
