/* Написать функцию, которая вычисляет минимум из трёх чисел.
Требования:
•	Программа должна выводить текст на экран.
•	Метод min не должен выводить текст на экран.
•	Метод main должен вызвать метод min четыре раза.
•	Метод main должен выводить на экран результат работы метода min. Каждый раз с новой строки.
•	Метод min должен возвращать минимальное значение из чисел a, b и с.
*/
public class Min {
    public static int min(int a, int b, int c) {
//        напишите тут ваш код

          return (a<b)?((a<c)?a:c):((b<c)?b:c);// Решение с помощью тернального оператора

//        int x = (a <= b)?a:b;
//        return x;
//        int y = (x <= c?x:c);
//        return y;

//        if (x <= y)
//            return x;
//        else
//            return y;
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
        System.out.println(min(1,2,3));
    }
}
