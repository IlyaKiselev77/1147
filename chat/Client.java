package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Socket socket = new Socket("0.0.0.0", 3600);
            System.out.println("Успешно подключен!");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true){
                            String response = in.readUTF();
                            System.out.println(response);
                        }
                    }catch (IOException e){
                        System.out.println("Соединение разорвано");
                    }
                }
            });
            thread.start();

            while (true){
                System.out.println("Введите сообщение: ");
                String text = scanner.nextLine();
                out.writeUTF(text);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
