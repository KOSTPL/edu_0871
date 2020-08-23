/* Задача наполнить корабельный бассейн. Нужно посчитать, сколько литров воды нужно для заполнения бассейна до бортов.
Известно, что бассейн имеет линейные размеры a × b × c, заданные в метрах.
Эти размеры передаются запрашиваются у пользователя. Прграмма должена вывести на экран количество литров воды,
которое нужно для наполнения бассейна.
Пример:
Пользователь даёт числа 25, 5, 2.
Пример вывода:
250000 */

import java.util.Scanner;

public class swimmingpool {
    public static void main(String [] args){
        System.out.println("Бассейн имеет линейные размеры a × b × c - в метрах");
        System.out.println("Введите длину бассейна а и нажмите ввод");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("Введите ширину бассейна b и нажмите ввод");
        Scanner p = new Scanner(System.in);
        int b = p.nextInt();
        System.out.println("Введите высоту бассейна c и нажмите ввод");
        Scanner r = new Scanner(System.in);
        int c = r.nextInt();
        System.out.println("Необходимое количество литров воды для заполнения бассейна до бортов: "+ a*b*c*1000);
    }
}
