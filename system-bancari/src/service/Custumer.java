package service;

public class Custumer {
	private final int numberAcount;
	private String name;
	private double balance;
	
	public Custumer(int numberAcount, String name) {
		this(numberAcount, name, 0.0);
	}
	
	public Custumer(int numberAcount, String name, double balance) {
		this.numberAcount = numberAcount;
		this.name = name;
		this.balance = balance;
	}
	
	public void deposit(double value) {
		if (value < 0)
			return;
		
		this.balance += value;
	}

	public double sake(double value) {
		this.balance -= (value + 5.00);
		return value;
	}
	
	public String toString() {
		return "Custumer: "
				+ this.numberAcount
				+" "
				+ this.name
				+" "
				+ this.balance;
	}
		
	}
