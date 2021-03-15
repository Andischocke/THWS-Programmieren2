package exercise17.task1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class HangmanServer extends Thread{
	
	@Override
	public void run() {
		try {
			final int PORT = 5000;
			ServerSocket server = new ServerSocket(PORT);
			System.out.println("Server launched!");
			Socket client = server.accept();

			BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));

			Hangman hangman = new Hangman();
			hangman.start();

			String data = null;
			while ((data = br.readLine()) != null) {
				System.out.println("Received from client: " + data);
				if (data.length() != 0) {
					bw.write(hangman.guess(data) + "\n");
				} else {
					bw.write("Connection closed!\n");
				}
				bw.flush();
			}

			br.close();
			bw.close();
			client.close();
			server.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String []args) {
		try {
			Thread server = new HangmanServer();
			Thread client = new Client();
			server.start();
			client.start();
			server.join();
			client.join();
		}catch(Exception e) {
		}
	}
}