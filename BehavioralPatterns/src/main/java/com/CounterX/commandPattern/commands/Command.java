package com.CounterX.commandPattern.commands;

public interface Command {
    String execute(String text);
    String undo(String text);
}
