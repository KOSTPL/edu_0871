  
/*Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".
Подсказка: их 6 штук.
Каждую комбинацию вывести с новой строки. Слова не разделять.
Пример:
МылаРамуМама
РамуМамаМыла
...
Требования:
•	Программа должна выводить текст.
•	Выведенный текст должен содержать 6 строк.
•	Текст в каждой строке должен быть уникален.
•	Должны быть выведены все возможные комбинации. */
public class task_2_5 {
    public static void main(String[] args) {
        //напишите тут ваш код
//          String a = "Мама";
////        String b = "Мыла";
////        String c = "Раму";
////        System.out.println(a + b + c);
////        System.out.println(a + c + b);
////        System.out.println(b + a + c);
////        System.out.println(b + c + a);
////        System.out.println(c + a + b);
////        System.out.println(c + b + a);
////    }
////}
        String arr[] = new String[3];
        arr[0] = "Мама";
        arr[1] = "Мыла";
        arr[2] = "Раму";
        for (int a=0; a<=2;a++) {
            for (int b = 0; b <= 2; b++) {
                for (int c = 0; c <= 2; c++) {
                    if (a != b & a != b & a !=c & b != c)
                        System.out.println(arr[a] + arr[b] + arr[c]);
                }
            }
        }
    }
}
