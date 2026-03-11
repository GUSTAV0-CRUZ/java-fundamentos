import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Main {
	public static void main() {
		Locale.setDefault(Locale.US);;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantity person to add: ");
		int vectorLength = sc.nextInt();
		
		Person[] people = new Person[vectorLength];
		
		double sumHeight = 0.0;
		int peopleAgeSmallSixteen = 0;
		for (int i = 0; i < people.length; i++) {
			System.out.println("Add Person: " + (i + 1));
			System.out.print("Add name: ");
			String name = sc.next();
			
			System.out.print("Add age: ");
			int age = sc.nextInt();
			
			System.out.print("Add height: ");
			double height = sc.nextDouble();
			
			people[i] = new Person(name, age, height);
			
			sumHeight += people[i].getHeigth();
			if (people[i].getAge() < 16) {
				peopleAgeSmallSixteen += 1;
			}
		}
		
		System.out.println();
		System.out.printf("Average of height the people: %.2f%n ", sumHeight / people.length);
		System.out.printf("Average of people with age small sixteen: %.2f%%%n ", (double)((double) peopleAgeSmallSixteen / (double) people.length) * 100.0);
		
		sc.close();
	}
}
