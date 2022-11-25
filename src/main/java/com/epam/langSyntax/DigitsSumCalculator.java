package com.epam.langSyntax;

public class DigitsSumCalculator {
    public static void calculateSum(int number) {
        int first = number % 10;
        number = (number - first)/10;
        int second = number % 10;
        number = (number - second)/10;
        int third = number % 10;
        int fourth = (number - third)/10;
        System.out.println(first+second+third+fourth);
    }

    public static void main(String[] args) {
        calculateSum(1111);
    }
}