package exercise18.task3;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentList {

	public ArrayList<Student> studentList = new ArrayList<>();

	public StudentList() {
		for (int i = 10; i < 20; i++) {
			studentList.add(new Student(i));
		}
	}

	public void forEach() {
		for (Student person : studentList) {
			System.out.println(person);
		}
	}

	public void iteration() {
		Iterator<Student> iterator = studentList.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student);
		}
	}

	public static void main(String[] args) {
		StudentList studentList = new StudentList();
		studentList.forEach();
		studentList.iteration();
	}
}