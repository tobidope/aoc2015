package de.tobiasbell.aoc_2015.day5;

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

    @Test
    void isNewNiceString() {
        assertThat(Day5.isNewNiceString("qjhvhtzxzqqjkmpb")).isTrue();
        assertThat(Day5.isNewNiceString("xxyxx")).isTrue();
        assertThat(Day5.isNewNiceString("uurcxstgmygtbstg")).isFalse();
        assertThat(Day5.isNewNiceString("ieodomkazucvgmuy")).isFalse();
    }

    @Test
    void solve2() throws IOException {
        assertThat(Day5.solve2(InputReader.getInput(5))).isEqualTo(69L);
    }
}