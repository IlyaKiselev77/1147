package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    public static void main(String[] args) {
        ArrayList<Socket> usersSocket = new ArrayList<>();
        try {
            ServerSocket serverSocket = new ServerSocket(3600);
            System.out.println("Сервер запущен");
            while (true){
                Socket socket = serverSocket.accept();
                System.out.println("Подключился новый клиент");
                usersSocket.add(socket);
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                DataInputStream in = new DataInputStream(socket.getInputStream());
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        String text;
                        try {
                            out.writeUTF("Пожалуйста представьтесь");
                            String name = in.readUTF();
                            ArrayList<String> usernames = new ArrayList<>();
                            usernames.add(name);
                            while (true) {
                                text = in.readUTF();
                                System.out.println("Клиент прислал сообщение: " + text);
                                for (Socket userSocket : usersSocket) {
                                    DataOutputStream out = new DataOutputStream(userSocket.getOutputStream());
                                    out.writeUTF(usernames+text);
                                }
                            }
                        } catch (IOException exception) {
                            usersSocket.remove(socket);
                            System.out.println("Клиент отключился");
                        }
                    }
                });
                thread.start();
            }

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
