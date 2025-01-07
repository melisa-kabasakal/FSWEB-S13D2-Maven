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

        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
    }

    public static boolean isPalindrome(int number) {
        int numbers = Math.abs(number);
        int backWards = 0;
        int numbersTwo = numbers;

        while (numbersTwo > 0) {
            int lastNumbers = (numbersTwo % 10);
            backWards = (backWards * 10) + lastNumbers;
            numbersTwo /= 10;
        }
        return numbers == backWards;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 0) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;

            }
        }
        return sum == number;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        int reversedNumber = reverse(number);
        int originalDigitCount = getDigitCount(number);
        int reversedDigitCount = getDigitCount(reversedNumber);

        StringBuilder words = new StringBuilder();

        while (reversedNumber > 0) {
            int lastDigit = reversedNumber % 10;

            switch (lastDigit) {
                case 0 -> words.append("Zero ");
                case 1 -> words.append("One ");
                case 2 -> words.append("Two ");
                case 3 -> words.append("Three ");
                case 4 -> words.append("Four ");
                case 5 -> words.append("Five ");
                case 6 -> words.append("Six ");
                case 7 -> words.append("Seven ");
                case 8 -> words.append("Eight ");
                case 9 -> words.append("Nine ");
            }

            reversedNumber /= 10;
        }

        int missingZeros = originalDigitCount - reversedDigitCount;
        for (int i = 0; i < missingZeros; i++) {
            words.append("Zero ");
        }

        return words.toString().trim();
    }
    public static int reverse(int number) {
        int reversed = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reversed = (reversed * 10) + lastDigit;
            number /= 10;
        }
        return reversed;
    }
    public static int getDigitCount(int number) {
        if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

}
