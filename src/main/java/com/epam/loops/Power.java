package com.epam.loops;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int k = numberToPrint;
        for (int i = 1; i < power; i++) {
            k*=numberToPrint;
        }
        System.out.println(k);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}