package entities;

public class Triangle {
	public double base = 9.0;
	public double rightSide = 9.0;
	public double leftSide = 9.0;
	
	public double perimeter() {
		return (this.base + this.rightSide + this.leftSide) / 2;
	}
	
	public double area () {
		double p = this.perimeter();
		return Math.sqrt(p * (p - this.base) * (p - this.rightSide) * (p - this.leftSide));
	}
}
