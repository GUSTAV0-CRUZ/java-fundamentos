import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter department name: ");
		
		Department department = new Department(sc.next());
		
		System.out.println("Enter worker data: ");
		System.out.println("Name: ");
		
		String name = sc.next();
		
		System.out.println("Leval: ");
		
		String workerLevelString = sc.next().toUpperCase();
		WorkerLevel level = WorkerLevel.valueOf(workerLevelString) ;
		
		System.out.println("Base salary: ");
		
		double baseSalary = sc.nextDouble();
		Worker worker = new Worker(name, baseSalary, level, department);
		
		System.out.println();
		System.out.println("How many contracts to this worker? ");
		
		int howContracts = sc.nextInt();
		
		for (int i = 0; i < howContracts; i++) {
			System.out.printf("Enter contract #%d data ", i + 1);
			System.out.println("Date (YYYY/MM/DD): ");
			
			DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("yyyy/MM/dd");
			String dateString = sc.next();
			LocalDate date = LocalDate.parse(dateString, formatDate);
			
			System.out.println("Value per hour: ");
			
			double valuePerHour = sc.nextDouble();
			
			System.out.println("Duration (hours): ");
			
			double durationHour = sc.nextDouble();
			
			HourContract hourContract = new HourContract(date, valuePerHour, durationHour);
			
			worker.addContract(hourContract);
			
			
		}

		System.out.println("Enter month and year to calculate incom: (MM YYYY): ");
		
		Integer month = sc.nextInt();
		Integer year = sc.nextInt();
		
		double selectedIncome = worker.income(year, month);
		String selectedDepartment = worker.getDepartment();
		String nameOfWorker = worker.getName();
		
		System.out.println();
		System.out.println("Name: "+ nameOfWorker);
		
		System.out.println("Department: " + selectedDepartment);
		
		System.out.println("Income for: " + selectedIncome);
		
		sc.close();
	}

}
