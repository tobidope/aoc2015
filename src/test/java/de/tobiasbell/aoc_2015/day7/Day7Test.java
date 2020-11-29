package de.tobiasbell.aoc_2015.day7;

import de.tobiasbell.aoc_2015.util.InputReader;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

class Day7Test {
    @Test
    void solve1() throws IOException {
        final long result = Day7.solve1(InputReader.getInput(7));
        assertThat(result).isEqualTo(16076L);
    }

    @Test
    void solve2() throws IOException {
        final long result = Day7.solve2(InputReader.getInput(7));
        assertThat(result).isEqualTo(2797L);
    }
}