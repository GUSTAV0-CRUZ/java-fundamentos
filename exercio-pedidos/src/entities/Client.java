package entities;

import java.time.LocalDate;

public class Client {
	private String name;
	private String email;
	private LocalDate birtDate;
	public Client(String name, String email, LocalDate birtDate) {
		super();
		this.name = name;
		this.email = email;
		this.birtDate = birtDate;
	}
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public LocalDate getBirtDate() {
		return birtDate;
	}

	public String toString() {
		return name + " (" + birtDate + ") - " + email;
	}
}
