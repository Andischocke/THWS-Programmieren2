package exercise18.task3;

public class Student {
	public int matriculationNumber;
	
	public Student (int matriculationNumber) {
		this.matriculationNumber = matriculationNumber;
	}
	
	public String toString() {
		return String.format("MatriculationNumber: %d", matriculationNumber);
	}
}