package entities;

import java.time.LocalDate;

public class HourContract {
	private LocalDate date;
	private double valuePerHour;
	private double hours;
	
	public HourContract(LocalDate date, double valuePerHour, double hours) {
		this.date = date;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}
	
	public LocalDate getDate() {
		return this.date;
	}
	
	public double totalValue() {
		return this.hours * this.valuePerHour;
	}
}
