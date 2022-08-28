package com.CounterX.commandPattern.commands;

public class Insert implements Command {

    private final int pos;
    private final String content;

    public Insert(int pos, String content) {
        this.pos = pos;
        this.content = content;
    }

    @Override
    public String execute(String text) {
        return text.substring(0, pos) + content + text.substring(pos, text.length());
    }

    @Override
    public String undo(String text) {
        return text.substring(0, pos) + text.substring(pos + content.length(), text.length());
    }
}
