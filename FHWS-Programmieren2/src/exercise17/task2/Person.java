package exercise17.task2;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = -7450072808380315217L;
	public String prename;
	public String surname;

	public Person(String prename, String surname) {
		this.prename = prename;
		this.surname = surname;
	}

	@Override
	public String toString()
	{
		return "Person{" +
				"prename='" + prename + '\'' +
				", surname='" + surname + '\'' +
				'}';
	}
}