/*
Написать программу решающую следующие уравнения. Переменные x,y,z,n инициализируется перед решением уравнения.
Каждое решение оформить в отдельном статическом методе.
x - (y + 123) / z * n  		=> считаем в long
(x + (50 - y * z) / n) - x 	=> считаем в int
x / (y * (z - 1) - 564) + n 	=> считаем в float
-x / -y + z / (n + 15) 		=> считаем в double
 */

package home.havrish;

public class EquationHW1 {

    public static void main (String[] ags) {
        System.out.println("long result " + first());
        System.out.println("int result " + second());
        System.out.println("float result " + third());
        System.out.println("double result " + fourth());
    }

    // x+(y-100)*z/n
    private static long first () {
         long x = 10;
         long y = 20;
         long z = 30;
         long n = 40;
         return (x + (y - 100)* z/n);
    }

    //(x-(50+y*z)*n)+x
    private static int second () {
        int x = 10;
        int y = 20;
        int z = 30;
        int n = 40;
        return (x - ((50 + (y * z)) * n)) + x;
    }

    //x*(y/(z-1)+555)-n
    private static float third () {
        float x = 10;
        float y = 20;
        float z = 30;
        float n = 40;
        return (x - ((50 + (y * z)) * n)) + x;
    }

    //-x/y+z*(n+1)
    private static double fourth () {
        double x = 10;
        double y = 20;
        double z = 30;
        double n = 40;
        return  (x - ((50 + (y * z)) * n)) + x;
    }
    }

