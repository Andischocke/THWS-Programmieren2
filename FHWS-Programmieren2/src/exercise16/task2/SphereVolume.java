package exercise16.task2;

public class SphereVolume {

	public static double calculateSphereVolume(double radius) {
		double d = Math.abs((4.0 / 3.0) * Math.PI * radius * radius * radius);
		System.out.println(d);
		return d;
	}
}
// c) Fehlerbehebung der Formel:
// Intergerwerte zu Doublewerte umwandeln
// Betrag des Ergebnisses nehmen, da es kein negatives Volumen gibt