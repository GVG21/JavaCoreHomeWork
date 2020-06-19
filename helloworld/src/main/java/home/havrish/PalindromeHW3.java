/*
Пользователь вводит последовательность символов.
Программа должна определить, является ли последовательность палиндромом.
Вывести ДА, если последовательность символов палиндром и НЕТ в противном случае.
 */

package home.havrish;

import java.util.*;
class PalindromeHW3
{
    public static void main(String args[])
    {
        String original, reverse = ""; // Objects of String class
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        original = in.nextLine();
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number isn't a palindrome.");
    }

    public static class palindrome1HW3 {
        public static void main(String args[]){
            int r,sum=0,temp;
            int n=454;

            temp=n;
            while(n>0){
                r=n%10;
                System.out.println("r =  " + r);
                sum=(sum*10)+r;
                System.out.println("sum =  " + sum);
                n=n/10;
                System.out.println("n =  " + n);
                System.out.println("temp =  " + temp);
            }
            if(temp==sum)
                System.out.println("palindrome number ");
            else
                System.out.println("not palindrome");
        }
    }
}