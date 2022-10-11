package SC2002.question2;

public class Cylinder extends Cuboid {

	private int radius;

	public Cylinder(int height, int radius) {
		super(0, 0, height);
		this.radius = radius;
	}

	public double area() {
		return (2 * Math.PI * Math.pow(radius, 2) + 2 * Math.PI * radius * getHeight());
	}

}
