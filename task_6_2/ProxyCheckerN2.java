package less_28_08_2020;

import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Arrays;
//////////////////////////////////////////Ошибки выдает программа - видимо не понимаю суть 2 способа, отсюда и ошибки
public class ProxyCheckerN2 {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("D://java/test.txt");
        int c;
        String ipList = "";
        while ((c=reader.read())!=-1){
            ipList += (char)c;
        }
        String[] ipListArray = ipList.split("\r");
        for (int i = 0; i < ipListArray.length; i++) {
            String[] splitString = ipListArray[i].split(":");
            String ip = splitString[0].trim();
            int port = Integer.parseInt(splitString[1]);
            Thread t1 = new Thread(new MyRunnableClass());
            Thread t2 = new Thread(new MyRunnableClass());
            t1.start();
            t2.start();
        }
    }
}


class MyRunnableClass {
    String ip;
    int port;

    public MyRunnableClass(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

    class MyRunnableClass implements Runnable {//подписываемся на обязательные к реализации методы интерфейса Runnable

        @Override
        public void run() {
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

                System.out.println("ip:" + ip + "+port" + " - ДОСТУПЕН");
            } catch (Exception e) {
                System.out.println("ip:" + ip + "+port" + " - недоступен");
            }
        }
    }
}
