package exercise17.task2;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class PersonServer extends Thread {
	
	@Override
	public void run() {
		try {
			final int port = 5000;
			ServerSocket server = new ServerSocket(port);
			System.out.println("Server launched!");
			Socket client = server.accept();
			
			ObjectInputStream ois = new ObjectInputStream(client.getInputStream());
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("resources\\output\\exercise17Person.txt"));
			
			ArrayList<Person> persons = new ArrayList<>();
			
			Object object = null;
			while ((object = ois.readObject()) != null) {
				persons.add((Person) object);
			}
			oos.writeObject(persons);
			oos.flush();
			
			oos.close();
			ois.close();
			client.close();
			server.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main (String [] args) {
		try {
			Thread server = new PersonServer();
			Thread client = new PersonClient();
			server.start();
			client.start();
			server.join();
			client.join();
		}catch(Exception e) {
		}
	}
}