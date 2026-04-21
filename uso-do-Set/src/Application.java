import java.util.Scanner;

import entities.Couser;
import entities.Instructor;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Instructor instructor = new Instructor("Alex");
		Couser course1 = new Couser("A");
		Couser course2 = new Couser("B");
		Couser course3 = new Couser("C");
		
		instructor.addCourse(course1);
		instructor.addCourse(course2);
		instructor.addCourse(course3);
		
		for (Couser course : instructor.getCourses()) {
			System.out.println("How many students for course" + " " + course.getName());
			int quantity = sc.nextInt();
			int[] studants = new int[quantity];
			for (int i = 0; i < quantity; i++) {
				studants[i] = sc.nextInt();
			}
			course.addStudants(studants);
		}
		System.out.println("Total students" + " " + instructor.studantTotal());
		sc.close();
	}

}
