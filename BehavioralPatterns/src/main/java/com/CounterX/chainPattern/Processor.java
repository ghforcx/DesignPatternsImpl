package com.CounterX.chainPattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Processor {
    private String name;
    private String pre;
    private String post;
    private String after;

    public void preProcess() {
        System.out.println("[" + name + "] [pre  ] " + pre);
    }

    public void postProcess() {
        System.out.println("[" + name + "] [post ] " + post);
    }

    public void afterProcess() {
        System.out.println("[" + name + "] [after] " + after);
    }
}
