package me.petrolingus.chapter01.task01;

import java.util.Scanner;

/**
 * Cay S. Horstmann: Core Java SE 9.
 *
 * Chapter 1. Task 1:
 * Write a program that reads an integer and prints it in binary, octal, and
 * hexadecimal. Print the reciprocal as a hexadecimal floating-point number.
 *
 * @author Lebedev Aleksandr
 */
public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int enteredValue = scanner.nextInt();

        // We can use wrap-classes for get answer
        String binaryString = Integer.toBinaryString(enteredValue);
        String octalString = Integer.toOctalString(enteredValue);
        String hexString = Integer.toHexString(enteredValue);

        String prefix = enteredValue  + " in ";

        System.out.println("\nWrap-classes:");
        System.out.println(prefix + "binary is 0b" + binaryString);
        System.out.println(prefix + "octal is 0" + octalString);
        System.out.println(prefix + "hexadecimal is 0x" + hexString);

        // But we can use System.out.printf() or String.format() for octal and hex
        System.out.println("\nSystem.out.printf():");
        System.out.printf(prefix + "octal is 0%o%n", enteredValue);
        System.out.printf(prefix + "hexadecimal is 0x%x%n", enteredValue);


        double reciprocal = 1.0 / enteredValue;
        System.out.println("\nPrint the reciprocal as a hexadecimal");
        System.out.println("with wrap-class:      " + Double.toHexString(reciprocal));
        System.out.println("with String.format(): " + String.format("%a", reciprocal));

    }
}
