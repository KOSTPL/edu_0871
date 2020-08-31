import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
//1. Ввести имя файла с консоли.
//2. Прочитать из него набор чисел.
//3. Вывести на консоль только четные, отсортированные по возрастанию.
//Пример ввода:
//5
//8
//-2
//11
//3
//-5
//2
//10
//Пример вывода:
//-2
//2
//8
//10
//*/
public class task_5_2 {
    public static void main(String[] args) throws IOException {

        // напишите тут ваш код D:\file\1.txt
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите ссылку на файл (пример D:/file/1.txt)");
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileInputStream(reader.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileInputStream fin = new FileInputStream("D:/file/1.txt");
        System.out.println("Список чисел из файла :");
        int i = -1;
        while ((i = fin.read()) != -1) {
            System.out.print((char) i);
        }
        fin.close();
        System.out.println("");

        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Список четных чисел в порядке возрастания из файла:");
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            if (x % 2 == 0) {
                arrayList.add(x);// собрали массив из четных чисел

                Collections.sort(arrayList); //сортировка методом Collections.sort arrayLis по возрастанию
                System.out.println(arrayList);
            }
        }
    }
}
