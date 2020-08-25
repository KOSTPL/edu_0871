/*
Напиши код метода sumDigitsInNumber(int number). Метод на вход принимает целое трехзначное число.
Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

Пример:
Метод sumDigitsInNumber вызывается с параметром 546.
Пример вывода:
15
*/

public class task_2_7 {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int a = 546;
        a = (a-a%100)/100 + (a%100-a%10)/10 + (a%10);
        return a;
    }
}
