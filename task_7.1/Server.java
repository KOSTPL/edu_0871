package less_31_08_2020;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    static ArrayList<String> userNames = new ArrayList<>();//создали коллекцию names с типом данных <Socket> - список имен
    static ArrayList<Socket> clients = new ArrayList<>(); //создали коллекцию clients с типом данных <Socket> - список клиентов
    public static void main(String[] args) {
             try {
            ServerSocket serverSocket = new ServerSocket(8189);
            System.out.println("Сервер запущен");
            while (true){//цикл нужен чтобы могли подключаться несколько клиентов

                Socket socket = serverSocket.accept();//socket постоянно в цикле ждет подключения клиентов
                clients.add(socket);//Как только клиент подключился он добавляется в коллекцию
                DataInputStream in = new DataInputStream(socket.getInputStream());// определили переменные для потока ввода
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());// определили переменные для потока вывода
                System.out.println("Клиент подключился");//клиент подключился в цикле
                Thread thread = new Thread(new Runnable() {// делаем поток
                    @Override
                    public void run() {
                        String userName = null;// убрали из блока try чтобы можно было с ней работать вне него
                        try {
                            out.writeUTF("Введите свое имя :");
//                            String userName = in.readUTF();// вариант без использования коллекции пользователей userNames 12 c
                            userName = in.readUTF();
                            userNames.add(userName);
                            broadcastMsg("Клиент" + userName + "подключился", "Сервер");
                            while (true){
                                String str = in.readUTF();//прочитали что прислал клиент в кодировке UTF и сохраняем в str
                                broadcastMsg(str,userName);// сюда попадает исключение
                                System.out.println("Клиент прислал сообщение: " + str);
                            }
                        }catch (IOException e){
                            e.printStackTrace();//метод печатает сообщение об ошибке
                            System.out.println("Клиент+ " + userNames +"отключился");
                        }finally {
                            try {
                                clients.remove(socket);
                                userNames.remove(userName);
                                socket.close();
                            }catch (IOException e){
                                e.printStackTrace();
                            }

                        }
                    }
                });
                thread.start();//поток запускается как только подключается клиент
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public static void broadcastMsg(String str, String userName) throws IOException{// метод отправляет всем клиентам, throws IOException перебрасывает сообщение об ошибке выше
        DataOutputStream out;
        for (Socket socket : clients){
            out = new DataOutputStream(socket.getOutputStream());
            out.writeUTF(userName +" :" + str);// ответ сервера клиенту после чего переходим на tring str = in.readUTF(); и снова ждем что пришлет клиент
        //out.writeUTF уйдет в socket.getOutputStream а socket - тот кто присоеденился к серверу socket = serverSocket.accept();
        }
    }
}
