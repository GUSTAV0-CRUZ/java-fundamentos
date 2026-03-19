package entities;

public abstract class PersonTax {
	protected String name;
	protected double income;
	
	public PersonTax(String name, double income) {
		this.name = name;
		this.income = income;
	}

	public abstract double texCalculation();
	
	public String getName() {
		return this.name;
	}
}
