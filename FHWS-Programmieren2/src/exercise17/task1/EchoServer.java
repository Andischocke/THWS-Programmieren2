package exercise17.task1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer extends Thread {

	@Override
	public void run() {
		try {
			final int PORT = 5000;
			ServerSocket server = new ServerSocket(PORT);
			System.out.println("Server launched!");
			Socket client = server.accept();
			System.out.println("Server connected!");

			BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));

			String data = null;
			while ((data = br.readLine()) != null) {
				System.out.println("Server received: " + data);
				if (data.length() > 0) {
					bw.write("Server recieved Massage\n");
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

	public static void main(String[] arg) {
		try {
			Thread server = new EchoServer();
			Thread client = new Client();
			server.start();
			client.start();
			server.join();
			client.join();
		} catch (Exception e) {
		}
	}
}