package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Client client;
	private LocalDate moment = LocalDate.now();
	private OrderStatus status;
	private List<OrderItem> orderItem = new ArrayList<>();

	public Order(Client client, OrderStatus status) {
		this.client = client;
		this.status = status;
	}
	
	public void addItem(OrderItem orderItem) {
		this.orderItem.add(orderItem);
	}

	public void removeItem(OrderItem orderItem) {
		this.orderItem.remove(orderItem);
	}
	
	public Double total() {
		return this.orderItem.stream().mapToDouble(item -> item.subTotal()).sum();
	}

	public Client getClient() {
		return client;
	}

	public LocalDate getMoment() {
		return moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public List<OrderItem> getOrderItem() {
		return orderItem;
	}
}
