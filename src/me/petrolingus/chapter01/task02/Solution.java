package me.petrolingus.chapter01.task02;

import java.util.Scanner;

/**
 * Cay S. Horstmann: Core Java SE 9.
 *
 * Chapter 1. Task 2:
 * Write a program that reads an integer angle (which may be positive or
 * negative) and normalizes it to a value between 0 and 359 degrees. Try
 * it first with the % operator, then with floorMod.
 *
 * @author Lebedev Aleksandr
 *
 */
public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer angle in degrees: ");
        int angleInDegrees = scanner.nextInt();

        System.out.println("\nSolution with %");
        if (angleInDegrees < 0) {
            System.out.println(360 - Math.abs(angleInDegrees) % 360);
        } else {
            System.out.println(angleInDegrees % 360);
        }

        System.out.println("\nSolution with floorMod()");
        System.out.println(Math.floorMod(angleInDegrees, 360));
    }
}
