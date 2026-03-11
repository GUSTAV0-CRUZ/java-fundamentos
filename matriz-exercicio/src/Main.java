import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Add line and colum matriz");
		int[][] mat = new int[sc.nextInt()][sc.nextInt()];
		
		System.out.println("Add values");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		
		System.out.println("Select one number: ");
		
		int numberChosen = sc.nextInt();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == numberChosen) {
					System.out.println("Position: " + i + ", " + j);

					if (j - 1  >= 0)
						System.out.println("left: " + mat[i][j - 1]);

					if (j + 1  <= mat.length)
						System.out.println("rigth: " + mat[i][j + 1]);

					if (i - 1  >= 0)
						System.out.println("up: " + mat[i - 1][j]);

					if (i + 1  <= mat.length)
						System.out.println("down: " + mat[i + 1][j]);
					
					System.out.println();
				}
			}
		}
		
		System.out.println();

		
		sc.close();
	}

}
