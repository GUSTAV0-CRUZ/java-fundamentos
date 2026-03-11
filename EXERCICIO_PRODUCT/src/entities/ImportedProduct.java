package entities;

public class ImportedProduct extends Product {
	private Double customesFee;
	
	public ImportedProduct(String name, Double price, Double customesFee) {
		super(name, price);
		this.customesFee = customesFee;
	}
	
	public Double totalPrice() {
		return this.price + this.customesFee;
	}
	
	@Override
	public String priceTag() {
		return this.getName() + " $ " + this.totalPrice() + "( customes Fee: $ " + this.customesFee + ")";
	}
}
