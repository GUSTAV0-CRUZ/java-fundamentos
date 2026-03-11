import java.util.Scanner;

public class Main {
	public static void main() {
		Scanner sc = new Scanner(System.in);
		
		String name, phrase;
		int age;
		boolean studant;
		char firstLetter;
		
		name = sc.next();
		age = sc.nextInt();
		studant = sc.nextBoolean();
		firstLetter = sc.next().charAt(0);
		sc.nextLine();
		phrase = sc.nextLine();
		
		System.out.println("Name user: " + name);
		System.out.println("age: " + age);
		System.out.println("studant: " + studant);
		System.out.println("firstLetter: " + firstLetter);
		System.out.println("phrase: " + phrase);
		sc.close();
	}
}
