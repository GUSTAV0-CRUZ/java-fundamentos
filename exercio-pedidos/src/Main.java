import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data: ");
		String name = "Alex Green";
		String email = "alex@gmail.com";
		DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String birthDate = "15/03/1985";
		
		LocalDate birthDateFormated = LocalDate.parse(birthDate, formatDate);

		Client client = new Client(name, email, birthDateFormated);
		
		
		System.out.println("Enter order data: ");
		OrderStatus status = OrderStatus.PROCESSING;
		
		Order order = new Order(client, status);
		
		System.out.println("How many items to this order: ");
		int itemsAdd = sc.nextInt();
		
		for (int i = 0; i < itemsAdd; i++) {
			System.out.printf("Enter #%d item data: %n", i + 1);
			
			System.out.println("Protuct name: ");
			String nameItem = sc.next();
			
			System.out.println("Protuct price: ");
			double priceItem = sc.nextDouble();
			
			System.out.println("Quantity: ");
			int quantity = sc.nextInt();

			Product product = new Product(nameItem, priceItem);
			OrderItem orderItem = new OrderItem(product, quantity);
			order.addItem(orderItem);
		}
		
		System.out.println("Order summary: ");
		
		System.out.println("Order moment: " + order.getMoment());
		
		System.out.println("Order status: " + order.getStatus());
		
		System.out.println("Client: " + order.getClient());
		
		System.out.println("Order items: ");
		
		for (OrderItem item : order.getOrderItem()) {
			System.out.print(item.getProduct().getName());
			System.out.printf(", $%.2f, ", item.getPrice());
			System.out.printf("Quantity: ", item.getQuantity());
			System.out.printf(", Subtotal: " + item.subTotal() + "%n");
		}
		
		sc.close();
	}

}
