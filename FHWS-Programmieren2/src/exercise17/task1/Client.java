package exercise17.task1;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client extends Thread {
	
	@Override
	public void run() {
		try {
			final int PORT = 5000;
			final String HOST = "localhost";
			Socket client = new Socket(HOST, PORT);
			System.out.println("Client started!");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			Scanner scanner = new Scanner(System.in);
			
			String message = "true";
			while (!message.equals("")) {
				System.out.print("Message: ");
				message = scanner.nextLine();
				bw.write(message + "\n");
				bw.flush();
				System.out.println("Client received: " + br.readLine());
			}
			
			scanner.close();
			br.close();
			bw.close();
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}