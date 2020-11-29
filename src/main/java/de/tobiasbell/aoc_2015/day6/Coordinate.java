package de.tobiasbell.aoc_2015.day6;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

@SuppressFBWarnings("EQ_UNUSUAL")
public record Coordinate(int x, int y) {
    public static Coordinate parse(final String coordinate) {
        final String[] split = coordinate.split(",");
        return new Coordinate(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
    }
}
