package Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class ChatServerFile {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket=new ServerSocket(6000);
        System.out.println("Server started, waiting for client...");
        Socket socket = serverSocket.accept();
        System.out.println("Client connected!");


        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));


        Thread receiveThread = new Thread(() -> {
            try {
                String msg;
                while ((msg = in.readLine()) != null) {
                    System.out.println("Client: " + msg);
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
        serverSocket.close();

    }
}
