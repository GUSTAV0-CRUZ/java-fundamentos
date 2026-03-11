import entities.Person;

public class Main {

	public static void main(String[] args) {
		Person[] rooms = new Person[10];
		
		Person person1 = new Person("Marco Antônio", "marco@gmail.com", 1);

		Person person2 = new Person("Maria Green", "maria@gmail.com", 5);

		Person person3 = new Person("Alex Grey", "alex@gmail.com", 8);

		Person[] people = new Person[]{person1, person3, person2};
		
		for (int i = 0; i < people.length; i++) {
			if (rooms[people[i].getNumberRoom()] == null) {
				rooms[people[i].getNumberRoom()] = people[i];				
			}
		}
			
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.println(rooms[i].getName());
				System.out.println(rooms[i].getEmail());
				System.out.println();
			}
		}
	}

}
