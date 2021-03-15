package exercise20.task3;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class PersonServerThread extends Thread {
    public Socket client;
    
    public PersonServerThread(Socket client) {
        this.client = client;
    }
    
    @Override
    public void run() {
        try {
            ObjectInputStream ois = new ObjectInputStream(client.getInputStream());
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data\\output\\exercise20task3_PersonObject.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("data\\output\\exercise20task3_PersonText.txt", true));
            ArrayList<Person> persons = new ArrayList<>();
            
            Object object = null;
            while ((object = ois.readObject()) != null) {
                persons.add((Person) object);
                bw.write(String.format("%s", (Person) object));
                bw.newLine();
                bw.flush();
            }
            oos.writeObject(persons);
            
            bw.close();
            oos.close();
            ois.close();
            client.close();
        } catch (Exception e) {
        }
    }
}