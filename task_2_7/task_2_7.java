import java.util.Scanner;

public class task_2_7 {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        System.out.println("Введите трехзначное число :");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        a = (a-a%100)/100 + (a%100-a%10)/10 + (a%10);
        return a;
    }
}
