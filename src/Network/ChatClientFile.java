package Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class ChatClientFile {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 6000);
        System.out.println("Connected to server!");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));


        Thread receiveThread = new Thread(() -> {
            try {
                String msg;
                while ((msg = in.readLine()) != null) {
                    System.out.println("Server: " + msg);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        receiveThread.start();

        String input;
        while ((input = console.readLine()) != null) {
            out.println(input);
        }

        socket.close();
    }
}
