package me.petrolingus.chapter01.task04;

import java.sql.SQLOutput;

/**
 * <h1>Cay S. Horstmann: Core Java SE 9.</h1>
 *
 * <h2>Chapter 1. Task 4</h2>
 * <p>
 * Write a program that prints the smallest and largest positive double values.
 * Hint: Look up Math.nextUp in the Java API.
 * </p>
 *
 * @author Lebedev Aleksandr
 *
 */
public class Solution {

    public static void main(String[] args) {

        double a = 0;
        System.out.println(Math.nextUp(a)); // 4.9E-324
        System.out.println(Double.MIN_VALUE); // 4.9E-324

        double b = Double.POSITIVE_INFINITY;
        System.out.println(Math.nextDown(b)); // 1.7976931348623157E308
        System.out.println(Double.MAX_VALUE); // 1.7976931348623157E308
    }
}
