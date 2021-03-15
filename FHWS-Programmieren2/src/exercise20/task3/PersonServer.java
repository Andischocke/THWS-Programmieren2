package exercise20.task3;

import java.net.ServerSocket;
import java.net.Socket;

public class PersonServer {
	
	@SuppressWarnings("all")
	public static void main(String[] args) {
		try {
			final int port = 5000;
			ServerSocket server = new ServerSocket(port);
			System.out.println("Server launched!");

			while (true) {
				Socket client = server.accept();
				new PersonServerThread(client).start();
			}
		} catch (Exception e) {
		}
	}
}