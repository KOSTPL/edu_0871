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

/////////////////////////// вариант считывания из файла  (не понял как из scanner вытащить то что он считал из  с экрана ( D:/file/1.txt)
public class task_5_2 {
    public static void main(String[] args) throws IOException {

        // напишите тут ваш код D:\file\1.txt

        System.out.println("Введите ссылку на файл (пример D:/file/1.txt)");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        String file = reader.readLine();
        list.add(file);
//        Scanner scanner = null;
//        try {
//            scanner = new Scanner(new FileInputStream(reader.readLine()));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        FileInputStream fin = new FileInputStream(file);
        System.out.println("Список чисел из файла :");
        int i = -1;
        while ((i = fin.read()) != -1) {
            System.out.print((char) i);
        }
        fin.close();
        System.out.println();
/// далее  буду разбираться пока получил список из файла 5 -2 10 и тд
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        System.out.println("Список четных чисел в порядке возрастания из файла:");
//        while (list.hasNextInt()) {
//            int x = list.nextInt();
//            if (x % 2 == 0) {
//                list.add(x);// собрали массив из четных чисел

//                Collections.sort(list); //сортировка методом Collections.sort arrayLis по возрастанию
//                System.out.println(list);
//            }
//        }
    }
}
