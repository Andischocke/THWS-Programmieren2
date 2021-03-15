package exercise20.task3;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class PersonClient {
	
	public static void main(String[] args) {
		try {
			final int PORT = 5000;
			final String HOST = "localhost";
			Socket client = new Socket(HOST, PORT);
			System.out.println("Client started!");

			Scanner scanner = new Scanner(System.in);
			ObjectOutputStream oos = new ObjectOutputStream(client.getOutputStream());

			String prename = null;
			String surname = null;
			while (true) {
				System.out.println("Create new Person");
				System.out.print("Surname: ");
				prename = scanner.nextLine();
				System.out.print("Prename: ");
				surname = scanner.nextLine();
				if (!prename.equals("") || !surname.equals("")) {
					oos.writeObject(new Person(prename, surname));
					oos.flush();
				} else {
					oos.writeObject(null);
					oos.flush();
					break;
				}
			}

			scanner.close();
			oos.close();
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}