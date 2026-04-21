import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file full path: ");
		String filePath = sc.nextLine();
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			Map<String, Integer> voteCount = new HashMap<>();
			String line;
			while ((line = br.readLine()) != null) {
				String[] nameAndVotes = line.split(",");
				Integer vote = Integer.valueOf(nameAndVotes[1]);
				String name = nameAndVotes[0];
				voteCount.put(name, voteCount.getOrDefault(name, 0) + vote);
			}
			for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}
		} catch (Exception error) {
			System.out.println("Error:");
			System.out.println(error.getMessage());
			error.getStackTrace();
		} finally {
			sc.close();
		}
	}
}
