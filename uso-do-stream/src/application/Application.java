package application;

import entities.Employee;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter full file path: ");
    String pathFile = sc.nextLine();

    System.out.println("Enter salary:");
    double salaryChosen = sc.nextDouble();

    try (Scanner scanner = new Scanner(new File(pathFile))) {
      List<Employee> employees = new ArrayList<>();

      while (scanner.hasNextLine()) {
        String[] line = scanner.nextLine().split(",");
        String name = line[0];
        String email = line[1];
        double salary = Double.parseDouble(line[2]);

        employees.add(new Employee(name, email, salary));
      }

      double sumSalaryStartsWithM = employees.stream()
              .filter(e -> e.getName().toLowerCase().startsWith("m"))
              .mapToDouble(Employee::getSalary)
              .sum();

      List<String> emailOfEmployees = employees.stream()
              .filter(e -> e.getSalary() > salaryChosen)
              .map(Employee::getEmail)
              .sorted()
              .toList();

      System.out.printf("Email of people whose salary is more than %.2f : \n", salaryChosen);
      emailOfEmployees.forEach(System.out::println);

      System.out.println("Sum of salary of people whose name starts with 'M': " + sumSalaryStartsWithM);
    } catch (Exception error) {
      System.out.println("Error in file");
      System.out.println(error.getMessage());
    }
    sc.close();
  }
}
