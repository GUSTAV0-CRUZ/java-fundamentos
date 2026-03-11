package entities;

public class OrderItem {
	private Product product;
	private Integer quantity;
	private double price;
	
	public OrderItem(Product product, Integer quantity) {
		this.product = product;
		this.quantity = quantity;
		this.price = this.product.getPrice();
	}

	public double subTotal() {
		return this.price * this.quantity;
	}

	public Product getProduct() {
		return product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}
}
