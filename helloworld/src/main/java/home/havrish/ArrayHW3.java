/*Пользователь задает длину массива (положительное число от 10 до 100).
Программа заполняет массив случайными числами. Выводит массив и все числа массива кратные 3-ем.
*/

package home.havrish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class ArrayHW3 {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите число массива");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numberForArrayStr = reader.readLine();
        int numberForArrayInt = Integer.parseInt(numberForArrayStr);
        int[] numbers = new int[numberForArrayInt];
        System.out.println("Данные краны 3:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (10 + (Math.random() * (100 - 10)));
//            if (numbers[i] % 3 == 0) { int i = 0;
//              numbers[numberForArrayInt] = (int) (9 + (Math.random() * (90 - 9)));
//            if (numbers[numberForArrayInt] % 3 == 0) {
//                System.out.println(Arrays.toString(numbers));}
//                    else if (numbers[i] % 3 == 0){
                        System.out.println(Arrays.toString(numbers));}

        }
    }


