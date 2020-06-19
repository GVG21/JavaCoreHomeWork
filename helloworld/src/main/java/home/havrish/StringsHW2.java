/*Напишите программу, в которой задаются данные(строки): имя, фамилия и отчество и  выводящую эти
данные в следующем виде:
********************************
*        Курс: Java core       *
*            Студент           *
*              ФИО             *
********************************
Необходимо, чтобы программа сама определяла нужную длину рамки. Сама же длина рамки зависит от длины
наибольшей строки внутри рамки. Используя циклы for легко можно выровнять стороны рамки.
"Строка".length()*/

package home.havrish;

import java.util.Scanner;

public class StringsHW2 {

    public static void main(String[] ags) {
        int length;
        String cursName = "Курс: Java core ";
        //length = cursName.length();
        String student = "Студент";
        //length = student.length();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        String name = in.nextLine();
        length = name.length();
        length = length + 4;
        printData(cursName, student, name, length);
    }

    public static void printData(String cursName, String student, String name, int length) {
        printFrame(length);
        System.out.print("*" + cursName);
        printSpaces(length - cursName.length());
        System.out.print("*" + student);
        printSpaces(length - student.length());
        System.out.print("*" + name);
        printSpaces(length - name.length());
        printFrame(length);
    }

    public static void printSpaces(int length) {
        for (int i = 0; i < length - 3; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
    }

    public static void printFrame(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}