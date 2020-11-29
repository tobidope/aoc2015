package de.tobiasbell.aoc_2015.day1;

import de.tobiasbell.aoc_2015.util.InputReader;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

class Day1Test {

    @Test
    void equalClosingAndOpeningBracesAreFloor0() {
        assertThat(Day1.solve1("(())")).isEqualTo(0);
        assertThat(Day1.solve1("(())")).isEqualTo(0);
    }

    @Test
    void aboveBasement() {
        assertThat(Day1.solve1("))(((((")).isEqualTo(3);
    }

    @Test
    void solveDay1_1() throws IOException {
        assertThat(Day1.solve1(InputReader.getInput(1))).isEqualTo(138);
    }

    @Test
    void findeBasement() {
        assertThat(Day1.solve2(")")).isEqualTo(1);
        assertThat(Day1.solve2("()())")).isEqualTo(5);
    }

    @Test
    void solveDay1_2() throws IOException {
        assertThat(Day1.solve2(InputReader.getInput(1))).isEqualTo(1771);
    }
}