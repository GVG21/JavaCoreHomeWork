/*Есть целое положительное число (long). Программа должна определить наименьшую и наибольшую цифры, которые входят в состав данного числа.
У числа 15875:
	Наименьшее число: 1
	Наибольшее число: 8
 */

package home.havrish;

public class LongHW2 {

    public static class SummMinMax {
        public static void main(String[] args) {
            // int n =  /*0,*/ 1;//,12, ;
            long n = 1231567892;
            long max, min, t = Math.abs(n);


            max = min = t % 10;
            System.out.println("max = " + max + " min =" + min);
            while (t > 0) {
                System.out.println("t value " + t);
                if (max < t % 10){max = t % 10;
                    System.out.println("set new max " + max);
                }
                if (min > t % 10) {min = t % 10;
                    System.out.println("set new min " + min);
                };
                t = t / 10;
            }

            System.out.println("max = " + max + " min =" + min);
            System.out.println("summ = " + (max + min));
        }
    }

}
