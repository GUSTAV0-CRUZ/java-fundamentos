import java.util.Locale;

public class Main {
	public static void main() {
		Locale.setDefault(Locale.US);
		String name = "Gustavo";
		int age = 20;
		double wage = 12000.845;
		
		
		System.out.println("Hello world");
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(wage);
		
		System.out.printf("i'm %s have %d and gain %.2f%n", name, age, wage);
	}
}
