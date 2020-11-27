package de.tobiasbell.aoc_2015;

import java.util.stream.Stream;

public class Day5 {

    public static boolean isNiceString(final String input) {
        return atLeastThreeVowels(input)
                && twiceInRow(input)
                && doesNotHave(input, "ab", "cd", "pq", "xy");
    }

    private static boolean doesNotHave(String input, String... nots) {
        for (String not: nots) {
            if (input.contains(not)) {
                return false;
            }
        }
        return true;
    }

    private static boolean twiceInRow(String input) {
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }

    private static boolean atLeastThreeVowels(String input) {
        int vowelCount = 0;
        for (int i = 0; i < input.length(); i++) {
            final char c = input.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
            if (vowelCount == 3) {
                return true;
            }
        }
        return false;
    }

    public static long solve1(String input) {
        return Stream.of(input.split("\\R"))
                .filter(Day5::isNiceString)
                .count();
    }
}
