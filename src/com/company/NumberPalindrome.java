package com.company;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int num = number;

        while(num != 0) {

            int lastDigit = num % 10;

            reverse *= 10;

            reverse += lastDigit;

            num /= 10;

        }

        if(number == reverse)
            return true;
        else
            return false;

    }

}
