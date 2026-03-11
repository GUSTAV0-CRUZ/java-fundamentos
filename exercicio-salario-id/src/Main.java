import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		Employee fun1 = new Employee(333, "MAria Brow", 4000.0);
		Employee fun2 = new Employee(536, "Alex Grey", 3000.0);
		Employee fun3 = new Employee(772, "Bob Green", 5000.0);
		
		List<Employee> employees = new ArrayList<>(Arrays.asList(fun1, fun2, fun3));
		
		int valueFilter = 536;
		double valueRaize= 10.0;
		
		Employee employeerRaize = employees.stream().filter(x -> x.getId() == valueFilter).findFirst().orElse(null);
		
		if (employeerRaize != null)
			employeerRaize.raiseSalary(valueRaize);
		
		for (Employee fun : employees ) {
			System.out.printf("%d: %s, %.2f%n", fun.getId(), fun.getName(), fun.getSalary());
		}
		
	}

}
