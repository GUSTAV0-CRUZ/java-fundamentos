package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	private final String name;
	private double baseSalary;
	private WorkerLevel level;
	private List<HourContract> contracts = new ArrayList<HourContract>();
	private Department department;
	
	public Worker(String name, double baseSalary, WorkerLevel level, Department department) {
		super();
		this.name = name;
		this.baseSalary = baseSalary;
		this.level = level;
		this.department = department;
	}
	
	public void addContract(HourContract contract) {
		this.contracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		int IndexContract = this.contracts.indexOf(contract);
		
		if (IndexContract == -1)
			return;
		
		this.contracts.remove(IndexContract);
	}

	public double income(Integer year, Integer month) {
		double income = this.contracts.stream()
			.filter(contract -> contract.getDate().getYear() == year && contract.getDate().getMonthValue() == month)
			.mapToDouble(contract -> contract.totalValue())
			.sum();
		
		return income + this.baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public String getName() {
		return name;
	}
	
	public String getDepartment() {
		return this.department.getName();
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", baseSalary=" + baseSalary + ", level=" + level + ", contracts=" + contracts
				+ ", department=" + department + "]";
	}
	
	
}
