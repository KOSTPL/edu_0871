package oldclient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {//основной поток main
        try {
            Socket socket = new Socket("localhost",8189);//подключение к ip сервера у нас - localhost
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            System.out.println("Наберите имя в консоль : ");
            Scanner scanner = new Scanner(System.in);// ждем когда пользователь наберет в консоль
            Thread responseThread = new Thread(new Runnable() {//создаем второй (ответный) поток responseThread как придет сообщение от сервера выводится на экран
                @Override
                public void run() {
                    while (true){
                        String response = null;
                        try {
                            response = in.readUTF();// поток ждет ответа от сервера, если пришло вывел на экран
                            System.out.println(response);//если пришло вывел на экран, нет пропустил
                        } catch (IOException exception) {
                            exception.printStackTrace();
                        }
                    }
                }
            });
            responseThread.start();// запуск ответного потока
            while (true){
                String str = scanner.nextLine();
                out.writeUTF(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
