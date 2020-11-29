package de.tobiasbell.aoc_2015.day1;

public class Day1 {

    public static long solve1(final String instructions) {
        return instructions.chars()
                .mapToLong(c -> c == '(' ? 1 : -1)
                .sum();
    }

    public static long solve2(String instructions) {
        for (int i = 1; i <= instructions.length(); i++) {
            final long postion = solve1(instructions.substring(0, i));
            if (postion == -1) {
                return i;
            }
        }
        throw new IllegalArgumentException("instructions don't reach the basement");
    }
}
