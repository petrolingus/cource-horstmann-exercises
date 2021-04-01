package me.petrolingus.chapter01.task03;

import java.util.Scanner;

/**
 * <h1>Cay S. Horstmann: Core Java SE 9.</h1>
 *
 * <h2>Chapter 1. Task 3</h2>
 * <p>
 * Using only the conditional operator, write a program that reads three
 * integers and prints the largest. Repeat with Math.max.
 * </p>
 *
 * @author Lebedev Aleksandr
 *
 */
@SuppressWarnings("ManualMinMaxCalculation")
public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an A value: ");
        int a = scanner.nextInt();

        System.out.print("Enter a B value: ");
        int b = scanner.nextInt();

        System.out.print("Enter a C value: ");
        int c = scanner.nextInt();

        // Solution using a conditional operator
        int max1 = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;
        System.out.println("The max1 value is " + max1);

        // Solution using a conditional operator
        int max2 = Math.max(Math.max(a, b), c);
        System.out.println("The max2 value is " + max2);

    }
}
