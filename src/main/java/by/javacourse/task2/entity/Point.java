package by.javacourse.task2.entity;

public class Point implements Cloneable {

	private double x;
	private double y;

	public Point() {

	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Point(Point other) {
		this.x = other.getX();
		this.y = other.getY();
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	@Override
	public Point clone() {
		return new Point(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}

	@Override
	public String toString() {

		return new StringBuilder()
				.append("Point x=")
				.append(x)
				.append(", y=")
				.append(y)
				.toString();
	}

}