package entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Instructor {
	private String name;
	private ArrayList<Couser> courses = new ArrayList<>();
	
	public Instructor(String name) {
		this.name = name;
	}
	
	public void addCourse(Couser course) {
		this.courses.add(course);
	}
	
	public int studantTotal() {
		Set<Integer> studentsUnity = new HashSet<>();
		for (Couser course : this.courses) {
			for (int studantCode : course.getStudants()) {
			studentsUnity.add(studantCode);
			}			
		}
		return studentsUnity.size();
	}

	public ArrayList<Couser> getCourses() {
		return this.courses;
	}

	@Override
	public String toString() {
		return "Instructor [name=" + name + ", course=" + courses + "]";
	}
}
