package de.tobiasbell.aoc_2015.day8;

import de.tobiasbell.aoc_2015.util.InputReader;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

class Day8Test {

    @ParameterizedTest(name = "String {0} has length {1} and in memory length {2}")
    @CsvSource({
            "\"\", 2, 0",
            "\"abc\", 5, 3",
            "\"aaa\\\"aaa\", 10, 7",
            "\"\\\", 3, 1",
            "\"\\x27\", 6, 1"
    })
    void inMemoryString(final String input, int length, int inMemoryLength) {
        assertThat(input.length()).isEqualTo(length);
        assertThat(Day8.inMemoryString(input).length()).isEqualTo(inMemoryLength);
    }

    @Test
    void solve1() throws IOException {
        assertThat(Day8.solve1(InputReader.getInput(8))).isEqualTo(1350L);
    }
}