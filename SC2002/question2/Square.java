package SC2002.question2;

public class Square implements Shape {
    private int length;

    public Square(int length) {
        this.length = length;
    }

    public double area() {
        return length * length;
    }

}
