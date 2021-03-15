package exercise17.task2;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class PersonClient extends Thread{
	
	@Override
	public void run() {
		try {
			final int port = 5000;
			final String host = "localhost";
			Socket client = new Socket(host, port);
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