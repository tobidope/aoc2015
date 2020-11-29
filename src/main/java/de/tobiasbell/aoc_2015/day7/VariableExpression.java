package de.tobiasbell.aoc_2015.day7;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

@SuppressFBWarnings("EQ_UNUSUAL")
public record VariableExpression(Wire w) implements Expression {
    @Override
    public int evaluate() {
        return w.signal();
    }
}
