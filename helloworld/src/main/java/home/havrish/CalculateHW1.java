/*
Составить программу, которая будет разлаживать 5-ти значное число на отдельные цифры данного числа, слева-направо. Число задается в параметре статического метода.
Каждую цифру вывести в отдельной строке.
45685
4
5
6
8
5
 */

package home.havrish;

 class CalculateHW1 {
        public static void main(String[] args) {
            int number = 97641;
//          int current = number;
            while (number > 0) {
                System.out.println(number % 10);
                number /= 10;
            }
        }
    }