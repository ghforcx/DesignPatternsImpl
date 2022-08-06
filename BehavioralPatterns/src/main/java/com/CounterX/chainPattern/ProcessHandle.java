package com.CounterX.chainPattern;

import com.CounterX.chainPattern.registers.Register;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ListIterator;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProcessHandle {
    private Register register;

    public void doProcess() {
        ListIterator<Processor> iter = register.getIterator();
        while (iter.hasNext()) {
            Processor now = iter.next();
            now.preProcess();
        }
        while (iter.hasPrevious()) {
            Processor now = iter.previous();
            now.postProcess();
            now.afterProcess();
        }
    }
}
