package entities;

public class Person {
	String name;
	String email;
	int numberRoom;
	
	public Person(String name, String email, int numberRoom) {
		this.name = name;
		this.email = email;
		this.numberRoom = numberRoom;
	}

	public int getNumberRoom() {
		return numberRoom;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
}
