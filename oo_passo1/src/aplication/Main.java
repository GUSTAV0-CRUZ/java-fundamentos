package aplication;

import entities.Triangle;

public class Main {
	public static void main() {
		Triangle t1 = new Triangle();
		t1.base = 3.0;
		t1.leftSide = 4.0;
		t1.rightSide = 5.0;
		

		System.out.println(t1.perimeter());
		System.out.println(t1.area());
	}
}
