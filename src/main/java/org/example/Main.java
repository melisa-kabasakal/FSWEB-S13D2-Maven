package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));


    }

    public static boolean isPalindrome(int number) {
        int numbersOrgin = Math.abs(number);
        int backWards = 0;
        int numbersTwo = numbersOrgin;

        while (numbersTwo > 0) {
            int lastNumbers = (numbersTwo % 10);
            backWards = (backWards * 10) + lastNumbers;
            numbersTwo /= 10;
        }
        return numbersOrgin == backWards;
    }

    public static  boolean isPerfectNumber(int number) {
        if (number < 0) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;

            }
        }
        return  sum == number;
    }


}
