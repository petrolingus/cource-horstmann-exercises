package me.petrolingus.chapter01.task13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * <h1>Cay S. Horstmann: Core Java SE 9.</h1>
 *
 * <h2>Chapter 1. Task 6</h2>
 * <p>
 * Write a program that prints a lottery combination, picking six distinct
 * numbers between 1 and 49. To pick six distinct numbers, start with an
 * array list filled with 1...49. Pick a random index and remove the element.
 * Repeat six times. Print the result in sorted order.
 * </p>
 *
 * @author Lebedev Aleksandr
 */
public class Solution {

    public static void main(String[] args) {

        List<Integer> collect = IntStream.range(1, 50).boxed().collect(Collectors.toList());

        List<Integer> lotteryCombination = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            int index = (int) Math.floor((49 - i) * Math.random());
            lotteryCombination.add(collect.remove(index));
        }

        lotteryCombination.sort(Integer::compareTo);
        lotteryCombination.forEach(System.out::println);
    }
}
