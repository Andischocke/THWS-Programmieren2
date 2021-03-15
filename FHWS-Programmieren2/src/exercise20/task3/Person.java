package exercise20.task3;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = -7450072808380315217L;
	public String prename;
	public String surname;

	public Person(String prename, String surname) {
		this.prename = prename;
		this.surname = surname;
	}
	
	public String toString() {
		return String.format("Person: %s %s", prename, surname);
	}
}