package me.petrolingus.chapter01.task06;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * <h1>Cay S. Horstmann: Core Java SE 9.</h1>
 *
 * <h2>Chapter 1. Task 6</h2>
 * <p>
 * Write a program that computes the factorial n! = 1 × 2 × . . . × n, using
 * BigInteger. Compute the factorial of 1000. For 1000 an answer is equal 4,023872601e+10^2567 (Wiki).
 * </p>
 *
 * @author Lebedev Aleksandr
 *
 */
public class Solution {

    public static void main(String[] args) {

        int n = 1000;

        BigInteger a = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            BigInteger b = new BigInteger(Integer.toString(i));
            a = a.multiply(b);
        }

        BigDecimal decimal = new BigDecimal(a);
        System.out.printf("%g", decimal); // 4,02387e+2567
    }
}
