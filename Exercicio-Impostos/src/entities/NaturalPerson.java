package entities;

public class NaturalPerson extends PersonTax {
	private double healthExpenditures;
	
	
	public NaturalPerson(String name, double income, double healthExpenditures) {
		super(name, income);
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double texCalculation() {
		double healthExpendituresWithDiscount = this.healthExpenditures * 0.5;
		
		if (this.income < 2000) return (this.income * 0.15)- healthExpendituresWithDiscount;
		
		return (this.income * 0.25)- healthExpendituresWithDiscount;
	}
}
