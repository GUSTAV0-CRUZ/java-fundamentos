package exercicio_project;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main() {
		System.out.println("inicio");
		Locale.setDefault(new Locale("US"));
		Scanner sc = new Scanner(System.in);
		int nine = 9;
		
		
		double entry;
		
		entry = sc.nextDouble();
		
		double result = 3.14159 * Math.pow(entry, 2.0);
		
		System.out.printf("Result: %.4f", result);
		System.out.println(nine);
		System.out.println("Fim.");
		sc.close();
	}
}
