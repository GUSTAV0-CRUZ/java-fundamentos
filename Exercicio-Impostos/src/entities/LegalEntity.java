package entities;

public class LegalEntity extends PersonTax {
	private int numberDeployer;

	public LegalEntity(String name, double income, int numberDeployer) {
		super(name, income);
		this.numberDeployer = numberDeployer;
	}
	
	@Override
	public double texCalculation() {
		if (this.numberDeployer <= 10) return (this.income * 0.16);
		
		return (this.income * 0.14);
	}
}
