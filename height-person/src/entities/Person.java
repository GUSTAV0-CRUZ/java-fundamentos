package entities;

public class Person {
	private String name;
	private int age;
	private double heigth;
	
	public Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.heigth = height;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}


	public double getHeigth() {
		return heigth;
	}

}
