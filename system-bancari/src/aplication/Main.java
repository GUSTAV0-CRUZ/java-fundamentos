package aplication;

import service.Custumer;

public class Main {
	public void main() {
		Custumer client1 = new Custumer(1423561, "Gustavo", 5000);
		
		client1.deposit(3500);
		
		client1.sake(100);
		
		client1.sake(100);
		
		System.out.println(client1.toString());
		
	}
}
