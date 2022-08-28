package com.CounterX.commandPattern;

import com.CounterX.commandPattern.commands.*;

import java.util.*;

public class EditorDemo {

    private String content;
    private final Deque<Command> undoStack = new LinkedList<>();
    private final Deque<Command> redoStack = new LinkedList<>();

    public EditorDemo() {}
    public EditorDemo(String content) {
        this.content = content;
        show();
    }

    public void insert(int pos, String s) {
        Command command = new Insert(pos, s);
        content = command.execute(content);
        redoStack.clear();
        undoStack.push(command);
        show();
    }

    public void undo() {
        Command command = undoStack.pop();
        content = command.undo(content);
        redoStack.push(command);
        show();
    }

    public void redo() {
        Command command = redoStack.pop();
        content = command.execute(content);
        undoStack.push(command);
        show();
    }

    public void show() {
        System.out.println(content);
    }
}
