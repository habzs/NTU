package SC2002.question2;

public class Cone extends Pyramid {

	private int radius;
	private double l;

	public Cone(int radius, int height) {
		super(0, height);
		this.radius = radius;
	}

	public double area() {
		l = Math.sqrt(Math.pow(radius, 2) + Math.pow(getHeight(), 2));
		return Math.PI * radius * l + Math.PI * Math.pow(radius, 2);

	}

}
