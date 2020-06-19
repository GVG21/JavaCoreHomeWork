/*
Задача 2.
Пользователь вводит строку.
Программа разбивает строку на слова, и “переворачивает” каждое слово, формирует из новых слов предложение и выводит его на экран.
 */

package home.havrish;

import java.util.Scanner;

public class SplitHW3 {

    private static Object String;

    public static void main(String args[]) {
        String original;
        System.out.println("Введите значение: ");
        Scanner in = new Scanner(System.in);
        original = in.nextLine();
        System.out.println("Возвращаемое значение: ");
        for (String ignored : original.split("[A-Z]")) {
            //System.out.println(ignored);
            String a = ignored;
            String b = new StringBuffer(a).reverse().toString();
            System.out.print(b);

        }
    }
}

/*class Bishop  {
    public static  (String args[]) {
        StringBuffer buffer = new StringBuffer("Весёлое Программирование");
        buffer.reverse();
        System.out.println(buffer);
    }
}
}*/
