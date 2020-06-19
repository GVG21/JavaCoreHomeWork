/*
Напишите программу, которая для 3-х координат вектора x, y, и z, с основанием у начала координат вычисляет единичный вектор и выводит его на консоль.
Для нахождения единичного вектора, нужно посчитать длину исходного вектора и разделить каждую из координат на его длину.
Длина вектора - Math.sqrt(X * X + Y * Y + Z * Z)
Пример:
Единичный вектор для вектора (5, 0, 0) => (1, 0, 0)
Каждая из программ должна быть реализована в отдельном классе с методом main.
 */

package home.havrish;

public class CoordinateVectorHW1 {
    public static void main (String[] args) {
        double x = 10;
        double y = 20;
        double z = 30;
        double b = 9;
        System.out.printf("sqrt(%.3f) = %.3f%n", x, Math.sqrt(x));
        System.out.printf("sqrt(%.3f) = %.3f%n", y, Math.sqrt(y));
        System.out.printf("sqrt(%.3f) = %.3f%n", z, Math.sqrt(z));
        System.out.printf("fff", b, Math.sqrt(b));


    }
}
