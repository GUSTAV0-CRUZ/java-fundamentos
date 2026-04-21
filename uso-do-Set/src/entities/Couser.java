package entities;

import java.util.ArrayList;

public class Couser {
	private String name;
	private ArrayList<Integer> students = new ArrayList<>();

	public Couser(String name) {
		this.name = name;
	}
	
	public void addStudants(int[] studantsCode) {
		for (int studant : studantsCode) {
			this.students.add(studant);
		}
	}

	public String getName() {
		return this.name;
	}

	public ArrayList<Integer> getStudants () {
		return this.students;
	}

	@Override
	public String toString() {
		return "Couser [name=" + name + ", studants=" + students + "]";
	}
	
}
