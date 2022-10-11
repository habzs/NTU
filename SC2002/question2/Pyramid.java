package SC2002.question2;

public class Pyramid extends Triangle {

    private double slantheight;

    public Pyramid(int length, int height) {
        super(length, height);
    }

    public double area() {
        slantheight = Math.sqrt((super.getBase() / 2) + (super.getHeight()));
        return (Math.pow(super.getBase(), 2) + (super.getBase() * slantheight) * 4);
    }

}