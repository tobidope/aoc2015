package de.tobiasbell.aoc_2015.day6;

public interface LightCommand {
    Brightness evaluate(Brightness currentState);
}
