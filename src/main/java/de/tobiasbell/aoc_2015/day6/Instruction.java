package de.tobiasbell.aoc_2015.day6;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressFBWarnings("EQ_UNUSUAL")
public record Instruction(LightCommand command, Coordinate from, Coordinate to) {

    public static final Pattern INSTRUCTION_RE =
            Pattern.compile("(?<command>turn (?:on|off)|toggle) (?<from>\\d+,\\d+) through (?<to>\\d+,\\d+)");

    public static Instruction parse(final String instruction, Function<String, LightCommand> commandFactory) {
        final Matcher matcher = INSTRUCTION_RE.matcher(instruction);
        if (matcher.matches()) {
            final LightCommand command = commandFactory.apply(matcher.group("command"));
            final Coordinate from = Coordinate.parse(matcher.group("from"));
            final Coordinate to = Coordinate.parse(matcher.group("to"));
            return new Instruction(command, from, to);
        }
        throw new IllegalArgumentException("Unknown instruction: " + instruction);
    }
}
