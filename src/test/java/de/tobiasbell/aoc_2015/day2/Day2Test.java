package de.tobiasbell.aoc_2015.day2;

import de.tobiasbell.aoc_2015.util.InputReader;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

class Day2Test {

    @Test
    void boxParsing() {
        assertThat(Day2.Box.of("2x3x4"))
                .isEqualTo(new Day2.Box(2, 3, 4));
    }

    @Test
    void surfaceArea() {
        final Day2.Box box = Day2.Box.of("2x3x4");
        assertThat(box.wrappingPaperNeeded()).isEqualTo(58);
    }

    @Test
    void solve1() throws IOException {
        assertThat(Day2.solve1(InputReader.getInput(2))).isEqualTo(1598415);
    }

    @Test
    void ribbonLength() {
        assertThat(Day2.Box.of("2x3x4").ribbonNeeded()).isEqualTo(34);
        assertThat(Day2.Box.of("1x1x10").ribbonNeeded()).isEqualTo(14);
    }

    @Test
    void solve2() throws IOException {
        assertThat(Day2.solve2(InputReader.getInput(2))).isEqualTo(3812909L);
    }
}