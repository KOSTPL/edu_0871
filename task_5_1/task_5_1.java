/*
Перед решением прочтите https://www.codeflow.site/ru/article/java-buffered-reader
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
Модернизация ПО
*/
public class task_5_1 {
    public static void main(String[] args) throws IOException {
        Map map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Введите город: ");
            String city = reader.readLine();
            if (city.isEmpty()) break;
            System.out.println("Введите фамилию семьи: ");
            String family = reader.readLine();
            if (family.isEmpty()) break;
                map.put(city, family);
            }
        System.out.println("Вы ввели все значения списка");
        System.out.println("Введите город, чтобы узнать какая семья в нем живет: ");

        String cityKey = reader.readLine(); 

        if (!cityKey.isEmpty()) {
            Object family = map.get(cityKey);
            System.out.println(family);
            }
        }
