package de.tobiasbell.aoc_2015.day6;

import de.tobiasbell.aoc_2015.util.InputReader;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class Day6Test {

    @Test
    void parseInstruction() {
        assertThat(Instruction.parse("turn on 0,0 through 999,999", Command::of))
                .isEqualTo(new Instruction(
                        Command.TurnOn,
                        new Coordinate(0, 0),
                        new Coordinate(999, 999)));
    }

    @Test
    void evaluateBrigthness() {
        assertThat(Command.TurnOn.evaluate(Brightness.Off))
                .isEqualTo(Brightness.On);
        assertThat(Command.Toggle.evaluate(Brightness.Off))
                .isEqualTo(Brightness.On);
        assertThat(Command.Toggle.evaluate(Brightness.On))
                .isEqualTo(Brightness.Off);
    }

    @Test
    void createGrid() {
        final Instruction instruction = Instruction.parse("turn on 0,0 through 2,2", Command::of);
        final Map<Coordinate, Brightness> grid = Day6.createGrid(Collections.singletonList(instruction));

        assertThat(grid)
                .hasSize(9)
                .allSatisfy((coordinate, brightness) -> assertThat(brightness).isEqualTo(Brightness.On));
    }

    @Test
    void solve1() throws IOException {
        final String input = InputReader.getInput(6);
        assertThat(Day6.solve1(input)).isEqualTo(543903L);
    }

    @Test
    void solve2() throws IOException {
        final String input = InputReader.getInput(6);
        assertThat(Day6.solve2(input)).isEqualTo(14687245L);
    }

}