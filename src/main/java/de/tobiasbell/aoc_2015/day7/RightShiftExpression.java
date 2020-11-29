package de.tobiasbell.aoc_2015.day7;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

@SuppressFBWarnings("EQ_UNUSUAL")
public record RightShiftExpression(Wire w, int shift) implements Expression {
    @Override
    public int evaluate() {
        return w.signal() >> shift;
    }
}
