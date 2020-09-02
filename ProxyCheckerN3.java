package less_28_08_2020;

import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

public class ProxyCheckerN3 {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("D://java/test.txt");
        int c;
        String ipList = "";
        while ((c=reader.read())!=-1) {
            ipList += (char) c;
        }
        String[] ipListArray = ipList.split("\r");
        for (int i = 0; i < ipListArray.length; i++) {
            String[] splitString = ipListArray[i].split(":");
            String ip = splitString[0].trim();
            int port = Integer.parseInt(splitString[1]);
            MyThread t1 = new MyThread(ip,port);// в методе main создаем экземпляр класса MyThread и назовем его t1 (яявляется потоком)
            MyThread t2 = new MyThread(ip,port); // в методе main создаем экземпляр класса MyThread и назовем его t2 (является потоком)
            t1.start();//для запуска потока t1 вызываем метод start, который запустит метод run
            t2.start();//для запуска потока t2 вызываем метод start, который запустит метод run
        }
    }
}

class MyThread extends Thread{ // способ 1 с использованием класса Thread- создали класс MyThread который расширяет класс Thread (унаследовались от Thread)
    String ip;
    int port;
    public MyThread (String ip, int port) {
        this.ip = ip;
        this.port = port;
    }
    @Override
    public void run(){//реализуем метод run в котором пишем код для работы потока
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ip, port));

        try {
            URLConnection connection = new URL("https://vozhzhaev.ru/test.php").openConnection(proxy);

            InputStream is = connection.getInputStream();
            InputStreamReader reader = new InputStreamReader(is);
            char[] buffer = new char[256];
            int rc;

            StringBuilder sb = new StringBuilder();

            while ((rc = reader.read(buffer)) != -1)
                sb.append(buffer, 0, rc);

            reader.close();

            System.out.println(getName()+"- ip: "+ip+":"+port+" - ДОСТУПЕН");
        }catch (Exception e){
            System.out.println(getName()+"- ip: "+ip+":"+port+" - недоступен");
        }
    }
}
