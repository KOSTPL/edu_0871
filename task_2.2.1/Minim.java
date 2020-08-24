// Решение с помощью тернального оператора
public class Minim {

    public static int min(int a, int b, int c, int d) {
        //напишите тут ваш код
        int x = min(a, b);
        int y = min(c, d);
//        if (x <= y)
//            return x;
//        else
//            return y;
        int mininum = (x <= y)?x:y;
        return mininum;
        }

    public static int min(int a, int b) {
        //напишите тут ваш код
//        if (a <= b)
//            return a;
//        else
//            return b;
        int minin = (a <= b)?a:b;
        return minin;
        //напишите тут ваш код
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        //System.out.println(min(-20, -10)if(a <= b)?return a:return b;);
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}
