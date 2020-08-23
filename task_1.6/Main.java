import java.util.Scanner;

/*
Пользователь вводит число, необходимо увеличить это число на 15% и вывести результат на экран
*/

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите целое число");
        int a = s.nextInt();
        System.out.println(a*1.15);
    }
}
