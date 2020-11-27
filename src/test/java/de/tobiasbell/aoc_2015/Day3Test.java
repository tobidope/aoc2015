package de.tobiasbell.aoc_2015;

import de.tobiasbell.aoc_2015.util.InputReader;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Day3Test {

    @Test
    void moveParsing() {
        assertThat(Day3.Move.of('^')).isEqualTo(Day3.Move.NORTH);
        assertThrows(IllegalArgumentException.class, () -> Day3.Move.of(' '));
    }

    @Test
    void addPoints() {
        assertThat(Day3.Point.of(0, 0).add(Day3.Point.of(1, 1)))
                .isEqualTo(Day3.Point.of(1, 1));
    }

    @Test
    void visitedHouses() {
        assertThat(Day3.visitedHouses(">")).isEqualTo(2);
        assertThat(Day3.visitedHouses("^>v<")).isEqualTo(4);
        assertThat(Day3.visitedHouses("^v^v^v^v^v")).isEqualTo(2);
    }

    @Test
    void solve1() throws IOException {
        assertThat(Day3.visitedHouses(InputReader.getInput(3))).isEqualTo(2565);
    }

    @Test
    void solve2() throws IOException {
        assertThat(Day3.solve2(InputReader.getInput(3))).isEqualTo(2639);
    }
}