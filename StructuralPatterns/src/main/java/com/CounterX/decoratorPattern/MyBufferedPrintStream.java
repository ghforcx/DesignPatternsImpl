package com.CounterX.decoratorPattern;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Locale;

public class MyBufferedPrintStream {

    private final PrintStream out;
    private final String[] buf;
    private int pos = 0;

    public MyBufferedPrintStream(PrintStream out, int bufSize) {
        this.out = out;
        buf = new String[bufSize];
    }

    public void println(Object obj) {
        String s = obj == null ? "null" : obj.toString();
        buf[pos++] = s;
        if (pos == buf.length) this.flush();
    }

    public void flush() {
        for (int i = 0; i < pos; i++) {
            out.println(buf[i]);
        }
        pos = 0;
    }

    public void close() {
        out.close();
    }
}
