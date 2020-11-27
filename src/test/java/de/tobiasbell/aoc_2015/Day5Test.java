package de.tobiasbell.aoc_2015;

import de.tobiasbell.aoc_2015.util.InputReader;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

class Day5Test {
    @Test
    void isNiceString() {
        assertThat(Day5.isNiceString("ugknbfddgicrmopn")).isTrue();
        assertThat(Day5.isNiceString("aaa")).isTrue();
        assertThat(Day5.isNiceString("jchzalrnumimnmhp")).isFalse();
        assertThat(Day5.isNiceString("haegwjzuvuyypxyu")).isFalse();
        assertThat(Day5.isNiceString("dvszwmarrgswjxmb")).isFalse();
    }

    @Test
    void solve1() throws IOException {
        assertThat(Day5.solve1(InputReader.getInput(5))).isEqualTo(238L);
    }
}