package de.tobiasbell.aoc_2015.day8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day8 {

    public static String inMemoryString(final String s) {
        return s
                .substring(Math.min(1, s.length()), Math.max(1, s.length() - 1))
                .replaceAll("\\\\([\"\\\\])", "$1")
                .replaceAll("\\\\x[a-f0-9]{2}", " ");
    }

    public static long solve1(final String input) {
        final List<String> strings = Arrays.stream(input.split("\\R"))
                .collect(Collectors.toList());
        return strings.stream()
                .mapToLong(String::length)
                .sum()
                -
                strings.stream()
                        .map(Day8::inMemoryString)
                        .mapToLong(String::length).sum();
    }

}
