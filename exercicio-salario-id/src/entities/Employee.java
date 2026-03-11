package entities;

public class Employee {
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	
	public void raiseSalary(double pocentRaize) {
		double porcent = pocentRaize + 100.0;
		
		this.salary *= porcent / 100.0;
	}

}
