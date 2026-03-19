import entities.LegalEntity;
import entities.NaturalPerson;
import entities.PersonTax;

public class Main {

	public static void main(String[] args) {
		PersonTax individualOne = new NaturalPerson("Alex", 50000.00, 2000.00);
		PersonTax company = new LegalEntity("SoftTech", 400000.00, 25);
		PersonTax individualTwo = new NaturalPerson("Bob", 120000.00, 1000.00);
		
		
		PersonTax[] personalTaxes  = new PersonTax[]{individualOne, company, individualTwo};
		
		double totalTax = 0;
		System.out.println("Taxes paid: ");
		for (PersonTax personTax : personalTaxes) {
			System.out.print(personTax.getName() + ": " );
			System.out.printf("$ %.2f%n", personTax.texCalculation());
			totalTax += personTax.texCalculation();
		}
		System.out.printf("Total taxes: $ %.2f%n", totalTax);
	}
}
